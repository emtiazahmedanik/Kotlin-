fun main(){
   println("Enter a number of day:")
    val day = readLine()!!.toInt()
    val result = when(day){
        1 -> "Friday"
        2 -> "Saturday"
        3 -> "Sunday"
        4 -> "Monday"
        5 -> "Tuesday"
        6 -> "Wednesday"
        7 -> "Thursday"
        in 8..16 -> "you entered wrong number"
        else -> "Not a day"
    }
    println(result)

}