
/*
uma data class:
 - define AO MESMO TEMPO seu construtor e seus atributos
 - possui um "toString()" automático
 - o que é val não pode ser alterado após a instanciação. O que é var pode
 */
data class Usuario(val login:String, var senha:String, var nivelAcesso:Int)

fun main() {

    val usuario1 = Usuario("aidmin", "seinha", 10)

    println("${usuario1.login} - ${usuario1.senha} - ${usuario1.nivelAcesso}")

    println(usuario1)

  // esta linha não compila pois login é val
  //  usuario1.login = "novologin"
    println(usuario1)

    val usuarioA = Usuario("l", "s", 1)
    val usuarioB = Usuario("l", "s", 1)
    // no kotlin, o == compara os valores dos objetos e não se são a mesma instância
    println(usuarioA == usuarioB)

}






