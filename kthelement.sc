def kelement(list: List[Int] , k:Int): Int = {
  list match {
    case Nil => 0
    case first :: rest => if (k <= 0) first else kelement(rest,k-1)
  }
}
kelement(List(2,4,6),4)