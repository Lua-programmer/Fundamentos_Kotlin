package fundamentos

class Pessoa(var nome: String, var idade: Int) { //dessa forma já cria a classe e o construtor junto.
    override fun toString(): String { //ou colocando "data" na frente da classe
        return "Classe Pessoa: Nome: ${nome}, Idade: ${idade}"
    }
}

fun main() {
    var pessoa1 = Pessoa("Luana", 26);
    println(pessoa1);
}