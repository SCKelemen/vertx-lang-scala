package io.vertx.lang.scala.eventbus

import io.vertx.core.Vertx
import io.vertx.core.eventbus.impl.EventBusImpl
import io.vertx.scala.core.eventbus.EventBus
import io.vertx.core.impl.VertxInternal
import org.scalatest.concurrent.ScalaFutures.whenReady
import org.scalatest.{AsyncFlatSpec, FlatSpec, Matchers}

import scala.concurrent.Promise

class EventBusTest extends AsyncFlatSpec with Matchers{
  "EventBus" should "intercept messages if an interceptor was registered" in {
    val promise = Promise[String]
    val v:VertxInternal = Vertx.vertx().asInstanceOf[VertxInternal]
    val eventBusImpl = new EventBusImpl(v)
    val eventbus = EventBus(eventBusImpl)
    eventBusImpl.start({res => {
      eventbus.addInterceptor({sc => promise.success(sc.message().address()+"-"+sc.message().body().toString)})
      eventbus.send("address","body")
    }})
    whenReady(promise.future) {_ should equal("address-body")}
  }

  "EventBus" should "encode/decode a message using a custom codec" in {
    val promise = Promise[String]
    val v:VertxInternal = Vertx.vertx().asInstanceOf[VertxInternal]
    val eventBusImpl = new EventBusImpl(v)
    val eventbus = EventBus(eventBusImpl)
    val msg = new CustomMessage(1, "resultCode", "summary")
    eventBusImpl.start({res => {
      eventbus.registerDefaultCodec(classOf[CustomMessage], new CustomMessageCodec)
      eventbus.localConsumer[CustomMessage]("customMessageAddress").handler(msg => promise.success(msg.body().toString))
      eventbus.send("customMessageAddress", msg)
    }})
    whenReady(promise.future) {_ should equal(msg.toString)}
  }
}
