package objectdemo

class WashingMachine(var module:String,var size:Int){

    var isDoorOpen = true
    var currentMode = 0

    fun openDoor(){
        println("洗衣机开门")
        isDoorOpen = true
    }

    fun closeDoor(){
        println("洗衣机关门")
        isDoorOpen = false
    }

    fun start(){
        if (isDoorOpen){
            println("请关门")
        }else{
            when(currentMode){
                0 -> println("选择模式错误")
                1 -> {
                    println("开始洗衣服")
                    setModeSpeed(10)
                    println("结束洗衣服")
                }
                2 -> {
                    println("开始洗衣服2")
                    setModeSpeed(20)
                    println("结束洗衣服2")
                }
                else -> {
                    println("模式不能被识别")
                }
            }
        }
    }

    fun selectMode(mode:Int){
        currentMode = mode
        when(mode){
            0 -> println("初始模式")
            1 -> println("轻洗模式")
            2 -> println("重洗模式")
            else -> println("不要乱拧，拧坏了不保修")
        }
    }

    private fun setModeSpeed(speed:Int){
        println("当前发动机转速为：${speed} 圈/秒")

    }

}