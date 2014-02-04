package com.cisco.phalanx.plugin.plugins

import com.cisco.phalanx.plugin.EventPlugin

class FibonacciPlugin extends EventPlugin {

  def name: String = "fibonacci"

  def execute(context: String) = {
    println("Fibonacci of 3 is " + fib(3))
  }

  def fib(x: Int): Int = {
    x match {
      case 0 => 0
      case 1 => 1
      case _ => fib(x - 1) + fib(x - 2)
    }
  }
}