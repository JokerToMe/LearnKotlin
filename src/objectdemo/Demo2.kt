package objectdemo

class Girl(var character:String,var voice:String){

    fun smile(){
        println("笑了一下")
    }

    fun cry(){
        println("哭了一下")
    }
}

fun main(args: Array<String>) {
    var girl1 = Girl("彪悍","甜美")
    println("妹子的性格${girl1.character}，声音${girl1.voice}")
    girl1.smile()
    girl1.cry()
}