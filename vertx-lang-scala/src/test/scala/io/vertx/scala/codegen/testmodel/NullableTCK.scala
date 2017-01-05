/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.scala.codegen.testmodel

import scala.compat.java8.FunctionConverters._
import io.vertx.lang.scala.HandlerOps._
import io.vertx.lang.scala.Converter._
import scala.reflect.runtime.universe._
import io.vertx.lang.scala.Converter._
import io.vertx.lang.scala.AsyncResultWrapper
import io.vertx.core.json.JsonArray
import io.vertx.codegen.testmodel.{RefedInterface1 => JRefedInterface1}
import io.vertx.codegen.testmodel.TestEnum
import io.vertx.codegen.testmodel.{TestDataObject => JTestDataObject}
import io.vertx.codegen.testmodel.{NullableTCK => JNullableTCK}
import io.vertx.core.json.JsonObject
import io.vertx.core.AsyncResult
import scala.collection.JavaConverters._
import io.vertx.core.Handler
import io.vertx.codegen.testmodel.TestGenEnum

/**
  * The TCK for @Nullable.
  */
class NullableTCK(private val _asJava: Object) {

  def asJava = _asJava

  def methodWithNonNullableByteParam(param: Byte):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableByteParam(param.asInstanceOf[java.lang.Byte]).asInstanceOf[Boolean]
  }

  def methodWithNullableByteParam(expectNull: Boolean,param: scala.Option[Byte]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableByteParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(x => x.asInstanceOf[java.lang.Byte]).getOrElse(null))
  }

  def methodWithNullableByteHandler(notNull: Boolean,handler: Handler[Byte]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableByteHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.lang.Byte => handler.handle(x.asInstanceOf[Byte])})
  }

  def methodWithNullableByteHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[Byte]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableByteHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.lang.Byte] => handler.handle(AsyncResultWrapper[java.lang.Byte,Byte](x, a => a.asInstanceOf[Byte]))})
  }

  def methodWithNullableByteReturn(notNull: Boolean):scala.Option[Byte] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableByteReturn(notNull.asInstanceOf[java.lang.Boolean]).asInstanceOf[Byte])
  }

  def methodWithNonNullableShortParam(param: Short):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableShortParam(param.asInstanceOf[java.lang.Short]).asInstanceOf[Boolean]
  }

  def methodWithNullableShortParam(expectNull: Boolean,param: scala.Option[Short]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableShortParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(x => x.asInstanceOf[java.lang.Short]).getOrElse(null))
  }

  def methodWithNullableShortHandler(notNull: Boolean,handler: Handler[Short]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableShortHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.lang.Short => handler.handle(x.asInstanceOf[Short])})
  }

  def methodWithNullableShortHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[Short]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableShortHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.lang.Short] => handler.handle(AsyncResultWrapper[java.lang.Short,Short](x, a => a.asInstanceOf[Short]))})
  }

  def methodWithNullableShortReturn(notNull: Boolean):scala.Option[Short] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableShortReturn(notNull.asInstanceOf[java.lang.Boolean]).asInstanceOf[Short])
  }

  def methodWithNonNullableIntegerParam(param: Int):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableIntegerParam(param.asInstanceOf[java.lang.Integer]).asInstanceOf[Boolean]
  }

  def methodWithNullableIntegerParam(expectNull: Boolean,param: scala.Option[Int]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableIntegerParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(x => x.asInstanceOf[java.lang.Integer]).getOrElse(null))
  }

  def methodWithNullableIntegerHandler(notNull: Boolean,handler: Handler[Int]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableIntegerHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.lang.Integer => handler.handle(x.asInstanceOf[Int])})
  }

  def methodWithNullableIntegerHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[Int]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableIntegerHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.lang.Integer] => handler.handle(AsyncResultWrapper[java.lang.Integer,Int](x, a => a.asInstanceOf[Int]))})
  }

  def methodWithNullableIntegerReturn(notNull: Boolean):scala.Option[Int] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableIntegerReturn(notNull.asInstanceOf[java.lang.Boolean]).asInstanceOf[Int])
  }

  def methodWithNonNullableLongParam(param: Long):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableLongParam(param.asInstanceOf[java.lang.Long]).asInstanceOf[Boolean]
  }

  def methodWithNullableLongParam(expectNull: Boolean,param: scala.Option[Long]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableLongParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(x => x.asInstanceOf[java.lang.Long]).getOrElse(null))
  }

  def methodWithNullableLongHandler(notNull: Boolean,handler: Handler[Long]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableLongHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.lang.Long => handler.handle(x.asInstanceOf[Long])})
  }

  def methodWithNullableLongHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[Long]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableLongHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.lang.Long] => handler.handle(AsyncResultWrapper[java.lang.Long,Long](x, a => a.asInstanceOf[Long]))})
  }

  def methodWithNullableLongReturn(notNull: Boolean):scala.Option[Long] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableLongReturn(notNull.asInstanceOf[java.lang.Boolean]).asInstanceOf[Long])
  }

  def methodWithNonNullableFloatParam(param: Float):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableFloatParam(param.asInstanceOf[java.lang.Float]).asInstanceOf[Boolean]
  }

  def methodWithNullableFloatParam(expectNull: Boolean,param: scala.Option[Float]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableFloatParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(x => x.asInstanceOf[java.lang.Float]).getOrElse(null))
  }

  def methodWithNullableFloatHandler(notNull: Boolean,handler: Handler[Float]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableFloatHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.lang.Float => handler.handle(x.asInstanceOf[Float])})
  }

  def methodWithNullableFloatHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[Float]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableFloatHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.lang.Float] => handler.handle(AsyncResultWrapper[java.lang.Float,Float](x, a => a.asInstanceOf[Float]))})
  }

  def methodWithNullableFloatReturn(notNull: Boolean):scala.Option[Float] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableFloatReturn(notNull.asInstanceOf[java.lang.Boolean]).asInstanceOf[Float])
  }

  def methodWithNonNullableDoubleParam(param: Double):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableDoubleParam(param.asInstanceOf[java.lang.Double]).asInstanceOf[Boolean]
  }

  def methodWithNullableDoubleParam(expectNull: Boolean,param: scala.Option[Double]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableDoubleParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(x => x.asInstanceOf[java.lang.Double]).getOrElse(null))
  }

  def methodWithNullableDoubleHandler(notNull: Boolean,handler: Handler[Double]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableDoubleHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.lang.Double => handler.handle(x.asInstanceOf[Double])})
  }

  def methodWithNullableDoubleHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[Double]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableDoubleHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.lang.Double] => handler.handle(AsyncResultWrapper[java.lang.Double,Double](x, a => a.asInstanceOf[Double]))})
  }

  def methodWithNullableDoubleReturn(notNull: Boolean):scala.Option[Double] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableDoubleReturn(notNull.asInstanceOf[java.lang.Boolean]).asInstanceOf[Double])
  }

  def methodWithNonNullableBooleanParam(param: Boolean):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableBooleanParam(param.asInstanceOf[java.lang.Boolean]).asInstanceOf[Boolean]
  }

  def methodWithNullableBooleanParam(expectNull: Boolean,param: scala.Option[Boolean]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableBooleanParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(x => x.asInstanceOf[java.lang.Boolean]).getOrElse(null))
  }

  def methodWithNullableBooleanHandler(notNull: Boolean,handler: Handler[Boolean]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableBooleanHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.lang.Boolean => handler.handle(x.asInstanceOf[Boolean])})
  }

  def methodWithNullableBooleanHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[Boolean]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableBooleanHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.lang.Boolean] => handler.handle(AsyncResultWrapper[java.lang.Boolean,Boolean](x, a => a.asInstanceOf[Boolean]))})
  }

  def methodWithNullableBooleanReturn(notNull: Boolean):scala.Option[Boolean] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableBooleanReturn(notNull.asInstanceOf[java.lang.Boolean]).asInstanceOf[Boolean])
  }

  def methodWithNonNullableStringParam(param: String):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableStringParam(param.asInstanceOf[java.lang.String]).asInstanceOf[Boolean]
  }

  def methodWithNullableStringParam(expectNull: Boolean,param: scala.Option[String]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableStringParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(x => x.asInstanceOf[java.lang.String]).getOrElse(null))
  }

  def methodWithNullableStringHandler(notNull: Boolean,handler: Handler[String]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableStringHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.lang.String => handler.handle(x.asInstanceOf[String])})
  }

  def methodWithNullableStringHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[String]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableStringHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.lang.String] => handler.handle(AsyncResultWrapper[java.lang.String,String](x, a => a.asInstanceOf[String]))})
  }

  def methodWithNullableStringReturn(notNull: Boolean):scala.Option[String] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableStringReturn(notNull.asInstanceOf[java.lang.Boolean]).asInstanceOf[String])
  }

  def methodWithNonNullableCharParam(param: Char):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableCharParam(param.asInstanceOf[java.lang.Character]).asInstanceOf[Boolean]
  }

  def methodWithNullableCharParam(expectNull: Boolean,param: scala.Option[Char]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableCharParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(x => x.asInstanceOf[java.lang.Character]).getOrElse(null))
  }

  def methodWithNullableCharHandler(notNull: Boolean,handler: Handler[Char]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableCharHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.lang.Character => handler.handle(x.asInstanceOf[Char])})
  }

  def methodWithNullableCharHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[Char]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableCharHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.lang.Character] => handler.handle(AsyncResultWrapper[java.lang.Character,Char](x, a => a.asInstanceOf[Char]))})
  }

  def methodWithNullableCharReturn(notNull: Boolean):scala.Option[Char] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableCharReturn(notNull.asInstanceOf[java.lang.Boolean]).asInstanceOf[Char])
  }

  def methodWithNonNullableJsonObjectParam(param: io.vertx.core.json.JsonObject):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableJsonObjectParam(param).asInstanceOf[Boolean]
  }

  def methodWithNullableJsonObjectParam(expectNull: Boolean,param: scala.Option[io.vertx.core.json.JsonObject]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableJsonObjectParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(x => x).getOrElse(null))
  }

  def methodWithNullableJsonObjectHandler(notNull: Boolean,handler: Handler[io.vertx.core.json.JsonObject]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableJsonObjectHandler(notNull.asInstanceOf[java.lang.Boolean],{x: JsonObject => handler.handle(x)})
  }

  def methodWithNullableJsonObjectHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[io.vertx.core.json.JsonObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableJsonObjectHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[JsonObject] => handler.handle(AsyncResultWrapper[JsonObject,io.vertx.core.json.JsonObject](x, a => a))})
  }

  def methodWithNullableJsonObjectReturn(notNull: Boolean):scala.Option[io.vertx.core.json.JsonObject] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableJsonObjectReturn(notNull.asInstanceOf[java.lang.Boolean]))
  }

  def methodWithNonNullableJsonArrayParam(param: io.vertx.core.json.JsonArray):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableJsonArrayParam(param).asInstanceOf[Boolean]
  }

  def methodWithNullableJsonArrayParam(expectNull: Boolean,param: scala.Option[io.vertx.core.json.JsonArray]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableJsonArrayParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(x => x).getOrElse(null))
  }

  def methodWithNullableJsonArrayHandler(notNull: Boolean,handler: Handler[io.vertx.core.json.JsonArray]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableJsonArrayHandler(notNull.asInstanceOf[java.lang.Boolean],{x: JsonArray => handler.handle(x)})
  }

  def methodWithNullableJsonArrayHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[io.vertx.core.json.JsonArray]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableJsonArrayHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[JsonArray] => handler.handle(AsyncResultWrapper[JsonArray,io.vertx.core.json.JsonArray](x, a => a))})
  }

  def methodWithNullableJsonArrayReturn(notNull: Boolean):scala.Option[io.vertx.core.json.JsonArray] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableJsonArrayReturn(notNull.asInstanceOf[java.lang.Boolean]))
  }

  def methodWithNonNullableApiParam(param: RefedInterface1):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableApiParam(param.asJava.asInstanceOf[JRefedInterface1]).asInstanceOf[Boolean]
  }

  def methodWithNullableApiParam(expectNull: Boolean,param: scala.Option[RefedInterface1]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableApiParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.asJava.asInstanceOf[JRefedInterface1]).getOrElse(null))
  }

  def methodWithNullableApiHandler(notNull: Boolean,handler: Handler[RefedInterface1]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableApiHandler(notNull.asInstanceOf[java.lang.Boolean],{x: JRefedInterface1 => handler.handle(RefedInterface1(x))})
  }

  def methodWithNullableApiHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[RefedInterface1]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableApiHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[JRefedInterface1] => handler.handle(AsyncResultWrapper[JRefedInterface1,RefedInterface1](x, a => RefedInterface1(a)))})
  }

  def methodWithNullableApiReturn(notNull: Boolean):scala.Option[RefedInterface1] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableApiReturn(notNull.asInstanceOf[java.lang.Boolean])).map(RefedInterface1(_))
  }

  def methodWithNonNullableDataObjectParam(param: TestDataObject):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableDataObjectParam(param.asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableDataObjectParam(expectNull: Boolean,param: scala.Option[TestDataObject]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableDataObjectParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.asJava).getOrElse(null))
  }

  def methodWithNullableDataObjectHandler(notNull: Boolean,handler: Handler[TestDataObject]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableDataObjectHandler(notNull.asInstanceOf[java.lang.Boolean],{x: JTestDataObject => handler.handle(TestDataObject(x))})
  }

  def methodWithNullableDataObjectHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[TestDataObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableDataObjectHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[JTestDataObject] => handler.handle(AsyncResultWrapper[JTestDataObject,TestDataObject](x, a => TestDataObject(a)))})
  }

  def methodWithNullableDataObjectReturn(notNull: Boolean):scala.Option[TestDataObject] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableDataObjectReturn(notNull.asInstanceOf[java.lang.Boolean])).map(TestDataObject(_))
  }

  def methodWithNonNullableEnumParam(param: io.vertx.codegen.testmodel.TestEnum):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableEnumParam(param).asInstanceOf[Boolean]
  }

  def methodWithNullableEnumParam(expectNull: Boolean,param: scala.Option[io.vertx.codegen.testmodel.TestEnum]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableEnumParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(x => x).getOrElse(null))
  }

  def methodWithNullableEnumHandler(notNull: Boolean,handler: Handler[io.vertx.codegen.testmodel.TestEnum]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableEnumHandler(notNull.asInstanceOf[java.lang.Boolean],{x: TestEnum => handler.handle(x)})
  }

  def methodWithNullableEnumHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[io.vertx.codegen.testmodel.TestEnum]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableEnumHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[TestEnum] => handler.handle(AsyncResultWrapper[TestEnum,io.vertx.codegen.testmodel.TestEnum](x, a => a))})
  }

  def methodWithNullableEnumReturn(notNull: Boolean):scala.Option[io.vertx.codegen.testmodel.TestEnum] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableEnumReturn(notNull.asInstanceOf[java.lang.Boolean]))
  }

  def methodWithNonNullableGenEnumParam(param: io.vertx.codegen.testmodel.TestGenEnum):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableGenEnumParam(param).asInstanceOf[Boolean]
  }

  def methodWithNullableGenEnumParam(expectNull: Boolean,param: scala.Option[io.vertx.codegen.testmodel.TestGenEnum]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableGenEnumParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(x => x).getOrElse(null))
  }

  def methodWithNullableGenEnumHandler(notNull: Boolean,handler: Handler[io.vertx.codegen.testmodel.TestGenEnum]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableGenEnumHandler(notNull.asInstanceOf[java.lang.Boolean],{x: TestGenEnum => handler.handle(x)})
  }

  def methodWithNullableGenEnumHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[io.vertx.codegen.testmodel.TestGenEnum]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableGenEnumHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[TestGenEnum] => handler.handle(AsyncResultWrapper[TestGenEnum,io.vertx.codegen.testmodel.TestGenEnum](x, a => a))})
  }

  def methodWithNullableGenEnumReturn(notNull: Boolean):scala.Option[io.vertx.codegen.testmodel.TestGenEnum] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableGenEnumReturn(notNull.asInstanceOf[java.lang.Boolean]))
  }

  def methodWithNullableTypeVariableParam[T:TypeTag](expectNull: Boolean,param: T):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableTypeVariableParam[Object](expectNull.asInstanceOf[java.lang.Boolean],toJava[T](param))
  }

  def methodWithNullableTypeVariableHandler[T:TypeTag](notNull: Boolean,value: T,handler: Handler[T]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableTypeVariableHandler[Object](notNull.asInstanceOf[java.lang.Boolean],toJava[T](value),{x: Object => handler.handle(toScala[T](x))})
  }

  def methodWithNullableTypeVariableHandlerAsyncResult[T:TypeTag](notNull: Boolean,value: T,handler: Handler[AsyncResult[T]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableTypeVariableHandlerAsyncResult[Object](notNull.asInstanceOf[java.lang.Boolean],toJava[T](value),{x: AsyncResult[Object] => handler.handle(AsyncResultWrapper[Object,T](x, a => toScala[T](a)))})
  }

  def methodWithNullableTypeVariableReturn[T:TypeTag](notNull: Boolean,value: T):T = {
    toScala[T](asJava.asInstanceOf[JNullableTCK].methodWithNullableTypeVariableReturn[Object](notNull.asInstanceOf[java.lang.Boolean],toJava[T](value)))
  }

  def methodWithNullableObjectParam(expectNull: Boolean,param: AnyRef):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableObjectParam(expectNull.asInstanceOf[java.lang.Boolean],param)
  }

  def methodWithNonNullableListByteParam(param: scala.collection.mutable.Buffer[Byte]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableListByteParam(param.map(x => x.asInstanceOf[java.lang.Byte]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableListByteParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Buffer[Byte]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListByteParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.Byte]).asJava).getOrElse(null))
  }

  def methodWithNullableListByteHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Buffer[Byte]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListByteHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.List[java.lang.Byte] => handler.handle(x.asScala.map(x => x.asInstanceOf[Byte]))})
  }

  def methodWithNullableListByteHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Buffer[Byte]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListByteHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.List[java.lang.Byte]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.Byte],scala.collection.mutable.Buffer[Byte]](x, a => a.asScala.map(x => x.asInstanceOf[Byte])))})
  }

  def methodWithNullableListByteReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Buffer[Byte]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableListByteReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[Byte]))
  }

  def methodWithNonNullableListShortParam(param: scala.collection.mutable.Buffer[Short]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableListShortParam(param.map(x => x.asInstanceOf[java.lang.Short]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableListShortParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Buffer[Short]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListShortParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.Short]).asJava).getOrElse(null))
  }

  def methodWithNullableListShortHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Buffer[Short]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListShortHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.List[java.lang.Short] => handler.handle(x.asScala.map(x => x.asInstanceOf[Short]))})
  }

  def methodWithNullableListShortHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Buffer[Short]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListShortHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.List[java.lang.Short]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.Short],scala.collection.mutable.Buffer[Short]](x, a => a.asScala.map(x => x.asInstanceOf[Short])))})
  }

  def methodWithNullableListShortReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Buffer[Short]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableListShortReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[Short]))
  }

  def methodWithNonNullableListIntegerParam(param: scala.collection.mutable.Buffer[Int]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableListIntegerParam(param.map(x => x.asInstanceOf[java.lang.Integer]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableListIntegerParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Buffer[Int]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListIntegerParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.Integer]).asJava).getOrElse(null))
  }

  def methodWithNullableListIntegerHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Buffer[Int]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListIntegerHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.List[java.lang.Integer] => handler.handle(x.asScala.map(x => x.asInstanceOf[Int]))})
  }

  def methodWithNullableListIntegerHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Buffer[Int]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListIntegerHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.List[java.lang.Integer]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.Integer],scala.collection.mutable.Buffer[Int]](x, a => a.asScala.map(x => x.asInstanceOf[Int])))})
  }

  def methodWithNullableListIntegerReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Buffer[Int]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableListIntegerReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[Int]))
  }

  def methodWithNonNullableListLongParam(param: scala.collection.mutable.Buffer[Long]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableListLongParam(param.map(x => x.asInstanceOf[java.lang.Long]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableListLongParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Buffer[Long]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListLongParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.Long]).asJava).getOrElse(null))
  }

  def methodWithNullableListLongHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Buffer[Long]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListLongHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.List[java.lang.Long] => handler.handle(x.asScala.map(x => x.asInstanceOf[Long]))})
  }

  def methodWithNullableListLongHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Buffer[Long]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListLongHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.List[java.lang.Long]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.Long],scala.collection.mutable.Buffer[Long]](x, a => a.asScala.map(x => x.asInstanceOf[Long])))})
  }

  def methodWithNullableListLongReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Buffer[Long]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableListLongReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[Long]))
  }

  def methodWithNonNullableListFloatParam(param: scala.collection.mutable.Buffer[Float]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableListFloatParam(param.map(x => x.asInstanceOf[java.lang.Float]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableListFloatParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Buffer[Float]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListFloatParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.Float]).asJava).getOrElse(null))
  }

  def methodWithNullableListFloatHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Buffer[Float]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListFloatHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.List[java.lang.Float] => handler.handle(x.asScala.map(x => x.asInstanceOf[Float]))})
  }

  def methodWithNullableListFloatHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Buffer[Float]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListFloatHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.List[java.lang.Float]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.Float],scala.collection.mutable.Buffer[Float]](x, a => a.asScala.map(x => x.asInstanceOf[Float])))})
  }

  def methodWithNullableListFloatReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Buffer[Float]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableListFloatReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[Float]))
  }

  def methodWithNonNullableListDoubleParam(param: scala.collection.mutable.Buffer[Double]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableListDoubleParam(param.map(x => x.asInstanceOf[java.lang.Double]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableListDoubleParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Buffer[Double]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListDoubleParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.Double]).asJava).getOrElse(null))
  }

  def methodWithNullableListDoubleHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Buffer[Double]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListDoubleHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.List[java.lang.Double] => handler.handle(x.asScala.map(x => x.asInstanceOf[Double]))})
  }

  def methodWithNullableListDoubleHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Buffer[Double]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListDoubleHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.List[java.lang.Double]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.Double],scala.collection.mutable.Buffer[Double]](x, a => a.asScala.map(x => x.asInstanceOf[Double])))})
  }

  def methodWithNullableListDoubleReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Buffer[Double]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableListDoubleReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[Double]))
  }

  def methodWithNonNullableListBooleanParam(param: scala.collection.mutable.Buffer[Boolean]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableListBooleanParam(param.map(x => x.asInstanceOf[java.lang.Boolean]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableListBooleanParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Buffer[Boolean]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListBooleanParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.Boolean]).asJava).getOrElse(null))
  }

  def methodWithNullableListBooleanHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Buffer[Boolean]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListBooleanHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.List[java.lang.Boolean] => handler.handle(x.asScala.map(x => x.asInstanceOf[Boolean]))})
  }

  def methodWithNullableListBooleanHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Buffer[Boolean]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListBooleanHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.List[java.lang.Boolean]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.Boolean],scala.collection.mutable.Buffer[Boolean]](x, a => a.asScala.map(x => x.asInstanceOf[Boolean])))})
  }

  def methodWithNullableListBooleanReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Buffer[Boolean]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableListBooleanReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[Boolean]))
  }

  def methodWithNonNullableListStringParam(param: scala.collection.mutable.Buffer[String]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableListStringParam(param.map(x => x.asInstanceOf[java.lang.String]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableListStringParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Buffer[String]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListStringParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.String]).asJava).getOrElse(null))
  }

  def methodWithNullableListStringHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Buffer[String]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListStringHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.List[java.lang.String] => handler.handle(x.asScala.map(x => x.asInstanceOf[String]))})
  }

  def methodWithNullableListStringHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Buffer[String]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListStringHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.List[java.lang.String]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.String],scala.collection.mutable.Buffer[String]](x, a => a.asScala.map(x => x.asInstanceOf[String])))})
  }

  def methodWithNullableListStringReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Buffer[String]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableListStringReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[String]))
  }

  def methodWithNonNullableListCharParam(param: scala.collection.mutable.Buffer[Char]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableListCharParam(param.map(x => x.asInstanceOf[java.lang.Character]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableListCharParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Buffer[Char]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListCharParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.Character]).asJava).getOrElse(null))
  }

  def methodWithNullableListCharHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Buffer[Char]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListCharHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.List[java.lang.Character] => handler.handle(x.asScala.map(x => x.asInstanceOf[Char]))})
  }

  def methodWithNullableListCharHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Buffer[Char]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListCharHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.List[java.lang.Character]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.Character],scala.collection.mutable.Buffer[Char]](x, a => a.asScala.map(x => x.asInstanceOf[Char])))})
  }

  def methodWithNullableListCharReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Buffer[Char]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableListCharReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[Char]))
  }

  def methodWithNonNullableListJsonObjectParam(param: scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableListJsonObjectParam(param.map(x => x).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableListJsonObjectParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListJsonObjectParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x).asJava).getOrElse(null))
  }

  def methodWithNullableListJsonObjectHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListJsonObjectHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.List[JsonObject] => handler.handle(x.asScala.map(x => x))})
  }

  def methodWithNullableListJsonObjectHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListJsonObjectHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.List[JsonObject]] => handler.handle(AsyncResultWrapper[java.util.List[JsonObject],scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject]](x, a => a.asScala.map(x => x)))})
  }

  def methodWithNullableListJsonObjectReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableListJsonObjectReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x))
  }

  def methodWithNonNullableListJsonArrayParam(param: scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableListJsonArrayParam(param.map(x => x).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableListJsonArrayParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListJsonArrayParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x).asJava).getOrElse(null))
  }

  def methodWithNullableListJsonArrayHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListJsonArrayHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.List[JsonArray] => handler.handle(x.asScala.map(x => x))})
  }

  def methodWithNullableListJsonArrayHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListJsonArrayHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.List[JsonArray]] => handler.handle(AsyncResultWrapper[java.util.List[JsonArray],scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray]](x, a => a.asScala.map(x => x)))})
  }

  def methodWithNullableListJsonArrayReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableListJsonArrayReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x))
  }

  def methodWithNonNullableListApiParam(param: scala.collection.mutable.Buffer[RefedInterface1]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableListApiParam(param.map(x => x.asJava.asInstanceOf[JRefedInterface1]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableListApiParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Buffer[RefedInterface1]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListApiParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asJava.asInstanceOf[JRefedInterface1]).asJava).getOrElse(null))
  }

  def methodWithNullableListApiHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Buffer[RefedInterface1]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListApiHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.List[JRefedInterface1] => handler.handle(x.asScala.map(x => RefedInterface1(x)))})
  }

  def methodWithNullableListApiHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Buffer[RefedInterface1]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListApiHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.List[JRefedInterface1]] => handler.handle(AsyncResultWrapper[java.util.List[JRefedInterface1],scala.collection.mutable.Buffer[RefedInterface1]](x, a => a.asScala.map(x => RefedInterface1(x))))})
  }

  def methodWithNullableListApiReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Buffer[RefedInterface1]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableListApiReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => RefedInterface1(x)))
  }

  def methodWithNonNullableListDataObjectParam(param: scala.collection.mutable.Buffer[TestDataObject]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableListDataObjectParam(param.map(x => x.asJava).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableListDataObjectParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Buffer[TestDataObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListDataObjectParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asJava).asJava).getOrElse(null))
  }

  def methodWithNullableListDataObjectHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Buffer[TestDataObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListDataObjectHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.List[JTestDataObject] => handler.handle(x.asScala.map(x => TestDataObject(x)))})
  }

  def methodWithNullableListDataObjectHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Buffer[TestDataObject]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListDataObjectHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.List[JTestDataObject]] => handler.handle(AsyncResultWrapper[java.util.List[JTestDataObject],scala.collection.mutable.Buffer[TestDataObject]](x, a => a.asScala.map(x => TestDataObject(x))))})
  }

  def methodWithNullableListDataObjectReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Buffer[TestDataObject]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableListDataObjectReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => TestDataObject(x)))
  }

  def methodWithNonNullableListEnumParam(param: scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableListEnumParam(param.map(x => x).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableListEnumParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListEnumParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x).asJava).getOrElse(null))
  }

  def methodWithNullableListEnumHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListEnumHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.List[TestEnum] => handler.handle(x.asScala.map(x => x))})
  }

  def methodWithNullableListEnumHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListEnumHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.List[TestEnum]] => handler.handle(AsyncResultWrapper[java.util.List[TestEnum],scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]](x, a => a.asScala.map(x => x)))})
  }

  def methodWithNullableListEnumReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableListEnumReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x))
  }

  def methodWithNonNullableListGenEnumParam(param: scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableListGenEnumParam(param.map(x => x).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableListGenEnumParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListGenEnumParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x).asJava).getOrElse(null))
  }

  def methodWithNullableListGenEnumHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListGenEnumHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.List[TestGenEnum] => handler.handle(x.asScala.map(x => x))})
  }

  def methodWithNullableListGenEnumHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListGenEnumHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.List[TestGenEnum]] => handler.handle(AsyncResultWrapper[java.util.List[TestGenEnum],scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]](x, a => a.asScala.map(x => x)))})
  }

  def methodWithNullableListGenEnumReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableListGenEnumReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x))
  }

  def methodWithNonNullableSetByteParam(param: scala.collection.mutable.Set[Byte]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableSetByteParam(param.map(x => x.asInstanceOf[java.lang.Byte]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableSetByteParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Set[Byte]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetByteParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.Byte]).asJava).getOrElse(null))
  }

  def methodWithNullableSetByteHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Set[Byte]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetByteHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Set[java.lang.Byte] => handler.handle(x.asScala.map(x => x.asInstanceOf[Byte]))})
  }

  def methodWithNullableSetByteHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Set[Byte]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetByteHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Set[java.lang.Byte]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.Byte],scala.collection.mutable.Set[Byte]](x, a => a.asScala.map(x => x.asInstanceOf[Byte])))})
  }

  def methodWithNullableSetByteReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Set[Byte]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableSetByteReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[Byte]))
  }

  def methodWithNonNullableSetShortParam(param: scala.collection.mutable.Set[Short]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableSetShortParam(param.map(x => x.asInstanceOf[java.lang.Short]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableSetShortParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Set[Short]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetShortParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.Short]).asJava).getOrElse(null))
  }

  def methodWithNullableSetShortHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Set[Short]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetShortHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Set[java.lang.Short] => handler.handle(x.asScala.map(x => x.asInstanceOf[Short]))})
  }

  def methodWithNullableSetShortHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Set[Short]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetShortHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Set[java.lang.Short]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.Short],scala.collection.mutable.Set[Short]](x, a => a.asScala.map(x => x.asInstanceOf[Short])))})
  }

  def methodWithNullableSetShortReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Set[Short]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableSetShortReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[Short]))
  }

  def methodWithNonNullableSetIntegerParam(param: scala.collection.mutable.Set[Int]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableSetIntegerParam(param.map(x => x.asInstanceOf[java.lang.Integer]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableSetIntegerParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Set[Int]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetIntegerParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.Integer]).asJava).getOrElse(null))
  }

  def methodWithNullableSetIntegerHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Set[Int]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetIntegerHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Set[java.lang.Integer] => handler.handle(x.asScala.map(x => x.asInstanceOf[Int]))})
  }

  def methodWithNullableSetIntegerHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Set[Int]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetIntegerHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Set[java.lang.Integer]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.Integer],scala.collection.mutable.Set[Int]](x, a => a.asScala.map(x => x.asInstanceOf[Int])))})
  }

  def methodWithNullableSetIntegerReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Set[Int]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableSetIntegerReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[Int]))
  }

  def methodWithNonNullableSetLongParam(param: scala.collection.mutable.Set[Long]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableSetLongParam(param.map(x => x.asInstanceOf[java.lang.Long]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableSetLongParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Set[Long]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetLongParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.Long]).asJava).getOrElse(null))
  }

  def methodWithNullableSetLongHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Set[Long]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetLongHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Set[java.lang.Long] => handler.handle(x.asScala.map(x => x.asInstanceOf[Long]))})
  }

  def methodWithNullableSetLongHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Set[Long]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetLongHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Set[java.lang.Long]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.Long],scala.collection.mutable.Set[Long]](x, a => a.asScala.map(x => x.asInstanceOf[Long])))})
  }

  def methodWithNullableSetLongReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Set[Long]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableSetLongReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[Long]))
  }

  def methodWithNonNullableSetFloatParam(param: scala.collection.mutable.Set[Float]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableSetFloatParam(param.map(x => x.asInstanceOf[java.lang.Float]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableSetFloatParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Set[Float]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetFloatParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.Float]).asJava).getOrElse(null))
  }

  def methodWithNullableSetFloatHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Set[Float]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetFloatHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Set[java.lang.Float] => handler.handle(x.asScala.map(x => x.asInstanceOf[Float]))})
  }

  def methodWithNullableSetFloatHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Set[Float]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetFloatHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Set[java.lang.Float]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.Float],scala.collection.mutable.Set[Float]](x, a => a.asScala.map(x => x.asInstanceOf[Float])))})
  }

  def methodWithNullableSetFloatReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Set[Float]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableSetFloatReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[Float]))
  }

  def methodWithNonNullableSetDoubleParam(param: scala.collection.mutable.Set[Double]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableSetDoubleParam(param.map(x => x.asInstanceOf[java.lang.Double]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableSetDoubleParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Set[Double]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetDoubleParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.Double]).asJava).getOrElse(null))
  }

  def methodWithNullableSetDoubleHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Set[Double]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetDoubleHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Set[java.lang.Double] => handler.handle(x.asScala.map(x => x.asInstanceOf[Double]))})
  }

  def methodWithNullableSetDoubleHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Set[Double]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetDoubleHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Set[java.lang.Double]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.Double],scala.collection.mutable.Set[Double]](x, a => a.asScala.map(x => x.asInstanceOf[Double])))})
  }

  def methodWithNullableSetDoubleReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Set[Double]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableSetDoubleReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[Double]))
  }

  def methodWithNonNullableSetBooleanParam(param: scala.collection.mutable.Set[Boolean]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableSetBooleanParam(param.map(x => x.asInstanceOf[java.lang.Boolean]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableSetBooleanParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Set[Boolean]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetBooleanParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.Boolean]).asJava).getOrElse(null))
  }

  def methodWithNullableSetBooleanHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Set[Boolean]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetBooleanHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Set[java.lang.Boolean] => handler.handle(x.asScala.map(x => x.asInstanceOf[Boolean]))})
  }

  def methodWithNullableSetBooleanHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Set[Boolean]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetBooleanHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Set[java.lang.Boolean]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.Boolean],scala.collection.mutable.Set[Boolean]](x, a => a.asScala.map(x => x.asInstanceOf[Boolean])))})
  }

  def methodWithNullableSetBooleanReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Set[Boolean]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableSetBooleanReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[Boolean]))
  }

  def methodWithNonNullableSetStringParam(param: scala.collection.mutable.Set[String]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableSetStringParam(param.map(x => x.asInstanceOf[java.lang.String]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableSetStringParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Set[String]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetStringParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.String]).asJava).getOrElse(null))
  }

  def methodWithNullableSetStringHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Set[String]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetStringHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Set[java.lang.String] => handler.handle(x.asScala.map(x => x.asInstanceOf[String]))})
  }

  def methodWithNullableSetStringHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Set[String]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetStringHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Set[java.lang.String]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.String],scala.collection.mutable.Set[String]](x, a => a.asScala.map(x => x.asInstanceOf[String])))})
  }

  def methodWithNullableSetStringReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Set[String]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableSetStringReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[String]))
  }

  def methodWithNonNullableSetCharParam(param: scala.collection.mutable.Set[Char]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableSetCharParam(param.map(x => x.asInstanceOf[java.lang.Character]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableSetCharParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Set[Char]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetCharParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asInstanceOf[java.lang.Character]).asJava).getOrElse(null))
  }

  def methodWithNullableSetCharHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Set[Char]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetCharHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Set[java.lang.Character] => handler.handle(x.asScala.map(x => x.asInstanceOf[Char]))})
  }

  def methodWithNullableSetCharHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Set[Char]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetCharHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Set[java.lang.Character]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.Character],scala.collection.mutable.Set[Char]](x, a => a.asScala.map(x => x.asInstanceOf[Char])))})
  }

  def methodWithNullableSetCharReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Set[Char]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableSetCharReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x.asInstanceOf[Char]))
  }

  def methodWithNonNullableSetJsonObjectParam(param: scala.collection.mutable.Set[io.vertx.core.json.JsonObject]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableSetJsonObjectParam(param.map(x => x).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableSetJsonObjectParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Set[io.vertx.core.json.JsonObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetJsonObjectParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x).asJava).getOrElse(null))
  }

  def methodWithNullableSetJsonObjectHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Set[io.vertx.core.json.JsonObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetJsonObjectHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Set[JsonObject] => handler.handle(x.asScala.map(x => x))})
  }

  def methodWithNullableSetJsonObjectHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Set[io.vertx.core.json.JsonObject]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetJsonObjectHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Set[JsonObject]] => handler.handle(AsyncResultWrapper[java.util.Set[JsonObject],scala.collection.mutable.Set[io.vertx.core.json.JsonObject]](x, a => a.asScala.map(x => x)))})
  }

  def methodWithNullableSetJsonObjectReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Set[io.vertx.core.json.JsonObject]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableSetJsonObjectReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x))
  }

  def methodWithNonNullableSetJsonArrayParam(param: scala.collection.mutable.Set[io.vertx.core.json.JsonArray]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableSetJsonArrayParam(param.map(x => x).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableSetJsonArrayParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Set[io.vertx.core.json.JsonArray]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetJsonArrayParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x).asJava).getOrElse(null))
  }

  def methodWithNullableSetJsonArrayHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Set[io.vertx.core.json.JsonArray]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetJsonArrayHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Set[JsonArray] => handler.handle(x.asScala.map(x => x))})
  }

  def methodWithNullableSetJsonArrayHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Set[io.vertx.core.json.JsonArray]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetJsonArrayHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Set[JsonArray]] => handler.handle(AsyncResultWrapper[java.util.Set[JsonArray],scala.collection.mutable.Set[io.vertx.core.json.JsonArray]](x, a => a.asScala.map(x => x)))})
  }

  def methodWithNullableSetJsonArrayReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Set[io.vertx.core.json.JsonArray]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableSetJsonArrayReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x))
  }

  def methodWithNonNullableSetApiParam(param: scala.collection.mutable.Set[RefedInterface1]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableSetApiParam(param.map(x => x.asJava.asInstanceOf[JRefedInterface1]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableSetApiParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Set[RefedInterface1]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetApiParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asJava.asInstanceOf[JRefedInterface1]).asJava).getOrElse(null))
  }

  def methodWithNullableSetApiHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Set[RefedInterface1]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetApiHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Set[JRefedInterface1] => handler.handle(x.asScala.map(x => RefedInterface1(x)))})
  }

  def methodWithNullableSetApiHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Set[RefedInterface1]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetApiHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Set[JRefedInterface1]] => handler.handle(AsyncResultWrapper[java.util.Set[JRefedInterface1],scala.collection.mutable.Set[RefedInterface1]](x, a => a.asScala.map(x => RefedInterface1(x))))})
  }

  def methodWithNullableSetApiReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Set[RefedInterface1]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableSetApiReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => RefedInterface1(x)))
  }

  def methodWithNonNullableSetDataObjectParam(param: scala.collection.mutable.Set[TestDataObject]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableSetDataObjectParam(param.map(x => x.asJava).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableSetDataObjectParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Set[TestDataObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetDataObjectParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x.asJava).asJava).getOrElse(null))
  }

  def methodWithNullableSetDataObjectHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Set[TestDataObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetDataObjectHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Set[JTestDataObject] => handler.handle(x.asScala.map(x => TestDataObject(x)))})
  }

  def methodWithNullableSetDataObjectHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Set[TestDataObject]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetDataObjectHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Set[JTestDataObject]] => handler.handle(AsyncResultWrapper[java.util.Set[JTestDataObject],scala.collection.mutable.Set[TestDataObject]](x, a => a.asScala.map(x => TestDataObject(x))))})
  }

  def methodWithNullableSetDataObjectReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Set[TestDataObject]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableSetDataObjectReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => TestDataObject(x)))
  }

  def methodWithNonNullableSetEnumParam(param: scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableSetEnumParam(param.map(x => x).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableSetEnumParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetEnumParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x).asJava).getOrElse(null))
  }

  def methodWithNullableSetEnumHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetEnumHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Set[TestEnum] => handler.handle(x.asScala.map(x => x))})
  }

  def methodWithNullableSetEnumHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetEnumHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Set[TestEnum]] => handler.handle(AsyncResultWrapper[java.util.Set[TestEnum],scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum]](x, a => a.asScala.map(x => x)))})
  }

  def methodWithNullableSetEnumReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableSetEnumReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x))
  }

  def methodWithNonNullableSetGenEnumParam(param: scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableSetGenEnumParam(param.map(x => x).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableSetGenEnumParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetGenEnumParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.map(x => x).asJava).getOrElse(null))
  }

  def methodWithNullableSetGenEnumHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetGenEnumHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Set[TestGenEnum] => handler.handle(x.asScala.map(x => x))})
  }

  def methodWithNullableSetGenEnumHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetGenEnumHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Set[TestGenEnum]] => handler.handle(AsyncResultWrapper[java.util.Set[TestGenEnum],scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum]](x, a => a.asScala.map(x => x)))})
  }

  def methodWithNullableSetGenEnumReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableSetGenEnumReturn(notNull.asInstanceOf[java.lang.Boolean])).map(_.asScala.map(x => x))
  }

  def methodWithNonNullableMapByteParam(param: scala.collection.mutable.Map[String, Byte]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableMapByteParam(param.mapValues(x => x.asInstanceOf[java.lang.Byte]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableMapByteParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Map[String, Byte]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapByteParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.mapValues(x => x.asInstanceOf[java.lang.Byte]).asJava).getOrElse(null))
  }

  def methodWithNullableMapByteHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Map[String, Byte]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapByteHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Map[String, java.lang.Byte] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Byte]).toSeq: _*))})
  }

  def methodWithNullableMapByteHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Map[String, Byte]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapByteHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Map[String, java.lang.Byte]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.Byte],scala.collection.mutable.Map[String, Byte]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[Byte]).toSeq: _*)))})
  }

  def methodWithNullableMapByteReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Map[String, Byte]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableMapByteReturn(notNull.asInstanceOf[java.lang.Boolean])).map(x => collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Byte]).toSeq: _*))
  }

  def methodWithNonNullableMapShortParam(param: scala.collection.mutable.Map[String, Short]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableMapShortParam(param.mapValues(x => x.asInstanceOf[java.lang.Short]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableMapShortParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Map[String, Short]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapShortParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.mapValues(x => x.asInstanceOf[java.lang.Short]).asJava).getOrElse(null))
  }

  def methodWithNullableMapShortHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Map[String, Short]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapShortHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Map[String, java.lang.Short] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Short]).toSeq: _*))})
  }

  def methodWithNullableMapShortHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Map[String, Short]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapShortHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Map[String, java.lang.Short]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.Short],scala.collection.mutable.Map[String, Short]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[Short]).toSeq: _*)))})
  }

  def methodWithNullableMapShortReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Map[String, Short]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableMapShortReturn(notNull.asInstanceOf[java.lang.Boolean])).map(x => collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Short]).toSeq: _*))
  }

  def methodWithNonNullableMapIntegerParam(param: scala.collection.mutable.Map[String, Int]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableMapIntegerParam(param.mapValues(x => x.asInstanceOf[java.lang.Integer]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableMapIntegerParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Map[String, Int]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapIntegerParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.mapValues(x => x.asInstanceOf[java.lang.Integer]).asJava).getOrElse(null))
  }

  def methodWithNullableMapIntegerHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Map[String, Int]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapIntegerHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Map[String, java.lang.Integer] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Int]).toSeq: _*))})
  }

  def methodWithNullableMapIntegerHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Map[String, Int]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapIntegerHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Map[String, java.lang.Integer]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.Integer],scala.collection.mutable.Map[String, Int]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[Int]).toSeq: _*)))})
  }

  def methodWithNullableMapIntegerReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Map[String, Int]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableMapIntegerReturn(notNull.asInstanceOf[java.lang.Boolean])).map(x => collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Int]).toSeq: _*))
  }

  def methodWithNonNullableMapLongParam(param: scala.collection.mutable.Map[String, Long]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableMapLongParam(param.mapValues(x => x.asInstanceOf[java.lang.Long]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableMapLongParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Map[String, Long]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapLongParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.mapValues(x => x.asInstanceOf[java.lang.Long]).asJava).getOrElse(null))
  }

  def methodWithNullableMapLongHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Map[String, Long]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapLongHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Map[String, java.lang.Long] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Long]).toSeq: _*))})
  }

  def methodWithNullableMapLongHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Map[String, Long]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapLongHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Map[String, java.lang.Long]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.Long],scala.collection.mutable.Map[String, Long]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[Long]).toSeq: _*)))})
  }

  def methodWithNullableMapLongReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Map[String, Long]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableMapLongReturn(notNull.asInstanceOf[java.lang.Boolean])).map(x => collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Long]).toSeq: _*))
  }

  def methodWithNonNullableMapFloatParam(param: scala.collection.mutable.Map[String, Float]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableMapFloatParam(param.mapValues(x => x.asInstanceOf[java.lang.Float]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableMapFloatParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Map[String, Float]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapFloatParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.mapValues(x => x.asInstanceOf[java.lang.Float]).asJava).getOrElse(null))
  }

  def methodWithNullableMapFloatHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Map[String, Float]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapFloatHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Map[String, java.lang.Float] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Float]).toSeq: _*))})
  }

  def methodWithNullableMapFloatHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Map[String, Float]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapFloatHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Map[String, java.lang.Float]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.Float],scala.collection.mutable.Map[String, Float]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[Float]).toSeq: _*)))})
  }

  def methodWithNullableMapFloatReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Map[String, Float]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableMapFloatReturn(notNull.asInstanceOf[java.lang.Boolean])).map(x => collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Float]).toSeq: _*))
  }

  def methodWithNonNullableMapDoubleParam(param: scala.collection.mutable.Map[String, Double]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableMapDoubleParam(param.mapValues(x => x.asInstanceOf[java.lang.Double]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableMapDoubleParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Map[String, Double]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapDoubleParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.mapValues(x => x.asInstanceOf[java.lang.Double]).asJava).getOrElse(null))
  }

  def methodWithNullableMapDoubleHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Map[String, Double]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapDoubleHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Map[String, java.lang.Double] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Double]).toSeq: _*))})
  }

  def methodWithNullableMapDoubleHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Map[String, Double]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapDoubleHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Map[String, java.lang.Double]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.Double],scala.collection.mutable.Map[String, Double]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[Double]).toSeq: _*)))})
  }

  def methodWithNullableMapDoubleReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Map[String, Double]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableMapDoubleReturn(notNull.asInstanceOf[java.lang.Boolean])).map(x => collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Double]).toSeq: _*))
  }

  def methodWithNonNullableMapBooleanParam(param: scala.collection.mutable.Map[String, Boolean]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableMapBooleanParam(param.mapValues(x => x.asInstanceOf[java.lang.Boolean]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableMapBooleanParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Map[String, Boolean]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapBooleanParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.mapValues(x => x.asInstanceOf[java.lang.Boolean]).asJava).getOrElse(null))
  }

  def methodWithNullableMapBooleanHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Map[String, Boolean]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapBooleanHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Map[String, java.lang.Boolean] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Boolean]).toSeq: _*))})
  }

  def methodWithNullableMapBooleanHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Map[String, Boolean]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapBooleanHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Map[String, java.lang.Boolean]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.Boolean],scala.collection.mutable.Map[String, Boolean]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[Boolean]).toSeq: _*)))})
  }

  def methodWithNullableMapBooleanReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Map[String, Boolean]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableMapBooleanReturn(notNull.asInstanceOf[java.lang.Boolean])).map(x => collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Boolean]).toSeq: _*))
  }

  def methodWithNonNullableMapStringParam(param: scala.collection.mutable.Map[String, String]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableMapStringParam(param.mapValues(x => x.asInstanceOf[java.lang.String]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableMapStringParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Map[String, String]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapStringParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.mapValues(x => x.asInstanceOf[java.lang.String]).asJava).getOrElse(null))
  }

  def methodWithNullableMapStringHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Map[String, String]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapStringHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Map[String, java.lang.String] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[String]).toSeq: _*))})
  }

  def methodWithNullableMapStringHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Map[String, String]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapStringHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Map[String, java.lang.String]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.String],scala.collection.mutable.Map[String, String]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[String]).toSeq: _*)))})
  }

  def methodWithNullableMapStringReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Map[String, String]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableMapStringReturn(notNull.asInstanceOf[java.lang.Boolean])).map(x => collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[String]).toSeq: _*))
  }

  def methodWithNonNullableMapCharParam(param: scala.collection.mutable.Map[String, Char]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableMapCharParam(param.mapValues(x => x.asInstanceOf[java.lang.Character]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableMapCharParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Map[String, Char]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapCharParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.mapValues(x => x.asInstanceOf[java.lang.Character]).asJava).getOrElse(null))
  }

  def methodWithNullableMapCharHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Map[String, Char]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapCharHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Map[String, java.lang.Character] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Char]).toSeq: _*))})
  }

  def methodWithNullableMapCharHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Map[String, Char]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapCharHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Map[String, java.lang.Character]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.Character],scala.collection.mutable.Map[String, Char]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[Char]).toSeq: _*)))})
  }

  def methodWithNullableMapCharReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Map[String, Char]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableMapCharReturn(notNull.asInstanceOf[java.lang.Boolean])).map(x => collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Char]).toSeq: _*))
  }

  def methodWithNonNullableMapJsonObjectParam(param: scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableMapJsonObjectParam(param.mapValues(x => x).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableMapJsonObjectParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapJsonObjectParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.mapValues(x => x).asJava).getOrElse(null))
  }

  def methodWithNullableMapJsonObjectHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapJsonObjectHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Map[String, JsonObject] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x).toSeq: _*))})
  }

  def methodWithNullableMapJsonObjectHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapJsonObjectHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Map[String, JsonObject]] => handler.handle(AsyncResultWrapper[java.util.Map[String, JsonObject],scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x).toSeq: _*)))})
  }

  def methodWithNullableMapJsonObjectReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableMapJsonObjectReturn(notNull.asInstanceOf[java.lang.Boolean])).map(x => collection.mutable.Map(x.asScala.mapValues(x => x).toSeq: _*))
  }

  def methodWithNonNullableMapJsonArrayParam(param: scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableMapJsonArrayParam(param.mapValues(x => x).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableMapJsonArrayParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapJsonArrayParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.mapValues(x => x).asJava).getOrElse(null))
  }

  def methodWithNullableMapJsonArrayHandler(notNull: Boolean,handler: Handler[scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapJsonArrayHandler(notNull.asInstanceOf[java.lang.Boolean],{x: java.util.Map[String, JsonArray] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x).toSeq: _*))})
  }

  def methodWithNullableMapJsonArrayHandlerAsyncResult(notNull: Boolean,handler: Handler[AsyncResult[scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapJsonArrayHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.util.Map[String, JsonArray]] => handler.handle(AsyncResultWrapper[java.util.Map[String, JsonArray],scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x).toSeq: _*)))})
  }

  def methodWithNullableMapJsonArrayReturn(notNull: Boolean):scala.Option[scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray]] = {
    scala.Option(asJava.asInstanceOf[JNullableTCK].methodWithNullableMapJsonArrayReturn(notNull.asInstanceOf[java.lang.Boolean])).map(x => collection.mutable.Map(x.asScala.mapValues(x => x).toSeq: _*))
  }

  def methodWithNonNullableMapApiParam(param: scala.collection.mutable.Map[String, RefedInterface1]):Boolean = {
    asJava.asInstanceOf[JNullableTCK].methodWithNonNullableMapApiParam(param.mapValues(x => x.asJava.asInstanceOf[JRefedInterface1]).asJava).asInstanceOf[Boolean]
  }

  def methodWithNullableMapApiParam(expectNull: Boolean,param: scala.Option[scala.collection.mutable.Map[String, RefedInterface1]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapApiParam(expectNull.asInstanceOf[java.lang.Boolean],param.map(param => param.mapValues(x => x.asJava.asInstanceOf[JRefedInterface1]).asJava).getOrElse(null))
  }

  def methodWithListNullableByteParam(param: scala.collection.mutable.Buffer[Byte]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableByteParam(param.map(x => x.asInstanceOf[java.lang.Byte]).asJava)
  }

  def methodWithListNullableByteHandler(handler: Handler[scala.collection.mutable.Buffer[Byte]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableByteHandler({x: java.util.List[java.lang.Byte] => handler.handle(x.asScala.map(x => x.asInstanceOf[Byte]))})
  }

  def methodWithListNullableByteHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Buffer[Byte]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableByteHandlerAsyncResult({x: AsyncResult[java.util.List[java.lang.Byte]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.Byte],scala.collection.mutable.Buffer[Byte]](x, a => a.asScala.map(x => x.asInstanceOf[Byte])))})
  }

  def methodWithListNullableByteReturn():scala.collection.mutable.Buffer[Byte] = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableByteReturn().asScala.map(x => x.asInstanceOf[Byte])
  }

  def methodWithListNullableShortParam(param: scala.collection.mutable.Buffer[Short]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableShortParam(param.map(x => x.asInstanceOf[java.lang.Short]).asJava)
  }

  def methodWithListNullableShortHandler(handler: Handler[scala.collection.mutable.Buffer[Short]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableShortHandler({x: java.util.List[java.lang.Short] => handler.handle(x.asScala.map(x => x.asInstanceOf[Short]))})
  }

  def methodWithListNullableShortHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Buffer[Short]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableShortHandlerAsyncResult({x: AsyncResult[java.util.List[java.lang.Short]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.Short],scala.collection.mutable.Buffer[Short]](x, a => a.asScala.map(x => x.asInstanceOf[Short])))})
  }

  def methodWithListNullableShortReturn():scala.collection.mutable.Buffer[Short] = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableShortReturn().asScala.map(x => x.asInstanceOf[Short])
  }

  def methodWithListNullableIntegerParam(param: scala.collection.mutable.Buffer[Int]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableIntegerParam(param.map(x => x.asInstanceOf[java.lang.Integer]).asJava)
  }

  def methodWithListNullableIntegerHandler(handler: Handler[scala.collection.mutable.Buffer[Int]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableIntegerHandler({x: java.util.List[java.lang.Integer] => handler.handle(x.asScala.map(x => x.asInstanceOf[Int]))})
  }

  def methodWithListNullableIntegerHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Buffer[Int]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableIntegerHandlerAsyncResult({x: AsyncResult[java.util.List[java.lang.Integer]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.Integer],scala.collection.mutable.Buffer[Int]](x, a => a.asScala.map(x => x.asInstanceOf[Int])))})
  }

  def methodWithListNullableIntegerReturn():scala.collection.mutable.Buffer[Int] = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableIntegerReturn().asScala.map(x => x.asInstanceOf[Int])
  }

  def methodWithListNullableLongParam(param: scala.collection.mutable.Buffer[Long]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableLongParam(param.map(x => x.asInstanceOf[java.lang.Long]).asJava)
  }

  def methodWithListNullableLongHandler(handler: Handler[scala.collection.mutable.Buffer[Long]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableLongHandler({x: java.util.List[java.lang.Long] => handler.handle(x.asScala.map(x => x.asInstanceOf[Long]))})
  }

  def methodWithListNullableLongHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Buffer[Long]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableLongHandlerAsyncResult({x: AsyncResult[java.util.List[java.lang.Long]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.Long],scala.collection.mutable.Buffer[Long]](x, a => a.asScala.map(x => x.asInstanceOf[Long])))})
  }

  def methodWithListNullableLongReturn():scala.collection.mutable.Buffer[Long] = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableLongReturn().asScala.map(x => x.asInstanceOf[Long])
  }

  def methodWithListNullableBooleanParam(param: scala.collection.mutable.Buffer[Boolean]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableBooleanParam(param.map(x => x.asInstanceOf[java.lang.Boolean]).asJava)
  }

  def methodWithListNullableBooleanHandler(handler: Handler[scala.collection.mutable.Buffer[Boolean]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableBooleanHandler({x: java.util.List[java.lang.Boolean] => handler.handle(x.asScala.map(x => x.asInstanceOf[Boolean]))})
  }

  def methodWithListNullableBooleanHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Buffer[Boolean]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableBooleanHandlerAsyncResult({x: AsyncResult[java.util.List[java.lang.Boolean]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.Boolean],scala.collection.mutable.Buffer[Boolean]](x, a => a.asScala.map(x => x.asInstanceOf[Boolean])))})
  }

  def methodWithListNullableBooleanReturn():scala.collection.mutable.Buffer[Boolean] = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableBooleanReturn().asScala.map(x => x.asInstanceOf[Boolean])
  }

  def methodWithListNullableFloatParam(param: scala.collection.mutable.Buffer[Float]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableFloatParam(param.map(x => x.asInstanceOf[java.lang.Float]).asJava)
  }

  def methodWithListNullableFloatHandler(handler: Handler[scala.collection.mutable.Buffer[Float]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableFloatHandler({x: java.util.List[java.lang.Float] => handler.handle(x.asScala.map(x => x.asInstanceOf[Float]))})
  }

  def methodWithListNullableFloatHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Buffer[Float]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableFloatHandlerAsyncResult({x: AsyncResult[java.util.List[java.lang.Float]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.Float],scala.collection.mutable.Buffer[Float]](x, a => a.asScala.map(x => x.asInstanceOf[Float])))})
  }

  def methodWithListNullableFloatReturn():scala.collection.mutable.Buffer[Float] = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableFloatReturn().asScala.map(x => x.asInstanceOf[Float])
  }

  def methodWithListNullableDoubleParam(param: scala.collection.mutable.Buffer[Double]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableDoubleParam(param.map(x => x.asInstanceOf[java.lang.Double]).asJava)
  }

  def methodWithListNullableDoubleHandler(handler: Handler[scala.collection.mutable.Buffer[Double]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableDoubleHandler({x: java.util.List[java.lang.Double] => handler.handle(x.asScala.map(x => x.asInstanceOf[Double]))})
  }

  def methodWithListNullableDoubleHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Buffer[Double]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableDoubleHandlerAsyncResult({x: AsyncResult[java.util.List[java.lang.Double]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.Double],scala.collection.mutable.Buffer[Double]](x, a => a.asScala.map(x => x.asInstanceOf[Double])))})
  }

  def methodWithListNullableDoubleReturn():scala.collection.mutable.Buffer[Double] = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableDoubleReturn().asScala.map(x => x.asInstanceOf[Double])
  }

  def methodWithListNullableStringParam(param: scala.collection.mutable.Buffer[String]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableStringParam(param.map(x => x.asInstanceOf[java.lang.String]).asJava)
  }

  def methodWithListNullableStringHandler(handler: Handler[scala.collection.mutable.Buffer[String]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableStringHandler({x: java.util.List[java.lang.String] => handler.handle(x.asScala.map(x => x.asInstanceOf[String]))})
  }

  def methodWithListNullableStringHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Buffer[String]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableStringHandlerAsyncResult({x: AsyncResult[java.util.List[java.lang.String]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.String],scala.collection.mutable.Buffer[String]](x, a => a.asScala.map(x => x.asInstanceOf[String])))})
  }

  def methodWithListNullableStringReturn():scala.collection.mutable.Buffer[String] = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableStringReturn().asScala.map(x => x.asInstanceOf[String])
  }

  def methodWithListNullableCharParam(param: scala.collection.mutable.Buffer[Char]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableCharParam(param.map(x => x.asInstanceOf[java.lang.Character]).asJava)
  }

  def methodWithListNullableCharHandler(handler: Handler[scala.collection.mutable.Buffer[Char]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableCharHandler({x: java.util.List[java.lang.Character] => handler.handle(x.asScala.map(x => x.asInstanceOf[Char]))})
  }

  def methodWithListNullableCharHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Buffer[Char]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableCharHandlerAsyncResult({x: AsyncResult[java.util.List[java.lang.Character]] => handler.handle(AsyncResultWrapper[java.util.List[java.lang.Character],scala.collection.mutable.Buffer[Char]](x, a => a.asScala.map(x => x.asInstanceOf[Char])))})
  }

  def methodWithListNullableCharReturn():scala.collection.mutable.Buffer[Char] = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableCharReturn().asScala.map(x => x.asInstanceOf[Char])
  }

  def methodWithListNullableJsonObjectParam(param: scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableJsonObjectParam(param.map(x => x).asJava)
  }

  def methodWithListNullableJsonObjectHandler(handler: Handler[scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableJsonObjectHandler({x: java.util.List[JsonObject] => handler.handle(x.asScala.map(x => x))})
  }

  def methodWithListNullableJsonObjectHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableJsonObjectHandlerAsyncResult({x: AsyncResult[java.util.List[JsonObject]] => handler.handle(AsyncResultWrapper[java.util.List[JsonObject],scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject]](x, a => a.asScala.map(x => x)))})
  }

  def methodWithListNullableJsonObjectReturn():scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject] = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableJsonObjectReturn().asScala.map(x => x)
  }

  def methodWithListNullableJsonArrayParam(param: scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableJsonArrayParam(param.map(x => x).asJava)
  }

  def methodWithListNullableJsonArrayHandler(handler: Handler[scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableJsonArrayHandler({x: java.util.List[JsonArray] => handler.handle(x.asScala.map(x => x))})
  }

  def methodWithListNullableJsonArrayHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableJsonArrayHandlerAsyncResult({x: AsyncResult[java.util.List[JsonArray]] => handler.handle(AsyncResultWrapper[java.util.List[JsonArray],scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray]](x, a => a.asScala.map(x => x)))})
  }

  def methodWithListNullableJsonArrayReturn():scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray] = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableJsonArrayReturn().asScala.map(x => x)
  }

  def methodWithListNullableApiParam(param: scala.collection.mutable.Buffer[RefedInterface1]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableApiParam(param.map(x => x.asJava.asInstanceOf[JRefedInterface1]).asJava)
  }

  def methodWithListNullableApiHandler(handler: Handler[scala.collection.mutable.Buffer[RefedInterface1]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableApiHandler({x: java.util.List[JRefedInterface1] => handler.handle(x.asScala.map(x => RefedInterface1(x)))})
  }

  def methodWithListNullableApiHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Buffer[RefedInterface1]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableApiHandlerAsyncResult({x: AsyncResult[java.util.List[JRefedInterface1]] => handler.handle(AsyncResultWrapper[java.util.List[JRefedInterface1],scala.collection.mutable.Buffer[RefedInterface1]](x, a => a.asScala.map(x => RefedInterface1(x))))})
  }

  def methodWithListNullableApiReturn():scala.collection.mutable.Buffer[RefedInterface1] = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableApiReturn().asScala.map(x => RefedInterface1(x))
  }

  def methodWithListNullableDataObjectParam(param: scala.collection.mutable.Buffer[TestDataObject]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableDataObjectParam(param.map(x => x.asJava).asJava)
  }

  def methodWithListNullableDataObjectHandler(handler: Handler[scala.collection.mutable.Buffer[TestDataObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableDataObjectHandler({x: java.util.List[JTestDataObject] => handler.handle(x.asScala.map(x => TestDataObject(x)))})
  }

  def methodWithListNullableDataObjectHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Buffer[TestDataObject]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableDataObjectHandlerAsyncResult({x: AsyncResult[java.util.List[JTestDataObject]] => handler.handle(AsyncResultWrapper[java.util.List[JTestDataObject],scala.collection.mutable.Buffer[TestDataObject]](x, a => a.asScala.map(x => TestDataObject(x))))})
  }

  def methodWithListNullableDataObjectReturn():scala.collection.mutable.Buffer[TestDataObject] = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableDataObjectReturn().asScala.map(x => TestDataObject(x))
  }

  def methodWithListNullableEnumParam(param: scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableEnumParam(param.map(x => x).asJava)
  }

  def methodWithListNullableEnumHandler(handler: Handler[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableEnumHandler({x: java.util.List[TestEnum] => handler.handle(x.asScala.map(x => x))})
  }

  def methodWithListNullableEnumHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableEnumHandlerAsyncResult({x: AsyncResult[java.util.List[TestEnum]] => handler.handle(AsyncResultWrapper[java.util.List[TestEnum],scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]](x, a => a.asScala.map(x => x)))})
  }

  def methodWithListNullableEnumReturn():scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum] = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableEnumReturn().asScala.map(x => x)
  }

  def methodWithListNullableGenEnumParam(param: scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableGenEnumParam(param.map(x => x).asJava)
  }

  def methodWithListNullableGenEnumHandler(handler: Handler[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableGenEnumHandler({x: java.util.List[TestGenEnum] => handler.handle(x.asScala.map(x => x))})
  }

  def methodWithListNullableGenEnumHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableGenEnumHandlerAsyncResult({x: AsyncResult[java.util.List[TestGenEnum]] => handler.handle(AsyncResultWrapper[java.util.List[TestGenEnum],scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]](x, a => a.asScala.map(x => x)))})
  }

  def methodWithListNullableGenEnumReturn():scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum] = {
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableGenEnumReturn().asScala.map(x => x)
  }

  def methodWithSetNullableByteParam(param: scala.collection.mutable.Set[Byte]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableByteParam(param.map(x => x.asInstanceOf[java.lang.Byte]).asJava)
  }

  def methodWithSetNullableByteHandler(handler: Handler[scala.collection.mutable.Set[Byte]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableByteHandler({x: java.util.Set[java.lang.Byte] => handler.handle(x.asScala.map(x => x.asInstanceOf[Byte]))})
  }

  def methodWithSetNullableByteHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Set[Byte]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableByteHandlerAsyncResult({x: AsyncResult[java.util.Set[java.lang.Byte]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.Byte],scala.collection.mutable.Set[Byte]](x, a => a.asScala.map(x => x.asInstanceOf[Byte])))})
  }

  def methodWithSetNullableByteReturn():scala.collection.mutable.Set[Byte] = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableByteReturn().asScala.map(x => x.asInstanceOf[Byte])
  }

  def methodWithSetNullableShortParam(param: scala.collection.mutable.Set[Short]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableShortParam(param.map(x => x.asInstanceOf[java.lang.Short]).asJava)
  }

  def methodWithSetNullableShortHandler(handler: Handler[scala.collection.mutable.Set[Short]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableShortHandler({x: java.util.Set[java.lang.Short] => handler.handle(x.asScala.map(x => x.asInstanceOf[Short]))})
  }

  def methodWithSetNullableShortHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Set[Short]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableShortHandlerAsyncResult({x: AsyncResult[java.util.Set[java.lang.Short]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.Short],scala.collection.mutable.Set[Short]](x, a => a.asScala.map(x => x.asInstanceOf[Short])))})
  }

  def methodWithSetNullableShortReturn():scala.collection.mutable.Set[Short] = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableShortReturn().asScala.map(x => x.asInstanceOf[Short])
  }

  def methodWithSetNullableIntegerParam(param: scala.collection.mutable.Set[Int]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableIntegerParam(param.map(x => x.asInstanceOf[java.lang.Integer]).asJava)
  }

  def methodWithSetNullableIntegerHandler(handler: Handler[scala.collection.mutable.Set[Int]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableIntegerHandler({x: java.util.Set[java.lang.Integer] => handler.handle(x.asScala.map(x => x.asInstanceOf[Int]))})
  }

  def methodWithSetNullableIntegerHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Set[Int]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableIntegerHandlerAsyncResult({x: AsyncResult[java.util.Set[java.lang.Integer]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.Integer],scala.collection.mutable.Set[Int]](x, a => a.asScala.map(x => x.asInstanceOf[Int])))})
  }

  def methodWithSetNullableIntegerReturn():scala.collection.mutable.Set[Int] = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableIntegerReturn().asScala.map(x => x.asInstanceOf[Int])
  }

  def methodWithSetNullableLongParam(param: scala.collection.mutable.Set[Long]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableLongParam(param.map(x => x.asInstanceOf[java.lang.Long]).asJava)
  }

  def methodWithSetNullableLongHandler(handler: Handler[scala.collection.mutable.Set[Long]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableLongHandler({x: java.util.Set[java.lang.Long] => handler.handle(x.asScala.map(x => x.asInstanceOf[Long]))})
  }

  def methodWithSetNullableLongHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Set[Long]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableLongHandlerAsyncResult({x: AsyncResult[java.util.Set[java.lang.Long]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.Long],scala.collection.mutable.Set[Long]](x, a => a.asScala.map(x => x.asInstanceOf[Long])))})
  }

  def methodWithSetNullableLongReturn():scala.collection.mutable.Set[Long] = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableLongReturn().asScala.map(x => x.asInstanceOf[Long])
  }

  def methodWithSetNullableBooleanParam(param: scala.collection.mutable.Set[Boolean]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableBooleanParam(param.map(x => x.asInstanceOf[java.lang.Boolean]).asJava)
  }

  def methodWithSetNullableBooleanHandler(handler: Handler[scala.collection.mutable.Set[Boolean]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableBooleanHandler({x: java.util.Set[java.lang.Boolean] => handler.handle(x.asScala.map(x => x.asInstanceOf[Boolean]))})
  }

  def methodWithSetNullableBooleanHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Set[Boolean]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableBooleanHandlerAsyncResult({x: AsyncResult[java.util.Set[java.lang.Boolean]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.Boolean],scala.collection.mutable.Set[Boolean]](x, a => a.asScala.map(x => x.asInstanceOf[Boolean])))})
  }

  def methodWithSetNullableBooleanReturn():scala.collection.mutable.Set[Boolean] = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableBooleanReturn().asScala.map(x => x.asInstanceOf[Boolean])
  }

  def methodWithSetNullableFloatParam(param: scala.collection.mutable.Set[Float]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableFloatParam(param.map(x => x.asInstanceOf[java.lang.Float]).asJava)
  }

  def methodWithSetNullableFloatHandler(handler: Handler[scala.collection.mutable.Set[Float]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableFloatHandler({x: java.util.Set[java.lang.Float] => handler.handle(x.asScala.map(x => x.asInstanceOf[Float]))})
  }

  def methodWithSetNullableFloatHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Set[Float]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableFloatHandlerAsyncResult({x: AsyncResult[java.util.Set[java.lang.Float]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.Float],scala.collection.mutable.Set[Float]](x, a => a.asScala.map(x => x.asInstanceOf[Float])))})
  }

  def methodWithSetNullableFloatReturn():scala.collection.mutable.Set[Float] = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableFloatReturn().asScala.map(x => x.asInstanceOf[Float])
  }

  def methodWithSetNullableDoubleParam(param: scala.collection.mutable.Set[Double]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableDoubleParam(param.map(x => x.asInstanceOf[java.lang.Double]).asJava)
  }

  def methodWithSetNullableDoubleHandler(handler: Handler[scala.collection.mutable.Set[Double]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableDoubleHandler({x: java.util.Set[java.lang.Double] => handler.handle(x.asScala.map(x => x.asInstanceOf[Double]))})
  }

  def methodWithSetNullableDoubleHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Set[Double]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableDoubleHandlerAsyncResult({x: AsyncResult[java.util.Set[java.lang.Double]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.Double],scala.collection.mutable.Set[Double]](x, a => a.asScala.map(x => x.asInstanceOf[Double])))})
  }

  def methodWithSetNullableDoubleReturn():scala.collection.mutable.Set[Double] = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableDoubleReturn().asScala.map(x => x.asInstanceOf[Double])
  }

  def methodWithSetNullableStringParam(param: scala.collection.mutable.Set[String]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableStringParam(param.map(x => x.asInstanceOf[java.lang.String]).asJava)
  }

  def methodWithSetNullableStringHandler(handler: Handler[scala.collection.mutable.Set[String]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableStringHandler({x: java.util.Set[java.lang.String] => handler.handle(x.asScala.map(x => x.asInstanceOf[String]))})
  }

  def methodWithSetNullableStringHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Set[String]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableStringHandlerAsyncResult({x: AsyncResult[java.util.Set[java.lang.String]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.String],scala.collection.mutable.Set[String]](x, a => a.asScala.map(x => x.asInstanceOf[String])))})
  }

  def methodWithSetNullableStringReturn():scala.collection.mutable.Set[String] = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableStringReturn().asScala.map(x => x.asInstanceOf[String])
  }

  def methodWithSetNullableCharParam(param: scala.collection.mutable.Set[Char]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableCharParam(param.map(x => x.asInstanceOf[java.lang.Character]).asJava)
  }

  def methodWithSetNullableCharHandler(handler: Handler[scala.collection.mutable.Set[Char]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableCharHandler({x: java.util.Set[java.lang.Character] => handler.handle(x.asScala.map(x => x.asInstanceOf[Char]))})
  }

  def methodWithSetNullableCharHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Set[Char]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableCharHandlerAsyncResult({x: AsyncResult[java.util.Set[java.lang.Character]] => handler.handle(AsyncResultWrapper[java.util.Set[java.lang.Character],scala.collection.mutable.Set[Char]](x, a => a.asScala.map(x => x.asInstanceOf[Char])))})
  }

  def methodWithSetNullableCharReturn():scala.collection.mutable.Set[Char] = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableCharReturn().asScala.map(x => x.asInstanceOf[Char])
  }

  def methodWithSetNullableJsonObjectParam(param: scala.collection.mutable.Set[io.vertx.core.json.JsonObject]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableJsonObjectParam(param.map(x => x).asJava)
  }

  def methodWithSetNullableJsonObjectHandler(handler: Handler[scala.collection.mutable.Set[io.vertx.core.json.JsonObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableJsonObjectHandler({x: java.util.Set[JsonObject] => handler.handle(x.asScala.map(x => x))})
  }

  def methodWithSetNullableJsonObjectHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Set[io.vertx.core.json.JsonObject]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableJsonObjectHandlerAsyncResult({x: AsyncResult[java.util.Set[JsonObject]] => handler.handle(AsyncResultWrapper[java.util.Set[JsonObject],scala.collection.mutable.Set[io.vertx.core.json.JsonObject]](x, a => a.asScala.map(x => x)))})
  }

  def methodWithSetNullableJsonObjectReturn():scala.collection.mutable.Set[io.vertx.core.json.JsonObject] = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableJsonObjectReturn().asScala.map(x => x)
  }

  def methodWithSetNullableJsonArrayParam(param: scala.collection.mutable.Set[io.vertx.core.json.JsonArray]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableJsonArrayParam(param.map(x => x).asJava)
  }

  def methodWithSetNullableJsonArrayHandler(handler: Handler[scala.collection.mutable.Set[io.vertx.core.json.JsonArray]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableJsonArrayHandler({x: java.util.Set[JsonArray] => handler.handle(x.asScala.map(x => x))})
  }

  def methodWithSetNullableJsonArrayHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Set[io.vertx.core.json.JsonArray]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableJsonArrayHandlerAsyncResult({x: AsyncResult[java.util.Set[JsonArray]] => handler.handle(AsyncResultWrapper[java.util.Set[JsonArray],scala.collection.mutable.Set[io.vertx.core.json.JsonArray]](x, a => a.asScala.map(x => x)))})
  }

  def methodWithSetNullableJsonArrayReturn():scala.collection.mutable.Set[io.vertx.core.json.JsonArray] = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableJsonArrayReturn().asScala.map(x => x)
  }

  def methodWithSetNullableApiParam(param: scala.collection.mutable.Set[RefedInterface1]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableApiParam(param.map(x => x.asJava.asInstanceOf[JRefedInterface1]).asJava)
  }

  def methodWithSetNullableApiHandler(handler: Handler[scala.collection.mutable.Set[RefedInterface1]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableApiHandler({x: java.util.Set[JRefedInterface1] => handler.handle(x.asScala.map(x => RefedInterface1(x)))})
  }

  def methodWithSetNullableApiHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Set[RefedInterface1]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableApiHandlerAsyncResult({x: AsyncResult[java.util.Set[JRefedInterface1]] => handler.handle(AsyncResultWrapper[java.util.Set[JRefedInterface1],scala.collection.mutable.Set[RefedInterface1]](x, a => a.asScala.map(x => RefedInterface1(x))))})
  }

  def methodWithSetNullableApiReturn():scala.collection.mutable.Set[RefedInterface1] = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableApiReturn().asScala.map(x => RefedInterface1(x))
  }

  def methodWithSetNullableDataObjectParam(param: scala.collection.mutable.Set[TestDataObject]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableDataObjectParam(param.map(x => x.asJava).asJava)
  }

  def methodWithSetNullableDataObjectHandler(handler: Handler[scala.collection.mutable.Set[TestDataObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableDataObjectHandler({x: java.util.Set[JTestDataObject] => handler.handle(x.asScala.map(x => TestDataObject(x)))})
  }

  def methodWithSetNullableDataObjectHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Set[TestDataObject]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableDataObjectHandlerAsyncResult({x: AsyncResult[java.util.Set[JTestDataObject]] => handler.handle(AsyncResultWrapper[java.util.Set[JTestDataObject],scala.collection.mutable.Set[TestDataObject]](x, a => a.asScala.map(x => TestDataObject(x))))})
  }

  def methodWithSetNullableDataObjectReturn():scala.collection.mutable.Set[TestDataObject] = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableDataObjectReturn().asScala.map(x => TestDataObject(x))
  }

  def methodWithSetNullableEnumParam(param: scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableEnumParam(param.map(x => x).asJava)
  }

  def methodWithSetNullableEnumHandler(handler: Handler[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableEnumHandler({x: java.util.Set[TestEnum] => handler.handle(x.asScala.map(x => x))})
  }

  def methodWithSetNullableEnumHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableEnumHandlerAsyncResult({x: AsyncResult[java.util.Set[TestEnum]] => handler.handle(AsyncResultWrapper[java.util.Set[TestEnum],scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum]](x, a => a.asScala.map(x => x)))})
  }

  def methodWithSetNullableEnumReturn():scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum] = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableEnumReturn().asScala.map(x => x)
  }

  def methodWithSetNullableGenEnumParam(param: scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableGenEnumParam(param.map(x => x).asJava)
  }

  def methodWithSetNullableGenEnumHandler(handler: Handler[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableGenEnumHandler({x: java.util.Set[TestGenEnum] => handler.handle(x.asScala.map(x => x))})
  }

  def methodWithSetNullableGenEnumHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableGenEnumHandlerAsyncResult({x: AsyncResult[java.util.Set[TestGenEnum]] => handler.handle(AsyncResultWrapper[java.util.Set[TestGenEnum],scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum]](x, a => a.asScala.map(x => x)))})
  }

  def methodWithSetNullableGenEnumReturn():scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum] = {
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableGenEnumReturn().asScala.map(x => x)
  }

  def methodWithMapNullableByteParam(param: scala.collection.mutable.Map[String, Byte]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableByteParam(param.mapValues(x => x.asInstanceOf[java.lang.Byte]).asJava)
  }

  def methodWithMapNullableByteHandler(handler: Handler[scala.collection.mutable.Map[String, Byte]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableByteHandler({x: java.util.Map[String, java.lang.Byte] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Byte]).toSeq: _*))})
  }

  def methodWithMapNullableByteHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Map[String, Byte]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableByteHandlerAsyncResult({x: AsyncResult[java.util.Map[String, java.lang.Byte]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.Byte],scala.collection.mutable.Map[String, Byte]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[Byte]).toSeq: _*)))})
  }

  def methodWithMapNullableByteReturn():scala.collection.mutable.Map[String, Byte] = {
    collection.mutable.Map(asJava.asInstanceOf[JNullableTCK].methodWithMapNullableByteReturn().asScala.mapValues(x => x.asInstanceOf[Byte]).toSeq: _*)
  }

  def methodWithMapNullableShortParam(param: scala.collection.mutable.Map[String, Short]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableShortParam(param.mapValues(x => x.asInstanceOf[java.lang.Short]).asJava)
  }

  def methodWithMapNullableShortHandler(handler: Handler[scala.collection.mutable.Map[String, Short]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableShortHandler({x: java.util.Map[String, java.lang.Short] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Short]).toSeq: _*))})
  }

  def methodWithMapNullableShortHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Map[String, Short]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableShortHandlerAsyncResult({x: AsyncResult[java.util.Map[String, java.lang.Short]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.Short],scala.collection.mutable.Map[String, Short]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[Short]).toSeq: _*)))})
  }

  def methodWithMapNullableShortReturn():scala.collection.mutable.Map[String, Short] = {
    collection.mutable.Map(asJava.asInstanceOf[JNullableTCK].methodWithMapNullableShortReturn().asScala.mapValues(x => x.asInstanceOf[Short]).toSeq: _*)
  }

  def methodWithMapNullableIntegerParam(param: scala.collection.mutable.Map[String, Int]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableIntegerParam(param.mapValues(x => x.asInstanceOf[java.lang.Integer]).asJava)
  }

  def methodWithMapNullableIntegerHandler(handler: Handler[scala.collection.mutable.Map[String, Int]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableIntegerHandler({x: java.util.Map[String, java.lang.Integer] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Int]).toSeq: _*))})
  }

  def methodWithMapNullableIntegerHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Map[String, Int]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableIntegerHandlerAsyncResult({x: AsyncResult[java.util.Map[String, java.lang.Integer]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.Integer],scala.collection.mutable.Map[String, Int]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[Int]).toSeq: _*)))})
  }

  def methodWithMapNullableIntegerReturn():scala.collection.mutable.Map[String, Int] = {
    collection.mutable.Map(asJava.asInstanceOf[JNullableTCK].methodWithMapNullableIntegerReturn().asScala.mapValues(x => x.asInstanceOf[Int]).toSeq: _*)
  }

  def methodWithMapNullableLongParam(param: scala.collection.mutable.Map[String, Long]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableLongParam(param.mapValues(x => x.asInstanceOf[java.lang.Long]).asJava)
  }

  def methodWithMapNullableLongHandler(handler: Handler[scala.collection.mutable.Map[String, Long]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableLongHandler({x: java.util.Map[String, java.lang.Long] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Long]).toSeq: _*))})
  }

  def methodWithMapNullableLongHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Map[String, Long]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableLongHandlerAsyncResult({x: AsyncResult[java.util.Map[String, java.lang.Long]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.Long],scala.collection.mutable.Map[String, Long]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[Long]).toSeq: _*)))})
  }

  def methodWithMapNullableLongReturn():scala.collection.mutable.Map[String, Long] = {
    collection.mutable.Map(asJava.asInstanceOf[JNullableTCK].methodWithMapNullableLongReturn().asScala.mapValues(x => x.asInstanceOf[Long]).toSeq: _*)
  }

  def methodWithMapNullableBooleanParam(param: scala.collection.mutable.Map[String, Boolean]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableBooleanParam(param.mapValues(x => x.asInstanceOf[java.lang.Boolean]).asJava)
  }

  def methodWithMapNullableBooleanHandler(handler: Handler[scala.collection.mutable.Map[String, Boolean]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableBooleanHandler({x: java.util.Map[String, java.lang.Boolean] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Boolean]).toSeq: _*))})
  }

  def methodWithMapNullableBooleanHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Map[String, Boolean]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableBooleanHandlerAsyncResult({x: AsyncResult[java.util.Map[String, java.lang.Boolean]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.Boolean],scala.collection.mutable.Map[String, Boolean]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[Boolean]).toSeq: _*)))})
  }

  def methodWithMapNullableBooleanReturn():scala.collection.mutable.Map[String, Boolean] = {
    collection.mutable.Map(asJava.asInstanceOf[JNullableTCK].methodWithMapNullableBooleanReturn().asScala.mapValues(x => x.asInstanceOf[Boolean]).toSeq: _*)
  }

  def methodWithMapNullableFloatParam(param: scala.collection.mutable.Map[String, Float]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableFloatParam(param.mapValues(x => x.asInstanceOf[java.lang.Float]).asJava)
  }

  def methodWithMapNullableFloatHandler(handler: Handler[scala.collection.mutable.Map[String, Float]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableFloatHandler({x: java.util.Map[String, java.lang.Float] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Float]).toSeq: _*))})
  }

  def methodWithMapNullableFloatHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Map[String, Float]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableFloatHandlerAsyncResult({x: AsyncResult[java.util.Map[String, java.lang.Float]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.Float],scala.collection.mutable.Map[String, Float]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[Float]).toSeq: _*)))})
  }

  def methodWithMapNullableFloatReturn():scala.collection.mutable.Map[String, Float] = {
    collection.mutable.Map(asJava.asInstanceOf[JNullableTCK].methodWithMapNullableFloatReturn().asScala.mapValues(x => x.asInstanceOf[Float]).toSeq: _*)
  }

  def methodWithMapNullableDoubleParam(param: scala.collection.mutable.Map[String, Double]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableDoubleParam(param.mapValues(x => x.asInstanceOf[java.lang.Double]).asJava)
  }

  def methodWithMapNullableDoubleHandler(handler: Handler[scala.collection.mutable.Map[String, Double]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableDoubleHandler({x: java.util.Map[String, java.lang.Double] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Double]).toSeq: _*))})
  }

  def methodWithMapNullableDoubleHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Map[String, Double]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableDoubleHandlerAsyncResult({x: AsyncResult[java.util.Map[String, java.lang.Double]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.Double],scala.collection.mutable.Map[String, Double]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[Double]).toSeq: _*)))})
  }

  def methodWithMapNullableDoubleReturn():scala.collection.mutable.Map[String, Double] = {
    collection.mutable.Map(asJava.asInstanceOf[JNullableTCK].methodWithMapNullableDoubleReturn().asScala.mapValues(x => x.asInstanceOf[Double]).toSeq: _*)
  }

  def methodWithMapNullableStringParam(param: scala.collection.mutable.Map[String, String]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableStringParam(param.mapValues(x => x.asInstanceOf[java.lang.String]).asJava)
  }

  def methodWithMapNullableStringHandler(handler: Handler[scala.collection.mutable.Map[String, String]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableStringHandler({x: java.util.Map[String, java.lang.String] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[String]).toSeq: _*))})
  }

  def methodWithMapNullableStringHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Map[String, String]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableStringHandlerAsyncResult({x: AsyncResult[java.util.Map[String, java.lang.String]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.String],scala.collection.mutable.Map[String, String]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[String]).toSeq: _*)))})
  }

  def methodWithMapNullableStringReturn():scala.collection.mutable.Map[String, String] = {
    collection.mutable.Map(asJava.asInstanceOf[JNullableTCK].methodWithMapNullableStringReturn().asScala.mapValues(x => x.asInstanceOf[String]).toSeq: _*)
  }

  def methodWithMapNullableCharParam(param: scala.collection.mutable.Map[String, Char]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableCharParam(param.mapValues(x => x.asInstanceOf[java.lang.Character]).asJava)
  }

  def methodWithMapNullableCharHandler(handler: Handler[scala.collection.mutable.Map[String, Char]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableCharHandler({x: java.util.Map[String, java.lang.Character] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Char]).toSeq: _*))})
  }

  def methodWithMapNullableCharHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Map[String, Char]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableCharHandlerAsyncResult({x: AsyncResult[java.util.Map[String, java.lang.Character]] => handler.handle(AsyncResultWrapper[java.util.Map[String, java.lang.Character],scala.collection.mutable.Map[String, Char]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x.asInstanceOf[Char]).toSeq: _*)))})
  }

  def methodWithMapNullableCharReturn():scala.collection.mutable.Map[String, Char] = {
    collection.mutable.Map(asJava.asInstanceOf[JNullableTCK].methodWithMapNullableCharReturn().asScala.mapValues(x => x.asInstanceOf[Char]).toSeq: _*)
  }

  def methodWithMapNullableJsonObjectParam(param: scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableJsonObjectParam(param.mapValues(x => x).asJava)
  }

  def methodWithMapNullableJsonObjectHandler(handler: Handler[scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableJsonObjectHandler({x: java.util.Map[String, JsonObject] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x).toSeq: _*))})
  }

  def methodWithMapNullableJsonObjectHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableJsonObjectHandlerAsyncResult({x: AsyncResult[java.util.Map[String, JsonObject]] => handler.handle(AsyncResultWrapper[java.util.Map[String, JsonObject],scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x).toSeq: _*)))})
  }

  def methodWithMapNullableJsonObjectReturn():scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject] = {
    collection.mutable.Map(asJava.asInstanceOf[JNullableTCK].methodWithMapNullableJsonObjectReturn().asScala.mapValues(x => x).toSeq: _*)
  }

  def methodWithMapNullableJsonArrayParam(param: scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableJsonArrayParam(param.mapValues(x => x).asJava)
  }

  def methodWithMapNullableJsonArrayHandler(handler: Handler[scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableJsonArrayHandler({x: java.util.Map[String, JsonArray] => handler.handle(collection.mutable.Map(x.asScala.mapValues(x => x).toSeq: _*))})
  }

  def methodWithMapNullableJsonArrayHandlerAsyncResult(handler: Handler[AsyncResult[scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray]]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableJsonArrayHandlerAsyncResult({x: AsyncResult[java.util.Map[String, JsonArray]] => handler.handle(AsyncResultWrapper[java.util.Map[String, JsonArray],scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray]](x, a => collection.mutable.Map(a.asScala.mapValues(x => x).toSeq: _*)))})
  }

  def methodWithMapNullableJsonArrayReturn():scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray] = {
    collection.mutable.Map(asJava.asInstanceOf[JNullableTCK].methodWithMapNullableJsonArrayReturn().asScala.mapValues(x => x).toSeq: _*)
  }

  def methodWithMapNullableApiParam(param: scala.collection.mutable.Map[String, RefedInterface1]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableApiParam(param.mapValues(x => x.asJava.asInstanceOf[JRefedInterface1]).asJava)
  }

  def methodWithNullableHandler(expectNull: Boolean,handler: Handler[String]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableHandler(expectNull.asInstanceOf[java.lang.Boolean],{x: java.lang.String => handler.handle(x.asInstanceOf[String])})
  }

  def methodWithNullableHandlerAsyncResult(expectNull: Boolean,handler: Handler[AsyncResult[String]]):Unit = {
    asJava.asInstanceOf[JNullableTCK].methodWithNullableHandlerAsyncResult(expectNull.asInstanceOf[java.lang.Boolean],{x: AsyncResult[java.lang.String] => handler.handle(AsyncResultWrapper[java.lang.String,String](x, a => a.asInstanceOf[String]))})
  }

    def methodWithNullableByteHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[Byte] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Byte, Byte](x => if (x == null) null.asInstanceOf[Byte] else x.asInstanceOf[Byte])
    asJava.asInstanceOf[JNullableTCK].methodWithNullableByteHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableShortHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[Short] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Short, Short](x => if (x == null) null.asInstanceOf[Short] else x.asInstanceOf[Short])
    asJava.asInstanceOf[JNullableTCK].methodWithNullableShortHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableIntegerHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[Int] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Integer, Int](x => if (x == null) null.asInstanceOf[Int] else x.asInstanceOf[Int])
    asJava.asInstanceOf[JNullableTCK].methodWithNullableIntegerHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableLongHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[Long] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Long, Long](x => if (x == null) null.asInstanceOf[Long] else x.asInstanceOf[Long])
    asJava.asInstanceOf[JNullableTCK].methodWithNullableLongHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableFloatHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[Float] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Float, Float](x => if (x == null) null.asInstanceOf[Float] else x.asInstanceOf[Float])
    asJava.asInstanceOf[JNullableTCK].methodWithNullableFloatHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableDoubleHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[Double] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Double, Double](x => if (x == null) null.asInstanceOf[Double] else x.asInstanceOf[Double])
    asJava.asInstanceOf[JNullableTCK].methodWithNullableDoubleHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableBooleanHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[Boolean] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Boolean, Boolean](x => if (x == null) null.asInstanceOf[Boolean] else x.asInstanceOf[Boolean])
    asJava.asInstanceOf[JNullableTCK].methodWithNullableBooleanHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableStringHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[String] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.String, String](x => if (x == null) null.asInstanceOf[String] else x.asInstanceOf[String])
    asJava.asInstanceOf[JNullableTCK].methodWithNullableStringHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableCharHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[Char] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Character, Char](x => if (x == null) null.asInstanceOf[Char] else x.asInstanceOf[Char])
    asJava.asInstanceOf[JNullableTCK].methodWithNullableCharHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableJsonObjectHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[io.vertx.core.json.JsonObject] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[JsonObject, io.vertx.core.json.JsonObject](x => if (x == null) null.asInstanceOf[io.vertx.core.json.JsonObject] else x)
    asJava.asInstanceOf[JNullableTCK].methodWithNullableJsonObjectHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableJsonArrayHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[io.vertx.core.json.JsonArray] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[JsonArray, io.vertx.core.json.JsonArray](x => if (x == null) null.asInstanceOf[io.vertx.core.json.JsonArray] else x)
    asJava.asInstanceOf[JNullableTCK].methodWithNullableJsonArrayHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableApiHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[RefedInterface1] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[JRefedInterface1, RefedInterface1](x => if (x == null) null.asInstanceOf[RefedInterface1] else RefedInterface1(x))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableApiHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableDataObjectHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[TestDataObject] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[JTestDataObject, TestDataObject](x => if (x == null) null.asInstanceOf[TestDataObject] else TestDataObject(x))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableDataObjectHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableEnumHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[io.vertx.codegen.testmodel.TestEnum] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[TestEnum, io.vertx.codegen.testmodel.TestEnum](x => if (x == null) null.asInstanceOf[io.vertx.codegen.testmodel.TestEnum] else x)
    asJava.asInstanceOf[JNullableTCK].methodWithNullableEnumHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableGenEnumHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[io.vertx.codegen.testmodel.TestGenEnum] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[TestGenEnum, io.vertx.codegen.testmodel.TestGenEnum](x => if (x == null) null.asInstanceOf[io.vertx.codegen.testmodel.TestGenEnum] else x)
    asJava.asInstanceOf[JNullableTCK].methodWithNullableGenEnumHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableTypeVariableHandlerAsyncResultFuture[T:TypeTag](notNull: Boolean,value: T):scala.concurrent.Future[T] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[Object, T](x => if (x == null) null.asInstanceOf[T] else toScala[T](x))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableTypeVariableHandlerAsyncResult[Object](notNull.asInstanceOf[java.lang.Boolean],toJava[T](value),promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableListByteHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Buffer[Byte]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Byte], scala.collection.mutable.Buffer[Byte]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[Byte]] else x.asScala.map(x => x.asInstanceOf[Byte]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListByteHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableListShortHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Buffer[Short]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Short], scala.collection.mutable.Buffer[Short]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[Short]] else x.asScala.map(x => x.asInstanceOf[Short]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListShortHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableListIntegerHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Buffer[Int]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Integer], scala.collection.mutable.Buffer[Int]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[Int]] else x.asScala.map(x => x.asInstanceOf[Int]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListIntegerHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableListLongHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Buffer[Long]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Long], scala.collection.mutable.Buffer[Long]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[Long]] else x.asScala.map(x => x.asInstanceOf[Long]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListLongHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableListFloatHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Buffer[Float]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Float], scala.collection.mutable.Buffer[Float]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[Float]] else x.asScala.map(x => x.asInstanceOf[Float]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListFloatHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableListDoubleHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Buffer[Double]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Double], scala.collection.mutable.Buffer[Double]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[Double]] else x.asScala.map(x => x.asInstanceOf[Double]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListDoubleHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableListBooleanHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Buffer[Boolean]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Boolean], scala.collection.mutable.Buffer[Boolean]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[Boolean]] else x.asScala.map(x => x.asInstanceOf[Boolean]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListBooleanHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableListStringHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Buffer[String]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.String], scala.collection.mutable.Buffer[String]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[String]] else x.asScala.map(x => x.asInstanceOf[String]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListStringHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableListCharHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Buffer[Char]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Character], scala.collection.mutable.Buffer[Char]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[Char]] else x.asScala.map(x => x.asInstanceOf[Char]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListCharHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableListJsonObjectHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[JsonObject], scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject]] else x.asScala.map(x => x))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListJsonObjectHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableListJsonArrayHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[JsonArray], scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray]] else x.asScala.map(x => x))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListJsonArrayHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableListApiHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Buffer[RefedInterface1]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[JRefedInterface1], scala.collection.mutable.Buffer[RefedInterface1]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[RefedInterface1]] else x.asScala.map(x => RefedInterface1(x)))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListApiHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableListDataObjectHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Buffer[TestDataObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[JTestDataObject], scala.collection.mutable.Buffer[TestDataObject]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[TestDataObject]] else x.asScala.map(x => TestDataObject(x)))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListDataObjectHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableListEnumHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[TestEnum], scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]] else x.asScala.map(x => x))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListEnumHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableListGenEnumHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[TestGenEnum], scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]] else x.asScala.map(x => x))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableListGenEnumHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableSetByteHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Set[Byte]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Byte], scala.collection.mutable.Set[Byte]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[Byte]] else x.asScala.map(x => x.asInstanceOf[Byte]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetByteHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableSetShortHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Set[Short]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Short], scala.collection.mutable.Set[Short]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[Short]] else x.asScala.map(x => x.asInstanceOf[Short]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetShortHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableSetIntegerHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Set[Int]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Integer], scala.collection.mutable.Set[Int]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[Int]] else x.asScala.map(x => x.asInstanceOf[Int]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetIntegerHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableSetLongHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Set[Long]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Long], scala.collection.mutable.Set[Long]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[Long]] else x.asScala.map(x => x.asInstanceOf[Long]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetLongHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableSetFloatHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Set[Float]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Float], scala.collection.mutable.Set[Float]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[Float]] else x.asScala.map(x => x.asInstanceOf[Float]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetFloatHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableSetDoubleHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Set[Double]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Double], scala.collection.mutable.Set[Double]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[Double]] else x.asScala.map(x => x.asInstanceOf[Double]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetDoubleHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableSetBooleanHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Set[Boolean]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Boolean], scala.collection.mutable.Set[Boolean]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[Boolean]] else x.asScala.map(x => x.asInstanceOf[Boolean]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetBooleanHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableSetStringHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Set[String]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.String], scala.collection.mutable.Set[String]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[String]] else x.asScala.map(x => x.asInstanceOf[String]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetStringHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableSetCharHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Set[Char]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Character], scala.collection.mutable.Set[Char]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[Char]] else x.asScala.map(x => x.asInstanceOf[Char]))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetCharHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableSetJsonObjectHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Set[io.vertx.core.json.JsonObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[JsonObject], scala.collection.mutable.Set[io.vertx.core.json.JsonObject]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[io.vertx.core.json.JsonObject]] else x.asScala.map(x => x))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetJsonObjectHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableSetJsonArrayHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Set[io.vertx.core.json.JsonArray]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[JsonArray], scala.collection.mutable.Set[io.vertx.core.json.JsonArray]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[io.vertx.core.json.JsonArray]] else x.asScala.map(x => x))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetJsonArrayHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableSetApiHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Set[RefedInterface1]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[JRefedInterface1], scala.collection.mutable.Set[RefedInterface1]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[RefedInterface1]] else x.asScala.map(x => RefedInterface1(x)))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetApiHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableSetDataObjectHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Set[TestDataObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[JTestDataObject], scala.collection.mutable.Set[TestDataObject]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[TestDataObject]] else x.asScala.map(x => TestDataObject(x)))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetDataObjectHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableSetEnumHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[TestEnum], scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum]] else x.asScala.map(x => x))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetEnumHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableSetGenEnumHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[TestGenEnum], scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum]] else x.asScala.map(x => x))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableSetGenEnumHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableMapByteHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Map[String, Byte]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.Byte], scala.collection.mutable.Map[String, Byte]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, Byte]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Byte]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapByteHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableMapShortHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Map[String, Short]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.Short], scala.collection.mutable.Map[String, Short]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, Short]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Short]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapShortHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableMapIntegerHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Map[String, Int]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.Integer], scala.collection.mutable.Map[String, Int]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, Int]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Int]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapIntegerHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableMapLongHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Map[String, Long]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.Long], scala.collection.mutable.Map[String, Long]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, Long]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Long]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapLongHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableMapFloatHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Map[String, Float]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.Float], scala.collection.mutable.Map[String, Float]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, Float]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Float]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapFloatHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableMapDoubleHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Map[String, Double]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.Double], scala.collection.mutable.Map[String, Double]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, Double]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Double]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapDoubleHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableMapBooleanHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Map[String, Boolean]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.Boolean], scala.collection.mutable.Map[String, Boolean]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, Boolean]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Boolean]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapBooleanHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableMapStringHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Map[String, String]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.String], scala.collection.mutable.Map[String, String]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, String]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[String]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapStringHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableMapCharHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Map[String, Char]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.Character], scala.collection.mutable.Map[String, Char]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, Char]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Char]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapCharHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableMapJsonObjectHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, JsonObject], scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject]] else collection.mutable.Map(x.asScala.mapValues(x => x).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapJsonObjectHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableMapJsonArrayHandlerAsyncResultFuture(notNull: Boolean):scala.concurrent.Future[scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, JsonArray], scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray]] else collection.mutable.Map(x.asScala.mapValues(x => x).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithNullableMapJsonArrayHandlerAsyncResult(notNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithListNullableByteHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Buffer[Byte]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Byte], scala.collection.mutable.Buffer[Byte]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[Byte]] else x.asScala.map(x => x.asInstanceOf[Byte]))
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableByteHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithListNullableShortHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Buffer[Short]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Short], scala.collection.mutable.Buffer[Short]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[Short]] else x.asScala.map(x => x.asInstanceOf[Short]))
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableShortHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithListNullableIntegerHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Buffer[Int]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Integer], scala.collection.mutable.Buffer[Int]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[Int]] else x.asScala.map(x => x.asInstanceOf[Int]))
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableIntegerHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithListNullableLongHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Buffer[Long]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Long], scala.collection.mutable.Buffer[Long]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[Long]] else x.asScala.map(x => x.asInstanceOf[Long]))
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableLongHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithListNullableBooleanHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Buffer[Boolean]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Boolean], scala.collection.mutable.Buffer[Boolean]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[Boolean]] else x.asScala.map(x => x.asInstanceOf[Boolean]))
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableBooleanHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithListNullableFloatHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Buffer[Float]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Float], scala.collection.mutable.Buffer[Float]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[Float]] else x.asScala.map(x => x.asInstanceOf[Float]))
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableFloatHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithListNullableDoubleHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Buffer[Double]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Double], scala.collection.mutable.Buffer[Double]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[Double]] else x.asScala.map(x => x.asInstanceOf[Double]))
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableDoubleHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithListNullableStringHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Buffer[String]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.String], scala.collection.mutable.Buffer[String]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[String]] else x.asScala.map(x => x.asInstanceOf[String]))
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableStringHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithListNullableCharHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Buffer[Char]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Character], scala.collection.mutable.Buffer[Char]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[Char]] else x.asScala.map(x => x.asInstanceOf[Char]))
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableCharHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithListNullableJsonObjectHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[JsonObject], scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[io.vertx.core.json.JsonObject]] else x.asScala.map(x => x))
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableJsonObjectHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithListNullableJsonArrayHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[JsonArray], scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[io.vertx.core.json.JsonArray]] else x.asScala.map(x => x))
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableJsonArrayHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithListNullableApiHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Buffer[RefedInterface1]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[JRefedInterface1], scala.collection.mutable.Buffer[RefedInterface1]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[RefedInterface1]] else x.asScala.map(x => RefedInterface1(x)))
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableApiHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithListNullableDataObjectHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Buffer[TestDataObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[JTestDataObject], scala.collection.mutable.Buffer[TestDataObject]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[TestDataObject]] else x.asScala.map(x => TestDataObject(x)))
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableDataObjectHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithListNullableEnumHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[TestEnum], scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]] else x.asScala.map(x => x))
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableEnumHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithListNullableGenEnumHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[TestGenEnum], scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]] else x.asScala.map(x => x))
    asJava.asInstanceOf[JNullableTCK].methodWithListNullableGenEnumHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithSetNullableByteHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Set[Byte]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Byte], scala.collection.mutable.Set[Byte]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[Byte]] else x.asScala.map(x => x.asInstanceOf[Byte]))
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableByteHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithSetNullableShortHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Set[Short]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Short], scala.collection.mutable.Set[Short]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[Short]] else x.asScala.map(x => x.asInstanceOf[Short]))
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableShortHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithSetNullableIntegerHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Set[Int]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Integer], scala.collection.mutable.Set[Int]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[Int]] else x.asScala.map(x => x.asInstanceOf[Int]))
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableIntegerHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithSetNullableLongHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Set[Long]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Long], scala.collection.mutable.Set[Long]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[Long]] else x.asScala.map(x => x.asInstanceOf[Long]))
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableLongHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithSetNullableBooleanHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Set[Boolean]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Boolean], scala.collection.mutable.Set[Boolean]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[Boolean]] else x.asScala.map(x => x.asInstanceOf[Boolean]))
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableBooleanHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithSetNullableFloatHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Set[Float]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Float], scala.collection.mutable.Set[Float]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[Float]] else x.asScala.map(x => x.asInstanceOf[Float]))
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableFloatHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithSetNullableDoubleHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Set[Double]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Double], scala.collection.mutable.Set[Double]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[Double]] else x.asScala.map(x => x.asInstanceOf[Double]))
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableDoubleHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithSetNullableStringHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Set[String]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.String], scala.collection.mutable.Set[String]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[String]] else x.asScala.map(x => x.asInstanceOf[String]))
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableStringHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithSetNullableCharHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Set[Char]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Character], scala.collection.mutable.Set[Char]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[Char]] else x.asScala.map(x => x.asInstanceOf[Char]))
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableCharHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithSetNullableJsonObjectHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Set[io.vertx.core.json.JsonObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[JsonObject], scala.collection.mutable.Set[io.vertx.core.json.JsonObject]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[io.vertx.core.json.JsonObject]] else x.asScala.map(x => x))
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableJsonObjectHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithSetNullableJsonArrayHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Set[io.vertx.core.json.JsonArray]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[JsonArray], scala.collection.mutable.Set[io.vertx.core.json.JsonArray]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[io.vertx.core.json.JsonArray]] else x.asScala.map(x => x))
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableJsonArrayHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithSetNullableApiHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Set[RefedInterface1]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[JRefedInterface1], scala.collection.mutable.Set[RefedInterface1]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[RefedInterface1]] else x.asScala.map(x => RefedInterface1(x)))
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableApiHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithSetNullableDataObjectHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Set[TestDataObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[JTestDataObject], scala.collection.mutable.Set[TestDataObject]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[TestDataObject]] else x.asScala.map(x => TestDataObject(x)))
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableDataObjectHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithSetNullableEnumHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[TestEnum], scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestEnum]] else x.asScala.map(x => x))
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableEnumHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithSetNullableGenEnumHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[TestGenEnum], scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Set[io.vertx.codegen.testmodel.TestGenEnum]] else x.asScala.map(x => x))
    asJava.asInstanceOf[JNullableTCK].methodWithSetNullableGenEnumHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithMapNullableByteHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Map[String, Byte]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.Byte], scala.collection.mutable.Map[String, Byte]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, Byte]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Byte]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableByteHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithMapNullableShortHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Map[String, Short]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.Short], scala.collection.mutable.Map[String, Short]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, Short]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Short]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableShortHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithMapNullableIntegerHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Map[String, Int]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.Integer], scala.collection.mutable.Map[String, Int]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, Int]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Int]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableIntegerHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithMapNullableLongHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Map[String, Long]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.Long], scala.collection.mutable.Map[String, Long]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, Long]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Long]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableLongHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithMapNullableBooleanHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Map[String, Boolean]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.Boolean], scala.collection.mutable.Map[String, Boolean]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, Boolean]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Boolean]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableBooleanHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithMapNullableFloatHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Map[String, Float]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.Float], scala.collection.mutable.Map[String, Float]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, Float]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Float]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableFloatHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithMapNullableDoubleHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Map[String, Double]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.Double], scala.collection.mutable.Map[String, Double]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, Double]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Double]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableDoubleHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithMapNullableStringHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Map[String, String]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.String], scala.collection.mutable.Map[String, String]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, String]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[String]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableStringHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithMapNullableCharHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Map[String, Char]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, java.lang.Character], scala.collection.mutable.Map[String, Char]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, Char]] else collection.mutable.Map(x.asScala.mapValues(x => x.asInstanceOf[Char]).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableCharHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithMapNullableJsonObjectHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, JsonObject], scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, io.vertx.core.json.JsonObject]] else collection.mutable.Map(x.asScala.mapValues(x => x).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableJsonObjectHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithMapNullableJsonArrayHandlerAsyncResultFuture():scala.concurrent.Future[scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[String, JsonArray], scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray]](x => if (x == null) null.asInstanceOf[scala.collection.mutable.Map[String, io.vertx.core.json.JsonArray]] else collection.mutable.Map(x.asScala.mapValues(x => x).toSeq: _*))
    asJava.asInstanceOf[JNullableTCK].methodWithMapNullableJsonArrayHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

    def methodWithNullableHandlerAsyncResultFuture(expectNull: Boolean):scala.concurrent.Future[String] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.String, String](x => if (x == null) null.asInstanceOf[String] else x.asInstanceOf[String])
    asJava.asInstanceOf[JNullableTCK].methodWithNullableHandlerAsyncResult(expectNull.asInstanceOf[java.lang.Boolean],promiseAndHandler._1)
    promiseAndHandler._2.future
  }

}

object NullableTCK{
  def apply(asJava: JNullableTCK) = new NullableTCK(asJava)  
}
