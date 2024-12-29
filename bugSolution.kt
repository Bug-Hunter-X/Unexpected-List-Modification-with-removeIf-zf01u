fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val oddList = list.filter { it % 2 != 0 }
    println(oddList)
    println(list) 
}