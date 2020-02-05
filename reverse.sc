def reverse[A](list: List[A]): List[A] = {
  def innerReverse(innerlist: List[A], rest: List[A]): List[A] = rest match {
    case Nil => innerlist
    case first :: tail => innerReverse(first :: innerlist, tail)
  }
  innerReverse(Nil, list)
}
reverse(List())