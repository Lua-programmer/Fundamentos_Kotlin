package fundamentos

fun main() {
    var lista = listOf(1, 2, 3, 4, 5, 6) //listof cria uma lista imutável, ou seja não aceita add, remove, etc..
    val pares = lista.filter { it % 2 == 0 } //iterar todos os valores e vai manter os que forem pares

    val primeiroPar = lista.filter { it % 2 == 0 }.first() //vai parar no primeiro par
    val ultimoPar = lista.filter { it % 2 == 0 }.last() //vai pegar o ultimo par

    println(pares)
    println(primeiroPar)
    println(ultimoPar)

    println("usando o forEach")
    //usando o forEach
    lista.forEach {
        println(it)
    }

    //usando o for
    for (numero in lista) {
        println(numero)
    }

    //os dois de baixo são a mesma coisa, ambos vão retornar a posição 0 na lista
    println(lista[0])
    println(lista.get(0))

    println(lista.size) //traz a quantidade de elementos da lista
    println(lista.indexOf(5)) //traz o elemento que está na posição 5

    println("***************************************************************************************")
    //Exemplo com lista mutável
    var listaM = mutableListOf(1,3,5,7,9)
    println(listaM)

    listaM.add(11)
    println(listaM)

    listaM.removeAt(0) //remove o elemento com indice 0
    println(listaM)

    listaM.remove(9) //remove o elemento 9 da lista
    println(listaM)

    listaM[0] = 31 //altera o valor do indice 0
    println(listaM)

    listaM.sort() //ordenar a lista
    println(listaM)

    listaM.shuffle() //embaralha a lista
    println(listaM)

    println("***************************************************************************************")

    var listaNomes = mutableListOf("Luana", "David", "Zoe")
    println(listaNomes)

    listaNomes.sort()
    println(listaNomes)

    println("***************************************************************************************")

    var setLista = setOf(1,2,3,2) //set tbm é uma lista, a diferença é que ele não aceita numeros duplicados
    println(setLista)

    var setListaM = mutableSetOf(1,2,3,2) //set tbm é uma lista, a diferença é que ele não aceita numeros duplicados
    println(setListaM)

    println(setListaM.contains(3)) //verifica se essa lista contém o número 3 e retorna true ou false

    println("***************************************************************************************")
    var mapNomeIdade = mapOf("Luana" to 26, "David" to 31) //map relaciona chave e valor
    println(mapNomeIdade)

    var mapNomeIdadeM = mutableMapOf<String, Int>("Luana" to 26, "David" to 31) //map relaciona chave e valor
    mapNomeIdadeM.put("Bruna", 29) //para adicionar o método é o "put" e não tem o "to"
    mapNomeIdadeM["Zoe"] = 4 //é a mesma coisa do de cima
    println(mapNomeIdadeM)

    mapNomeIdadeM.remove("Bruna") //removemos pela chave. No map, não podemos ter chaves iguais, só valores
    println(mapNomeIdadeM)
}