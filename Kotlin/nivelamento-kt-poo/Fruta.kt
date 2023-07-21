
class Fruta {
    // os atributos de instância são, por padrão, privados
    // mas são criados get/set públicos para eles
    var nome:String = ""
    var preco:Double = 0.0
    var emPromocao:Boolean = false

    // se for explicitamente private não cria get/set
    private var quantidadeEmEstoque:Int = 0
}

