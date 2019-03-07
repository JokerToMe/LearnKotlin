package succeeddemo

class Woman(name:String):Human(name) {
    override fun pee() {
        println("坐着")
    }

    override fun eat() {
        println("${name}吃得少")
    }


}