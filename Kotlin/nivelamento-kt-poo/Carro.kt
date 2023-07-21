class Carro {
    // lateinit -> é uma "promessa" de que o atributo só será solicitado
    // se, antes, tiver setado seu valor
     lateinit var fabricante:String
     lateinit var modelo:String

     // nos tipos Int, Boolean e Doblr, não podemos usar lateinit
     var km:Int = 0
}

fun main() {
    // instanciando um objeto em Kotlin
    val carro1 = Carro()

    // não existe construtor criado "automático"
    // val carro2 = Carro("fiat", "argo", 900)

    // no Kotlin, a não ser o atributo seja explicitamente public
    // "por baixo dos panos", acessamos seu get/set

    carro1.fabricante = "fiat" // na verdade, foi usado o .setFabricante("fiat")
    carro1.modelo = "argo"
    carro1.km = 900

    // foi usado o .getFabricante() e assim por diante
    println("${carro1.fabricante} - ${carro1.modelo} - ${carro1.km}")

    val carro2 = Carro()
    println("${carro2.fabricante} - ${carro2.modelo} - ${carro2.km}")

}



