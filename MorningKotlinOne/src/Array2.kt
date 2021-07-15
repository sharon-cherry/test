import java.util.*

fun main(args: Array<String>) {
    var scanner=Scanner(System.`in`)
    println("How many students do you have")
    var number =scanner.nextInt()
    println("Enter$number names")
    var students= arrayOfNulls<String>(number)
    //Write a loop tp to receive all the names
    var x=0
    while(x<number){
        students[x]=scanner.next()
        x++
    }
    //write a loop print the names
    for (name in students){
        println(name)

    }

}