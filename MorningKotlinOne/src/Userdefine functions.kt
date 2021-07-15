import java.util.*

fun main(args: Array<String>) {
    var scanner =Scanner(System.`in`)
    motto()
    avg(45,564.0, 634.345f)
    println("Principle")
    var principle =scanner.nextDouble()

    println("rate")
    var rate =scanner.nextDouble()

    println("time")
    var time =scanner.nextDouble()
    si(principle ,rate,time)
}

fun motto(){
    println("Hello,this is our motto")
}

fun avg(x:Int ,y:Double ,z:Float){
    var avarage=(x+y+z)
    println("Your answer is $avarage")
}

fun  si(p:Double,r:Double ,t:Double){
    var simple_interest=(p*r*t)/100.0
    if(simple_interest<=10000){
        println("your simple intrest will be$simple_interest")}
    else{
        println("your loan is to expensive")
    }
}
//create a method that ensures the useras entered the following email
//and password
//emobilis@gmail.com
// password:emobili123

//There after,procced to calculate the BMI of a user and display
//the Bmi results as either
//i. Underweight
//ii.Normal weight
//iii.Overweight
//iv.Obese

//N/B:All input from the user