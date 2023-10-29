fun main(){
    //Sum of number 1 to 10
    var sum = 0
    var i = 1
    while(i<100){
        sum+=i
        i++
        if(i==11)
            break

    }
    println("Sum of number 1 to 10 = $sum")

    //Multiplication table of 3
    val num = 3
    var j = 1
    do {
        println("$num x $j = "+ (num * j))
        j++
        if(j==10)
            break
    }
        while (i<100)

        //Break keyword in string
    var name = "IamEmtiaz"
    for(i in name){
        print(i)
        if( i == 'E')
            break
    }


}