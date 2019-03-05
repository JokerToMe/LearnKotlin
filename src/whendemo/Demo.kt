package whendemo

fun gradeStudent(score:Int){
    when(score){
        10 -> println("考了满分")
        9 -> println("还行")
        8 -> println("还可以")
        7 -> println("还好")
        6 -> println("及格")
        else -> println("还需要加油")
    }
}

fun main(args: Array<String>) {
    gradeStudent(10)
}