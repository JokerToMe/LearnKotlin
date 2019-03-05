fun main(args:Array<String>){
    println("Hello,Kotlin")
    var a = 8
    var b = 6
    println("a+b="+plus(a,b))
    println("a-b="+sub(a,b))
    println("a*b="+multi(a,b))
    println("a/b="+devide(a,b))
}

fun plus(a:Int,b:Int):Int{
    return a+b
}

fun sub(a:Int,b:Int):Int{
    return a-b
}

fun multi(a:Int,b:Int):Int{
    return a*b
}

fun devide(a:Int,b:Int):Int{
    return a/b
}