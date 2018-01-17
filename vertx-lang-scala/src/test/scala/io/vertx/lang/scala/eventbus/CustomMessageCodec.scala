package io.vertx.lang.scala.eventbus

import io.vertx.core.buffer.Buffer
import io.vertx.core.eventbus.MessageCodec
import io.vertx.core.json.JsonObject

/**
  * Vert.x core example for {@link io.vertx.core.eventbus.EventBus} and {@link MessageCodec}
  *
  * @author Junbong
  */
class CustomMessageCodec extends MessageCodec[CustomMessage, CustomMessage] {
  override def encodeToWire(buffer: Buffer, customMessage: CustomMessage): Unit = { // Easiest ways is using JSON object
    val jsonToEncode = new JsonObject
    jsonToEncode.put("statusCode", customMessage.getStatusCode)
    jsonToEncode.put("resultCode", customMessage.getResultCode)
    jsonToEncode.put("summary", customMessage.getSummary)
    // Encode object to string
    val jsonToStr = jsonToEncode.encode
    // Length of JSON: is NOT characters count
    val length = jsonToStr.getBytes.length
    // Write data into given buffer
    buffer.appendInt(length)
    buffer.appendString(jsonToStr)
  }

  override def decodeFromWire(position: Int, buffer: Buffer): CustomMessage = { // My custom message starting from this *position* of buffer
    // Length of JSON
    val length = buffer.getInt(position)
    // Get JSON string by it`s length
    // Jump 4 because getInt() == 4 bytes
    val jsonStr = buffer.getString(position + 4, position + 4 + length)
    val contentJson = new JsonObject(jsonStr)
    // Get fields
    val statusCode = contentJson.getInteger("statusCode")
    val resultCode = contentJson.getString("resultCode")
    val summary = contentJson.getString("summary")
    // We can finally create custom message object
    new CustomMessage(statusCode, resultCode, summary)
  }

  override def transform(customMessage: CustomMessage): CustomMessage = { // If a message is sent *locally* across the event bus.
    // This example sends message just as is
    customMessage
  }

  override def name: String = { // Each codec must have a unique name.
    // This is used to identify a codec when sending a message and for unregistering codecs.
    this.getClass.getSimpleName
  }

  override def systemCodecID: Byte = { // Always -1
    -1
  }
}

