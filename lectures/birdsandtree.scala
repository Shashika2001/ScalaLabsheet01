def jambuTree(x:Int,y:Int):(Int,Int) ={
    val x=2* y-3
    checkwithRambutanTree(x,y)
}
def checkwithRambutanTree(x:Int,y:Int):(Int,Int) =y match {
    case n if (x==n+2)=>(x,y+1)
}