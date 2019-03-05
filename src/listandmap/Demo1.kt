package listandmap

fun main(args: Array<String>) {
    var list = listOf(1,2,2)
    for ((i,num) in list.withIndex()){
        println("第${i}个位置的值为${num}")
    }
}