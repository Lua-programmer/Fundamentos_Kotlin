package fundamentos

//var -> Mutável
//val -> Imutável

fun main() {
    var nome = "Luana"
    val sobrenome = "Melissa"

    nome = "Zoe"
    //sobrenome não recebe outro valor

}

class Variaveis {
    //variáveis fora de escopo de função precisa receber valor na hora da declaração
    //Para não dar erro, colocar o lateinit pois indica que essa variável será iniciada depois
    lateinit var teste: String

    fun iniciaVariaveis() {
        teste = "Teste"
    }
}