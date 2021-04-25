object T2{

    def CharArray(start:Int):List[Char]={
        return List.range(start,123).map(x=> x.toChar)

    }

    def main(args: Array[String]):Unit={

        val go = CharArray(97)

        println(go)

    
    }
}