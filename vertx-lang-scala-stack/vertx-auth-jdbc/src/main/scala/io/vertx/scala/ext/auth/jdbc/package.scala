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

package io.vertx.scala.ext.auth

import scala.collection.JavaConverters._
import io.vertx.core.json.JsonObject
import io.vertx.core.json.JsonArray
import io.vertx.core.AsyncResult
import io.vertx.core.Handler
import scala.concurrent.Promise

import io.vertx.core.json.JsonArray
import io.vertx.ext.auth
import io.vertx.ext.auth.{AuthProvider => JAuthProvider}
import io.vertx.core
import io.vertx.ext.auth.jdbc.{JDBCAuth => JJDBCAuth}
import io.vertx.ext.jdbc.{JDBCClient => JJDBCClient}
import io.vertx.ext.jdbc
import io.vertx.core.{Vertx => JVertx}

package object jdbc{

  object JDBCAuth {
    /**
     * Like [[create]] but returns a [[scala.concurrent.Future]] instead of taking an AsyncResultHandler.
     */
    def create(vertx: io.vertx.core.Vertx,client: io.vertx.ext.jdbc.JDBCClient) = {
      io.vertx.ext.auth.jdbc.JDBCAuth.create(vertx, client)
    }
  }



  type JDBCAuthOptions = io.vertx.ext.auth.jdbc.JDBCAuthOptions
  object JDBCAuthOptions {
    def apply() = new JDBCAuthOptions()
    def apply(json: JsonObject) = new JDBCAuthOptions(json)
  }



  object JDBCHashStrategy {
    /**
     * Like [[createSHA512]] but returns a [[scala.concurrent.Future]] instead of taking an AsyncResultHandler.
     */
    def createSHA512(vertx: io.vertx.core.Vertx) = {
      io.vertx.ext.auth.jdbc.JDBCHashStrategy.createSHA512(vertx)
    }
    /**
     * Like [[createPBKDF2]] but returns a [[scala.concurrent.Future]] instead of taking an AsyncResultHandler.
     */
    def createPBKDF2(vertx: io.vertx.core.Vertx) = {
      io.vertx.ext.auth.jdbc.JDBCHashStrategy.createPBKDF2(vertx)
    }
    /**
     * Like [[isEqual]] but returns a [[scala.concurrent.Future]] instead of taking an AsyncResultHandler.
     */
    def isEqual(hasha: java.lang.String,hashb: java.lang.String) = {
      io.vertx.ext.auth.jdbc.JDBCHashStrategy.isEqual(hasha, hashb)
    }
  }


}
