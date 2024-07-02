object ReverseString{
    def reverse (text: String):String={
        if (text.isEmpty){
            ""
        }
        else reverse(text.tail) + text.head;
            
    }
    def main (args: Array[String]): Unit ={
        val input ="shashika";
        println(s"Original string: $input");
        println(s"Reversed string: ${reverse(input)}");
    }
    
}

 