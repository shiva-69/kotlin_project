fun main() {
//    Take array of Integers then return max and min values.
    val numbers = arrayOf(1, 3, 5, 6, 7);
    val isMax = false;
    val result = getMaxorMinValue(numbers, isMax)
//    println(result)
    evenOrOdd(6)
}

fun getMaxorMinValue(numbers: Array<Int>, isMax: Boolean): Int {
    if (isMax) {
        var max = 0;
        for (number in numbers) {
            if (number > max) {
                max = number
            }
        }
        return max
    } else {
        var min = 0;
        for (number in numbers) {
            if (number < min) {
                min = number
            }
        }
        return min
    }
}
fun evenOrOdd(num: Int){
    if(num%2 == 0){
        println("Even")
    }
    else{
        println("Odd")
    }
}
