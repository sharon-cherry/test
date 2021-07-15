import java.util.*

fun main(args: Array<String>) {
    var scan=Scanner(System.`in`)
    println("How many students do you have")
    var number=scan.nextInt()
    var students= arrayOfNulls<String>(number)
    println("Enter the $number of students")
    var marks= arrayOfNulls<Double>(number)
    //writing the loop
    var x=0
    while(x<number){
        students[x]=scan.next()
        println("Enter"+students[x]+"'s marks")
        marks[x]=scan.nextDouble()
        x++}
    //write a loop to present the number of students and and their marks
    var y=0
    while (y>number){
        println(students[x]+"your marks is "+marks[y])
        y++
    }

}