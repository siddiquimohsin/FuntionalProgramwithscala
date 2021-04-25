import scala.util.Random

object T1{

    def check(n:Int,max:Int):Boolean={
        if(n == max) true

        else if (max % n == 0) false
        
        else check(n+1,max)
    }

    def main(args : Array[String]):Unit={


        val li : List[Int]= List.fill(15)(50+Random.nextInt(500-50)+1)
        val ma :List[Int] = List()
        println(li)
        val mi : List[Int] = li.map(x => if(check(2,x))x else 0).filter(_>0).sorted

        val mi1 = (mi.map(x => li.indexOf(x)) zip mi).toMap
        println(mi1)




    }
}