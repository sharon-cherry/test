fun main(args: Array<String>) {
    var x :Int
    x=120
    var y=if(x<10){
        "x is less than 10"
    }else{
        "x is grater or equal to 10"
    }
    println(y)

    var marks=0
    var grade=if(marks<40){
        "E"
    }else if(marks<50){
        "D"
    }else if(marks<60){
        "C"
    }else if(marks<70) {
        "B"
    }else {
        "A"
    }
    println(grade)

    var guessed_number=0
    var result=when(guessed_number){
        1->"OOPS"
        2->"OOPS"
        3->"Win"
        4->"OOPS"
        else->"Please"
    }
    println(result)
}
