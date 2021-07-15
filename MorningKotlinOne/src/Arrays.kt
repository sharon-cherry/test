fun main(args: Array<String>) {
    var names= arrayOf("Jeff","Betty","Wayne","Ibra")
    println(names[0])
    for(name in names){
        println(name)
    }
    println(names.size)

    var arrSize =names.size
    var x =0
    while(x<arrSize){
        println(names[x])
        x++
    }
    var cars =arrayOfNulls<String>(5)
    cars[0]="King"
    cars[1] ="Limo"
    cars[2] ="Prado"
    cars[3] ="Range"
    cars[4] ="volvo"
    cars[5] ="Mercedes"
    for(car in cars)
        println(cars)
}