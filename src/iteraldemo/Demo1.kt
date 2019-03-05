package iteraldemo

fun main(args: Array<String>) {
    var num = 5
    var r = 1
    println("${num}的阶乘为${fact(num,r)}")
}

tailrec fun fact(num:Int,r:Int):Int{
    if (num == 1)
        return r
    else
        return fact(num - 1,r*num)
}