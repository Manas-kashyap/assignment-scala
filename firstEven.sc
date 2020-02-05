def firstEven(list: List[Int]): Int = {
  list match {
    case Nil => 0
    case first :: Nil => if (first % 2 == 0) first else 0
    case first :: rest => if (first % 2 == 0) first else firstEven(rest)
  }
}
firstEven(List(2,2,2,2,2))