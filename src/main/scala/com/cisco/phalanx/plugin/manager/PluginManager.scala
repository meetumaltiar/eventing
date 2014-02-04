package com.cisco.phalanx.plugin.manager

import org.clapper.classutil.ClassFinder
import java.io.File
import com.cisco.phalanx.plugin.EventPlugin

object PluginManager {
  var pluginMap = Map[String, String]()

  def init() {
    val classpath = List(".").map(new File(_))
    val finder = ClassFinder(classpath)
    val classes = finder.getClasses
    val classMap = ClassFinder.classInfoMap(classes)
    val plugins = ClassFinder.concreteSubclasses("com.cisco.phalanx.plugin.EventPlugin", classMap)
    plugins.foreach {
      pluginString =>
        val plugin = Class.forName(pluginString.name).newInstance().asInstanceOf[EventPlugin]
        pluginMap += (plugin.name -> pluginString.name)
    }
  }

  def getPlugin(name: String): EventPlugin = {
    if (pluginMap.isEmpty) init
    Class.forName(pluginMap(name)).newInstance().asInstanceOf[EventPlugin]
  }
}