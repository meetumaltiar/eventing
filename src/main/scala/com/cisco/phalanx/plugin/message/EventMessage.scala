package com.cisco.phalanx.plugin.message

import org.json4s._
import org.json4s.native.JsonMethods._
import org.json4s.native.Serialization
import org.json4s.native.Serialization.{ read, write }

case class EventMessage(plugins: List[Plugin], payload: String) {
  implicit val formats = Serialization.formats(NoTypeHints)
  def toJson: String = write(this)
}

case class Plugin(name: String)