package whendemo

fun gradeStudent(score:Int){
    var result = when(score){
        10 -> "考了满分"
        9 -> "还行"
        8 -> "还可以"
        7 -> "还好"
        6 -> "及格"
        else -> "还需要加油"
    }
    println(result)
}

fun main(args: Array<String>) {
    gradeStudent(10)
}