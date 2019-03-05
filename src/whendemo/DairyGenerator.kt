package whendemo

fun dairyGenerator(placeName:String){
    var template = "今天去了${placeName},${whendemo.numToChinese(placeName.length)}"
    println(template)
}

fun numToChinese(num:Int):String{
    var result = when(num){
        1 -> "一"
        2 -> "二"
        else -> "无"
    }
    return result
}

fun main(args: Array<String>) {
    dairyGenerator("中山公园")
}