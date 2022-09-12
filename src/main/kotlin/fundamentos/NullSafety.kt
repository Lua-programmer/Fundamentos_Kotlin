package fundamentos

//Não se pode colocar null numa variável do tipo String não nula, para isso acontecer se coloca um "?" depois do tipo para transformar ele em nulable
fun main() {
    var nome: String? = null

   //println(nome?.length) //sem o "?" a ele não pode receber nulo
   //println(nome!!.length) //pra quando você tem certeza que não é nulo

    var tamanho: Int = nome?.length ?: 0 //indica que e for nulo vai receber zero
    //o elvis-operator é um verificador de nulo
    print(tamanho)

    var lista: List<Int?> = listOf(1, 2, null)  //a lista pode conter null
    var listaNulable: List<Int>? = null //a lista pode ser null
}