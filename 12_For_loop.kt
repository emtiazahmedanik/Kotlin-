fun main(){
   for(i in 1..5 step 2){
       println(i)
   }
    println("Until:")
    for(k in 10 until 20){
        println(k)
    }
    println("downTo:")
    for(i in 10 downTo 0 step 3){
        println(i)
    }
}