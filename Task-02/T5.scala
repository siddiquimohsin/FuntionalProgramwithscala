object T5{

    def makemap[A,B](ar:Seq[A],f:A=>B):Map[A,B]={

        return(ar zip ar.map(x=>f(x))).toMap
    }


    def main(args : Array[String]):Unit={

        def func(n:Int):Boolean = {
            if(n%2==0) true
            else false
        }
        val seq : Seq[Int] = Seq(1,2,3,4)

        val make=makemap[Int,Boolean](seq,func)

        println(make)

    }
}