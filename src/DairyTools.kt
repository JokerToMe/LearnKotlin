fun dairyGenerator(placeName:String):String{
    var template = "今天去了${placeName},${placeName.length}"
    return template
}

fun main(args: Array<String>) {
    var placeName = "中山公园"
    println(dairyGenerator(placeName))
}