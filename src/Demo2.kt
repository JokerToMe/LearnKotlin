fun returnBig(a:Int,b:Int):Int{
    if (a>b){
        return a
    }else{
        return b
    }
}

fun main(args: Array<String>) {
    var a = 3
    var b = 5
    println("${a}和${b}中较大的那个值为：${returnBig(a,b)}")
}