import java.util.*

fun main(args: Array<String>) {
    var chukua =Scanner(System.`in`)
    println("How many employees do you have")
    var number=chukua.nextInt()
    var employees= arrayOfNulls<String>(number)
    println("Enter the$number employees")
    var salaries= arrayOfNulls<Double>(number)
    //write a loop to receive the names
    var x=0
    while(x<number){
      employees[x]=chukua.next()
    println("Enter"+employees[x]+"'s salary")
    salaries[x]=chukua.nextDouble()
    x++}
    //Write a loop to print the names and salaries
    var y=0
    while(y<number){
        println(employees[y]+".......Ksh"+salaries[y])
        y++
    }
}