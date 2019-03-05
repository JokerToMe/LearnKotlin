package iteraldemo

fun main(args: Array<String>) {
    var num = 5
    println("${num}的阶乘为${fact(num)}")
}

fun fact(num:Int):Int{
    if (num == 1)
        return 1
    else
        return fact(num - 1)*num
}