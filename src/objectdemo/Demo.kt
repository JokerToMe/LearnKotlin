package objectdemo

class Rect(var width:Int,var height:Int)

fun main(args: Array<String>) {
    var rect01 = Rect(10,20)
    println("矩形的宽度为：${rect01.width}")
    println("矩形的高度为：${rect01.height}")
}