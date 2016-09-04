package com.github.harl0.shoppingcart

import scala.math.BigDecimal.RoundingMode

/**
  * Created by Jason on 03/09/2016.
  *
  */
object ShoppingCart {
  //TODO create a priceList Map of items
  //TODO create a method for handling the totaling
  //TODO create a method for returning the price of an item

  /**
    * Map of items and corresponding unit cost.
    * Called by def price.
    */
  private val priceList: Map[String, Double] = Map(("apple", 0.25), ("orange", 0.60))

  /**
    * Totals the basket.
    * Called by Main.
    * Accepts a String array of items, returning a Double.
    * Matches the item passed to the item in priceList to extract the unit cost +
    * totals the sum and rounds to the nearest even number.
    * @param items
    * @return
    */
  def checkout(items: Array[String]): Double = {
    val total = items.flatMap(price).sum
    BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN).toDouble
  }

  /**
    * Gets the price of a given item.
    * Called by def checkout.
    * Accepts a String and returns the Option of a double.
    * Converts the item name to lowercase if required.
    * If the requested item is unknown, None is returned.
    * @param item
    * @return
    */
  def price(item: String): Option[Double] = priceList.get(item toLowerCase)

}
