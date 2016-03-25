package cookbook

import scala.collection.immutable.List;

class Recipe {

  var ingredients: List[String] = List.empty
  var directions: List[String] = List.empty

}

class Cookbook {

  var recipes: Map[String, Recipe] = Map.empty
  
  def main(args: Array[String]): Unit = {
    println("testing main")
  }

}
