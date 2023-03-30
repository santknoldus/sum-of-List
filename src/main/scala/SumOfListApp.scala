package kup.knoldus.surprisetest

object SumOfListApp extends App {

  private val sumOfList = new SumOfList

  val list = List(10, 20, 30, 40)
  private val sum = sumOfList.sumOfList(list)

  println(sum)
}