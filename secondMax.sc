def findSecondMax(givenList: List[Int], maximum: Int, secondMaximum: Int): Int = {
  val secondMaxValue = givenList match {
    case Nil => secondMaximum
    case head :: Nil => secondMaximum
    case first :: second :: rest =>
      if (first > second) {
        if (second > secondMaximum) findSecondMax(List(first) ::: rest, first, second)
        else
          findSecondMax(List(first) ::: rest, first, secondMaximum)
      }
      else if (first > secondMaximum)
        findSecondMax(List(second) ::: rest, second, first)
      else
        findSecondMax(List(second) ::: rest, second, secondMaximum)

    case _ => secondMaximum
  }
  secondMaxValue

}

val min = findSecondMax(List(2, 4, 1, 6), 0, 0)
println(min)