package fundamentos

//declarando uma função

//fun -> palavra reservada para declarar função
//main -> nome da função
//Unit -. é um void, não retorna nada, por padrão já é Unit
fun main(): Unit {
    println("Hello World")
    println(retornaNome()) //-> Invocando a função

    var nome = retornaNome() //-> Ou atribuindo a uma variável
    println(nome)

    dizOi("Luana") //-> Invocando a função e passando parâmetro

    dizOi2("Zoe", 4)
    dizOi2(idade = 30, nome = "David")

    dizOi3("Raimunda")
}

fun retornaNome(): String {
    return "Luana" //Só tá retornando e não printando
}

fun dizOi(nome: String) {
    println("Oi ${nome}")
}

fun dizOi2(nome: String, idade: Int) {
    println("Oi ${nome}, parabéns pelos seus ${idade} anos!")
}

fun dizOi3(nome: String, idade: Int = 60) {
    println("Oi ${nome}, parabéns pelos seus ${idade} anos!")
}