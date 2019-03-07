package datademo

import java.util.*

data class Boy(var name:String,var age:Int)

fun main(args: Array<String>) {
//    println(girls.map { "${it.name}的年龄是${it.age}" })
//    println(girls.any { it.age == 20 })
//    println(girls.count { it.height == 160 })
//    println(girls.filter { it.address == "广州" })
//    //找出满足条件的第一个实例
//    println(girls.find { it.name == "Fancy" })
//    println(girls.groupBy { it.age })
//    println(girls findYoungGirls 20)
    Girl("hah",18,20,"daf") findFirstCharacter "abc"
    var map = TreeMap<String, Boy>()
    map.put("luo",Boy("xiangyi",25))
    map.put("wu",Boy("hengchao",28))
    println(map.map {
        "${it.key}:${it.value}"
    })
    println(map.any {
        it.value.age == 28
    })
}

infix fun Girl.findFirstCharacter(str:String){
    str.forEach {
        println(it)
    }
}