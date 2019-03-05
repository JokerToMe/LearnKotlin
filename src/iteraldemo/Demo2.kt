package iteraldemo

fun main(args: Array<String>) {
    var n = 10000
    var r = 0
    println("${n}的累加为${ollAdd(n,r)}")
}

tailrec fun ollAdd(num:Int,result:Int):Int{
    if (num == 0)
        return result
    else
        return ollAdd(num - 1,result+num)
}