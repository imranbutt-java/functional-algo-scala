package com.funcalgo.learn

import scala.collection.immutable.LazyList.cons


/* imransarwar created on 08/08/2020*/
object FibonaciSeries extends App {
  val fibonaciSeries: LazyList[Int] = fibonaciSeries(0, 1)
  def fibonaciSeries(x: Int, y: Int): LazyList[Int] = cons(x, fibonaciSeries(y, x+y))

  def fibonaciSeriesNumAt(position: Int): Int = {
    if(position > 0) fibonaciSeries.take(position).toList.last
    else -1
  }

  println("# Fibnocci Num at position")
  println("0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...")
  println(fibonaciSeriesNumAt(4))
}