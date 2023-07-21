package sptech.projetoautenticacao

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*
Um object é uma classe a qual será criada apenas
1 instância por todo o projeto
 */
object Apis {
    var BASE_URL = "https://5f861cfdc8a16a0016e6aacd.mockapi.io/sptech-api/"

    // função que cria uma instância de cliente da Api de autenticação
    fun getApiUsuarios() : ApiUsuarios {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
        return retrofit.create(ApiUsuarios::class.java)
    }

}