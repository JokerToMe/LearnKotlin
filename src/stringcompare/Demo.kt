package stringcompare

fun main(args: Array<String>) {
    var str1 = "Andy"
    var str2 = "andy"

    // true：不区分大小写 false：区分大小写
    println(str1.equals(str2,true))
    println(str1.equals(str2,false))
}