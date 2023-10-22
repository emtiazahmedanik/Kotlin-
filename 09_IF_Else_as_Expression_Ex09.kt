import java.util.*
fun main(){
    println("Enter three number:")
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()
    val max = if(a>b && a>c){
        a
    }
    else if(b>a && b>c){
        b
    }
    else{
        c
    }
    println("max is $max")
}