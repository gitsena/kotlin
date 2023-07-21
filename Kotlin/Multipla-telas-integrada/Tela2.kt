package sptech.projetoautenticacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Tela2 : AppCompatActivity() {

    // somente declarando a existência da TextView
    lateinit var tvAutenticacao:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        // inicializando a TextView. Como está no "onCreate()", acontecerá "antes de tudo"
        tvAutenticacao = findViewById(R.id.tv_autenticacao)
        validarAutenticacao()
    }

    fun validarAutenticacao() {
        // recuperando os dados enviados pela Activity anterior
        val login = intent.getStringExtra("login")
        val senha = intent.getStringExtra("senha")

        /*if (login == "lololo" && senha == "sesese") {
            tvAutenticacao.text = "Bem vindo, usuário Loko!"
        } else {
            tvAutenticacao.text = "Login e/ou senha inválidos!"
        }*/

        val loginSenha = "$login-$senha" // apenas "juntando" o login com a senha

        // instância do cliente da API
        val apiUsuarios = Apis.getApiUsuarios()

        // instância do EndPoint (chamada) que busca p/ login e senha na API
        val chamadaGet = apiUsuarios.getPorLoginSenha(loginSenha)

        // iniciando uma chamada ASSÍNCRONA na API
        chamadaGet.enqueue(object : Callback<List<Usuario>> { // do pacote retrofit2

            // quando houver comunicação com a API
            override fun onResponse(call: Call<List<Usuario>>, response: Response<List<Usuario>>) {
                if (response.isSuccessful) { // status 2xx (200, 201, 204 etc)
                    val usuarios = response.body()
                    if (usuarios?.isNotEmpty()!!) {
                        tvAutenticacao.text = "Usuário ${usuarios[0]?.nome} autenticado!"
                    } else {
                        tvAutenticacao.text = "Login e/ou senha inválidos"
                    }
                } else {
                    tvAutenticacao.text = "Login e/ou senha inválidos"
                }
            }

            // quando não houver comunicação com a API
            override fun onFailure(call: Call<List<Usuario>>, t: Throwable) {
                Toast.makeText(baseContext, "Erro na API: ${t.message}",
                                                    Toast.LENGTH_SHORT).show()
                t.printStackTrace()
            }

        })

    }
}




