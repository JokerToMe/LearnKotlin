package datademo

data class Girl(var name:String,var age:Int,var height:Int,var address:String)

var girls = listOf<Girl>(
    Girl("Fancy",20,160,"广州"),
    Girl("mengwei",21,156,"西安"),
    Girl("kexin",22,153,"上海")
)

infix fun List<Girl>.findYoungGirls(age:Int):List<Girl>{
    return filter {
        it.age == age
    }
}