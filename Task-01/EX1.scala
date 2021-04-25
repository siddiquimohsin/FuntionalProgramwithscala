object EX1 {

    def main(args: Array[String]): Unit = {

        //This ar1 and aar2 is simple way to make an array
        // mkString is a high order to convert the Array to String with space identifier
        val ar1=Array(1,2,3) 
        val ar2=Array("Mohsin","Scala","Python")
        println(s"Simple Array for Numbers = ${ar1.mkString(" ")}")
        println(s"Simple Array for Strings = ${ar2.mkString(" ")}")

       val ar3 = Array[Int](3,4,5,7,8) // We can create an array of  explicit data type
        println(s"Array of Explicit data type = ${ar3.mkString(" ")}")

        val ar4 = Array.range(0,10) // Array of 0-10 numbers
        val ar5 = Array.range(0,10,2) // Array of 0-10 numbers difrrerence of 2
        val ar6= Array.fill(3)("Mohsin") //Array of 3 indexes and value of all indexes is "Mohsin"
        val ar7 = List(7,8,9).toArray // wecan convert list to array

        println(s"Array of range(0-10) = ${ar4.mkString(" ")}")
        println(s"Array of range(0-10) difference by 2 = ${ar5.mkString(" ")}")
        println(s"Array of 3 indexes and value is Mohsin = ${ar6.mkString(" ")}")
        println(s"Convert list to array = ${ar7.mkString(" ")}")

    }
}