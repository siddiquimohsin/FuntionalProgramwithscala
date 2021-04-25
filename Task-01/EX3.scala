object EX3{

    def find(x:Option[Int])={
        x match {
            case Some(value) => value
            case None => None 
        }
    }

    def main(args: Array[String]): Unit = {
        val name = Map(1-> "Mohsin",2->"Monis")

        println(s"ID is ${find(Some(2))}")
        println(s"Name is ${name(2)}")


    }
}