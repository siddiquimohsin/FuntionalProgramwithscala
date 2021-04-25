import Array._
object T3{

    def main(args : Array[String]):Unit={

        val ar1 : Array[Double] = Array(1,2,3)
        val ar2 : Array[Double] = Array(3,4,5)

        //val sum=(a:Double,b:Double):Double=>a+b
        
       
       val result = Array.tabulate(ar1.length)(n=>ar1(n)+ar2(n))

       println(result.mkString("",",",""))

        
        


    }
}