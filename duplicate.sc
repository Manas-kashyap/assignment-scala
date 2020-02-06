def duplicate(givenList: List[Int]): List[Int] = {
  givenList match {
    case Nil => givenList
    case head :: rest => head :: head :: duplicate(rest)
  }
}
duplicate(List(2, 3, 5, 1, 8, 8))