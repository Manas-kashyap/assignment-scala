def drop(n: Int, givenList: List[Int]): List[Int] = {

  @scala.annotation.tailrec
  def dropRecursive(newList: List[Int], givenList: List[Int]): List[Int] = {
    givenList match {
      case Nil => newList
      case head :: Nil => List(head)
      case head :: rest =>
        if (newList.length != n - 1) {
          dropRecursive(newList ::: List(head), rest)
        }
        else
          newList ::: rest
    }

  }

  dropRecursive(List.empty[Int], givenList)
}

drop(3, List(1, 2, 3, 4, 5, 6))