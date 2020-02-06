def last(list: List[Int]): Int ={
  list match{
    case Nil => throw new NoSuchElementException("empty list")
    case first :: Nil => first
    case _ :: _ => list.foldLeft(0){(_:Int, end:Int) => end}

  }
}
last(List(1,2,3,4))