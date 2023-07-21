package sptech.projetoautenticacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun entrar(componente:View) {

        // criando um objeto que permite a navegação p/ outra Activity (tela)
        // no caso, ele permitirá a ida para a Tela2
        val tela2 = Intent(applicationContext, Tela2::class.java)

        // recuperei valores da tela
        val login = findViewById<EditText>(R.id.et_login).text.toString()
        val senha = findViewById<EditText>(R.id.et_senha).text.toString()

        tela2.putExtra("login", login) // enviando um dado de nome "login"
        tela2.putExtra("senha", senha) // enviando um dado de nome "senha"

        // inicia a navegação para a tela (Tela2)
        startActivity(tela2)
    }
}


