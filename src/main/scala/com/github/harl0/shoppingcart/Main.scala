package com.github.harl0.shoppingcart

/**
  * Created by Jason on 03/09/2016.
  */
object Main {
  def main(args: Array[String]) {
    println("[ " + args.mkString(", ") + " ] => £" + ShoppingCart.checkout(args))
//    println("Hello, world!")
  }
}