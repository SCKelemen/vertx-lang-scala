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

package io.vertx.scala.ext.web

import io.vertx.ext.web.{Cookie => JCookie}
import scala.reflect.runtime.universe._
import io.vertx.scala.core.http.{Cookie => SCookie}
import io.vertx.lang.scala.HandlerOps._
import io.vertx.lang.scala.Converter._

/**
  * Represents an HTTP Cookie.
  * 
  * All cookies must have a name and a value and can optionally have other fields set such as path, domain, etc.
  * 
  * (Derived from io.netty.handler.codec.http.Cookie)
  */

class Cookie(private val _asJava: Object) extends SCookie (_asJava) {





  override 
  def setValue(value: String): Cookie = {
    asJava.asInstanceOf[JCookie].setValue(value.asInstanceOf[java.lang.String])
    this
  }


  override 
  def setDomain(domain: scala.Option[String]): Cookie = {
    asJava.asInstanceOf[JCookie].setDomain(domain.map(x => x.asInstanceOf[java.lang.String]).orNull)
    this
  }


  override 
  def setPath(path: scala.Option[String]): Cookie = {
    asJava.asInstanceOf[JCookie].setPath(path.map(x => x.asInstanceOf[java.lang.String]).orNull)
    this
  }


  override 
  def setMaxAge(maxAge: Long): Cookie = {
    asJava.asInstanceOf[JCookie].setMaxAge(maxAge.asInstanceOf[java.lang.Long])
    this
  }


  override 
  def setSecure(secure: Boolean): Cookie = {
    asJava.asInstanceOf[JCookie].setSecure(secure.asInstanceOf[java.lang.Boolean])
    this
  }


  override 
  def setHttpOnly(httpOnly: Boolean): Cookie = {
    asJava.asInstanceOf[JCookie].setHttpOnly(httpOnly.asInstanceOf[java.lang.Boolean])
    this
  }



  /**
   * Has the cookie been changed? Changed cookieMap will be saved out in the response and sent to the browser.   * @return true if changed
   */
  def isChanged (): Boolean = {
    asJava.asInstanceOf[JCookie].isChanged().asInstanceOf[Boolean]
  }

  /**
   * Set the cookie as being changed. Changed will be true for a cookie just created, false by default if just
   * read from the request   * @param changed true if changed
   */
  def setChanged (changed: Boolean): Unit = {
    asJava.asInstanceOf[JCookie].setChanged(changed.asInstanceOf[java.lang.Boolean])
  }

  /**
   * Has this Cookie been sent from the User Agent (the browser)? or was created during the executing on the request.   * @return true if the cookie comes from the User Agent.
   */
  def isFromUserAgent (): Boolean = {
    asJava.asInstanceOf[JCookie].isFromUserAgent().asInstanceOf[Boolean]
  }


}

object Cookie {
  def apply(asJava: JCookie) = new Cookie(asJava)
  
  /**
   * Create a new cookie   * @param name the name of the cookie
   * @param value the cookie value
   * @return the cookie
   */
  def cookie(name: String,value: String): Cookie = {
    Cookie(JCookie.cookie(name.asInstanceOf[java.lang.String], value.asInstanceOf[java.lang.String]))
  }

}
