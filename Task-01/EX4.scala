object EX4{

    def main(args: Array[String]): Unit = {
        val ar1 = Array(1,2,3,4)
        val conarr = Array(5,6,7,8)
        val ar2 = ar1.map(x=> x*2) //we can used map which iterate the values one by one and we can used this value in any use
        println(ar2.mkString("",",",""))

        val ar3 = ar1.filter(_%2!=0) //filter is used to values one by one and applied condition on the iterate values

        println(ar3.mkString("",",",""))

        val ar4 = ar1.reverse //reverse is used to reverse all array
        println(ar4.mkString("",",",""))

        val ar5 = Array.concat(ar1,conarr) // concat is used to concatenate all arrays which you want
        println(ar5.mkString("",",",""))

        
    }
}