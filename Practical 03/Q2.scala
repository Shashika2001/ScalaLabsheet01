object Filtertexts{
    def filterLongTexts(strings :List[String]):List[String]={
        strings.filter(_.length()>5)
    }

    def main(args: Array[String]): Unit = {
        val input = List("Shashika","Match","Cup");
        val filteredTexts=filterLongTexts(input);
        println(s"original list: $input");
        println(s"filtered list: $filteredTexts");
    }
}