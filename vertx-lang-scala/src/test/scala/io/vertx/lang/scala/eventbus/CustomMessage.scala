package io.vertx.lang.scala.eventbus

/**
  * Custom message for example
  *
  * Copied from vertx-examples: https://github.com/vert-x3/vertx-examples/blob/master/core-examples/src/main/java/io/vertx/example/core/eventbus/messagecodec/util/CustomMessage.java
  *
  * @author Junbong
  */
class CustomMessage(val statusCode: Int, val resultCode: String, val summary: String) {
  override def toString: String = {
    val sb = new StringBuilder("CustomMessage{")
    sb.append("statusCode=").append(statusCode)
    sb.append(", resultCode='").append(resultCode).append('\'')
    sb.append(", summary='").append(summary).append('\'')
    sb.append('}')
    sb.toString
  }

  def getStatusCode: Int = statusCode

  def getResultCode: String = resultCode

  def getSummary: String = summary
}

