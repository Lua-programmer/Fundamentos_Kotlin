package fundamentos

fun main() {
//    print1a10()
//    print10a1()
//    print1a10Par()
//    printRangeNumeros(5, 30)
 //   whileMaior10()
}

fun print1a10() {
    for (numero in 1..10) {
        println(numero)
    }
}

fun print10a1() {
    for (numero in 10 downTo 1) {
        println(numero)
    }
}

fun print1a10Par() {
    //vai printar de 2 em 2
    for (numero in 1..10 step 2) {
        println(numero)
    }
}

fun printRangeNumeros(inicio: Int, fim: Int) {
    for (numero in inicio..fim) {
        println(numero)
    }
}

fun whileMaior10() {
    var x = 0
    while (x <= 10) {
        print(" ${x} ")
        x++
    }
}

fun doWhileMenor10(){
    var x = 0
    do {
        print(" ${x} ")
        x++
    }while (x <= 10)
}