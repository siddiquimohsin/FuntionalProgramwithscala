// we can convert Map and set to mutable by import explicitly these below libraries
import scala.collection.mutable.Map._
import scala.collection.mutable.Set._

object EX2{

    def main(args: Array[String]): Unit = {

        var animal = Map(1 -> "Lion", 2 -> "Tiger")

        animal = Map(1 -> "Bear", 2 -> "Cheetah")

        println(s"animal map Changed Values = ${animal.mkString("")}")

        var se1 = Set(1,3,5,7)

        se1 = Set(2,4,6,8)

        println(s"se1 Set Changed Values = ${se1.mkString("",",","")}")




    }
}