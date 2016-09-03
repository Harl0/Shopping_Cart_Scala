package com.github.harl0.shoppingcart

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by Jason on 20/08/2016.
  */


// creating a template for future tests
// extedning Flatspec testing style and mixin with Matchers
// Matchers gives us an fairly readable format!
abstract class UnitTest(component: String) extends FlatSpec
  with Matchers{

  behavior of component

}
