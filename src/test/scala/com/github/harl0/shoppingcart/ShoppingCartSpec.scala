package com.github.harl0.shoppingcart

/**
  * Created by Jason on 03/09/2016.
  */
class ShoppingCartSpec extends UnitTest("ShoppingCart") {

  //TODO create a test for a single apple should equal 25p
  //TODO create a test for a single orange should equal 60p
  //TODO create tests for price

  "Apple - Price" should "Equal 0.25" in {
    ShoppingCart.price("apple") shouldEqual(Some(0.25))
  }

  "Tree - Price" should "Equal 0" in {
    ShoppingCart.price("tree") shouldEqual(None)
  }

  "Apple" should "Equal 0.25" in {
    ShoppingCart.checkout(Array("apple")) shouldEqual (0.25)
  }

  "Orange" should "Equal 0.60" in {
    ShoppingCart.checkout(Array("orange")) shouldEqual (0.60)
  }

  "OraNGE" should "Equal 0.60" in {
    ShoppingCart.checkout(Array("OraNGE")) shouldEqual (0.60)
  }

  "Apple, Apple, Orange" should "Equal 1.10" in {
    ShoppingCart.checkout(Array("apple", "apple", "orange")) shouldEqual (1.10)
  }

  "Apple, Apple, Apple, Orange, Apple, Orange, Orange" should "Equal 2.80" in {
    ShoppingCart.checkout(Array("Apple", "Apple", "Apple", "Orange", "Apple", "Orange", "Orange")) shouldEqual (2.80)
  }
}
