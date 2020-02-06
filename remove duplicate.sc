def rduplicate(givenList: List[Int]): List[Int] = {
  @scala.annotation.tailrec
  def rduplicateRecursive(givenList: List[Int], newList: List[Int]): List[Int] = givenList match {
    case List() => givenList
    case first :: Nil => newList :+ first
    case first :: second :: rest => if (first == second) rduplicateRecursive(second :: rest, newList) else rduplicateRecursive(second :: rest, newList :+ first)
  }

  rduplicateRecursive(givenList, List.empty[Int])
}
rduplicate(List(1, 1, 2, 2, 4, 5, 5))
