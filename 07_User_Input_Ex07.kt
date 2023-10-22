import java.util.Scanner
fun main(){
    //readline()
    //scanner class
   /* println("Enter text :")
    val input = readLine()!!
    var a = input.toInt()
    val input1 = readLine()!!
    var b = input1.toInt()
    print("You entered $input , $input1 ,addition :"+(a+b))
*/
    val inputnumber = Scanner(System.`in`)
    var f = inputnumber.nextInt()
    var g = inputnumber.nextFloat()
    var str = inputnumber.next()


    println("Integer:$f , Float :$g, String $str")

}