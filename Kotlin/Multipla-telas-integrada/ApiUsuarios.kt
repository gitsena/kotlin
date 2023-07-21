package sptech.projetoautenticacao

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiUsuarios {

  /*
  Mapeando o EndPoint que traz todos os usuários.
  Retorno Call<List<Usuario>> -> indica que, se o endpoint for invocado,
     seu retorno será uma lista de Usuario
   */
  @GET("usuarios")
  fun getTodos() : Call<List<Usuario>> // Call do pacote retrofit2


  /*
  Mapeando o EndPoint que traz todos os usuários com um determinado login e senha.
  Retorno Call<List<Usuario>> -> indica que, se o endpoint for invocado,
     seu retorno será uma lista de Usuario

  @Query("login_senha") -> indica que o nome do query param na API é "login_senha"
  ou, seja, a URL será algo como: http://...../usuarios?login_senha=abc-xyz
   */
  @GET("usuarios")
  fun getPorLoginSenha(@Query("login_senha") loginSenha:String) : Call<List<Usuario>>

}