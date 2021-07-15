import java.util.*

fun main(args: Array<String>) {
    var chukua=Scanner(System.`in`)
    println("Enter your name")
    var name=chukua.next()

    println("Enter your weight")
    var weight =chukua.nextDouble()

    println("Enter your height")
    var height =chukua.nextDouble()

    var bmi=weight/Math.pow(height,2.0)
    print("Hello $name,your BMI is $bmi")

    //Getting input from the user,calculate:
    //1.Volume of any cylinder
    //2.Simple interest of any loan borrowed
}