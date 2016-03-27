package cookbook

import scala.collection.immutable.List;

case class Recipe(ingredients: List[String], directions: List[String])

class Cookbook(val recipes: Map[String, Recipe]) {

  def this() = this(Map.empty)

}
