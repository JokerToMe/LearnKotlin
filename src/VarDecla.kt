//变量的声明和使用
fun main(args: Array<String>) {
//    var i:Byte = 18
//    println(""+i)
    //定义常量，只读不能被修改
//    val con = 2
//    val a:Byte = Byte.MAX_VALUE
//    val b:Byte = Byte.MIN_VALUE
//    println(a)
//    println(b)
//    val c:Long = Long.MAX_VALUE
//    val d:Long = Long.MIN_VALUE
//    println(c)
//    println(d)
    //可以用二进制表示Int类型的数
//    var e:Int = 0b0010
//    println(e)
    var num1 = Math.sqrt(5.0) - Math.sqrt(4.0)
    var num2 = Math.sqrt(4.0) - Math.sqrt(3.0)
    println(num1>num2)
    var num3 = Math.pow(2.0,100.0)
    var num4 = Math.pow(3.0,75.0)
    println(num3>num4)
}