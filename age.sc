def sumConditional(map: Map[String, Int], str: String): Int ={
  map.foldLeft(0){(accumulator :Int, words:(String,Int)) =>
    if(words._1.contains(str)){
      accumulator + words._2
    }
    else
      accumulator
  }
}
sumConditional(Map("anurag" -> 20, "anushka" -> 225), "anu")