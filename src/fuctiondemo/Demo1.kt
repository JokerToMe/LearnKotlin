package fuctiondemo

fun main(args: Array<String>) {
    println("${add(1,2)}")
    var i = {x:Int,y:Int -> x+y}
    println("${i(2,5)}")
    var j:(Int,Int) -> Int = {x,y -> x+y}
    println("${j(2,3)}")
}

fun add(x:Int,y:Int) = x+y