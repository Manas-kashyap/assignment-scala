def reverse[A](list: List[A]): List[A] = {
  def innerReverse(innerlist: List[A], rest: List[A]): List[A] = rest match {
    case Nil => innerlist
    case first :: tail => innerReverse(first :: innerlist, tail)
  }
  innerReverse(Nil, list)
}
val testList = List(1,2,3)
val check = reverse(testList)
if (check == testList) {print("palindrome")}
else print("not palindrome")
