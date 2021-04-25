import scala.util.Random
object T4 {

    def main(args: Array[String]): Unit = {

        val ar : Array[Int] = Array.fill(100)(Random.nextInt(100))

        println(ar.mkString("",",",""))
        val result = ar.count(x => {x%2==0})

        println(s"The number of even values in this array is ${result}")
    }
}