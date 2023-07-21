package sptech.projetoautenticacao

import com.google.gson.annotations.SerializedName
import java.time.ZonedDateTime

// data class que "mapeia", "espelha" um JSON da API de autenticação
data class Usuario(
    val nome:String,
    // @field:SerializedName indica qual o nome do campo no JSON
    @field:SerializedName("login_senha") val loginSenha:String,
    val salario:Double,
    val id:Int
)
