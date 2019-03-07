package succeeddemo

fun main(args: Array<String>) {
    var person1 = Man("金三胖")
    var person2 = Woman("慈禧太后")
    var houseList = listOf<Human>(person1,person2)
    for (p in houseList){
        p.eat()
        p.pee()
    }
}