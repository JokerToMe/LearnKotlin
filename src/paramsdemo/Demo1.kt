package paramsdemo

val pi = 3.1415926f

fun main(args: Array<String>) {
    var s = {a:Float,b:Float -> a*b}
    var a = 2.0f
    var b = 4.0f
    println("长${a}宽${b}的长方形面积为${s(a,b)}")
    var r = 2.0f
    println("半径为${r}的圆的面积为${s(r=r)}")
}

fun s(PI:Float = pi,r:Float):Float{
    return PI*r*r
}