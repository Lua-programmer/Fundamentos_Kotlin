package fundamentos

fun main() {
    parOuImpar(2)
    parOuImpar(3)
    resultadoNota(3)

    println(parOuImparOutroModo(5))
}

fun parOuImpar(numero: Int) {
    if (numero % 2 == 0) {
        println("Par")
    } else {
        println("Ímpar")
    }
}

fun parOuImparOutroModo(numero: Int): String {
    return if (numero % 2 == 0) {
        "Par"
    } else {
        "Ímpar"
    }
}

fun resultadoNota(nota: Int) {
    if (nota >= 6) {
        println("Passou")
    } else if (nota >= 4) {
        println("Recuperação")
    } else {
        println("Reprovado")
    }
}