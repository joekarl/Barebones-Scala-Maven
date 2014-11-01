package com.barebonesScala

object HelloWorld {
  def main(args: Array[String]) = {
    println("Hello World!")
  }
}

trait Math {

  def isOdd(x: Int): Boolean = {
    x % 2 != 0
  }

}
