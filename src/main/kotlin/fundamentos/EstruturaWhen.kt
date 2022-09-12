package fundamentos

fun main() {
    val x = 10

    when (x) {
        5, -5, 6 -> println("x == 5")
        8 -> println("x == 8")
        9 -> println("x == 9")
        10 -> {
            println("x == 10")
            println("x é uma dezena")
        }

        in 11..15 -> println("x está entre 11 e 15")
        else -> println("Número não mapeado")
    }

    println(comecaComOi(2))
}

fun comecaComOi(x: Any): Boolean {
    return when (x) {
        is String -> x.startsWith("Oi") //verifica se é um String e se começa com "Oi"
        else -> false
    }
}