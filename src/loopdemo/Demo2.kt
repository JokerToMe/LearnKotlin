package loopdemo

fun main(args: Array<String>) {
//    var nums = 1 until 100
//    for (num in nums){
//        println("${num}")
//    }

    var nums = 1..16
    for (num in nums step 2){
        println("${num}")
    }

    var nums2 = nums.reversed()
    for (num in nums2 step 2){
        println("${num}")
    }

    println("${nums2.count()}")
}