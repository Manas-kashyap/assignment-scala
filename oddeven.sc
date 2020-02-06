def updateMap(map: Map[Int, List[String]], map1: Map[Int, List[String]]): Map[Int, List[String]] = {

  def updateList(list: List[String], str: String): List[String] = list match {
    case Nil => List()
    case first :: rest => first.charAt(0) + str :: updateList(rest, str)
  }

  map.foldLeft(map1) { (acc: Map[Int, List[String]], element: (Int, List[String])) => {
    if (element._1 % 2 == 0) {
      acc + (element._1 -> updateList(element._2, "even"))
    } else {
      acc + (element._1 -> updateList(element._2, "odd"))
    }
  }
  }

}

val map = Map(
  1 -> List("Sunil", "Laxmi"),
  2 -> List("Bhavya", "angeeta"),
  3 -> List("Arun", "Sushmita"),
  4 -> List("Jamwant")
)
val map1 = Map.empty[Int, List[String]]
val res = updateMap(map, map1)
res

val list1 = List(1, 1, 2, 3, 5, 8)

def getLastElement(list: List[Int]): Int = {
  list.foldLeft(0) { (acc: Int, element: Int) => {
    element
  }
  }
}
getLastElement(list1)