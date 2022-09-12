package fundamentos

class Carro(var cor: String, val anoFabricante: Int, val dono: Dono) { //pra conseguir acessar os atributos tem que colocar o nome val na frente

}

data class Dono(var nome: String, var idade: Int){

}

fun main() {
    var carro = Carro("Branco", 2021, Dono("Luana", 26))

    println(carro.cor)

    //val é imutável, var não
    carro.cor = "Preto" //-> Só consegue fazer isso com o val

    //acessando as variáveis
    println(carro.cor)
    println(carro.dono)
    println(carro.dono.nome)
}