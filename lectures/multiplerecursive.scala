object fibonacciseq {
   def fibonacci(x:Int):Int=x match{
        case x if x==0 => 0
        case x if x==1 => 1
        case x => fibonacci(x-1)+fibonacci(x-2)

    }
    def main(args: Array[String]): Unit = {
        println(fibonacci(5));

    }
}