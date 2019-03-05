fun main(args:Array<String>){
    println("Hello,Kotlin")
    var a = 8
    var b = 6
    var plus = {a:Int,b:Int -> a+b}
    var sub = {a:Int,b:Int -> a-b}
    var multi = {a:Int,b:Int -> a*b}
    var devide = {a:Int,b:Int -> a/b}
    println("a+b="+plus(a,b))
    println("a-b="+sub(a,b))
    println("a*b="+multi(a,b))
    println("a/b="+devide(a,b))
}
