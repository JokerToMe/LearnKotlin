package objectdemo

fun main(args: Array<String>) {
    var washingMachine = WashingMachine("小天鹅",12)
    washingMachine.openDoor()
    washingMachine.closeDoor()
    washingMachine.selectMode(2)
    washingMachine.start()
}