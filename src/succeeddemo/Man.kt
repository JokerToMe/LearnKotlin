package succeeddemo

class Man(name:String):Human(name) {
    override fun pee() {
        println("站着")
    }

    override fun eat() {
        println("${name}吃得多")
    }

}