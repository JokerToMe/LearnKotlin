package nulldemo

fun heat(str:String?):String{
    return "热"+str
}

fun main(args: Array<String>) {
    var heat = heat("水")
    println(heat)
    var a = heat(null)
    println(a)
}