package com.cisco.phalanx.plugin

trait EventPlugin {
  def name: String
  def execute(context: String)
}