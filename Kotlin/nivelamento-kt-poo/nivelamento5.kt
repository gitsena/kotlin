fun main() {
    somar(10.0, 40.0)
    println(multiplicar(9.0, 9.0))
}

// função com 2 parâmetros e SEM retorno
fun somar(n1:Double, n2:Double) {
    println("A soma dá ${n1 + n2}")
}

// função com 2 parâmetros e COM retorno do tipo String
fun multiplicar(n1:Double, n2:Double):String {
    return "A multiplicação dá ${n1 * n2}"
}