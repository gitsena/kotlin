fun main() {

    val idade = 16

    if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("De menor!")
    }

    // if-else de 1 linha
    println(if (idade >= 18) "Maior de idade" else "De menor")

    // when para execução de instrução
    when (idade) {
        in 0..3 -> println("um bebê")
        10 -> println("um pré adolescente")
        in 15..17 -> println("um quase adulto")
        18 -> {
            println("um adulto")
            println("agora pague os boletos!")
        }
        40 -> println("uma pessoa madura")
        else -> println("idade não cadastrada")
    }

    // when que retorna valor para uma variável
    val resultado = when (idade) {
        in 0..3 -> "um bebê"
        10 -> "um pré adolescente"
        in 15..17 -> "um quase adulto"
        18 -> "um adulto"
        40 -> "uma pessoa madura"
        else -> "idade não cadastrada"
    }
    println(resultado)
}






