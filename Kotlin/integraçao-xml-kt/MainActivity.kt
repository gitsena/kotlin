package sptech.projetoformulario

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*
Só é possível chamar uma função da classe no XML
caso ela tenha um parâmetro do tipo View
     */
    fun cadastrar(componente:View) {

        // getString(R.string.<chave i18n no strings.xml>)
        // isso recupera um texto do strings.xml em tempo de execução
        Toast.makeText(baseContext, getString(R.string.txt_toast), Toast.LENGTH_SHORT).show()

        // recuperando os componentes do XML na classe Kotlin
        // findViewById<NomeDaTag>(R.id.<id do elemento>)

        val etNome = findViewById<EditText>(R.id.et_nome)
        val etIdade = findViewById<EditText>(R.id.et_idade)
        val tvResultado = findViewById<TextView>(R.id.tv_resultado)
        // assim também funciona!
        // val tvResultado:TextView = findViewById(R.id.tv_resultado)

        var valido = true

        if (etNome.text.isBlank()) {
            valido = false
            etNome.error = getString(R.string.txt_nome_obrigatorio)
        } else if (etNome.text.length < 5) {
            valido = false
            etNome.error = "O nome deve ter pelo menos 5 letras"
        }
        if (etIdade.text.isBlank()) {
            valido = false
            etIdade.error = "A idade é obrigatória"
        } else if (etIdade.text.toString().toInt() > 120) {
            valido = false
            etIdade.error = "A idade deve ser até 120"
        }

        // alterando o texto de um elemento (funciona para TextView e EditText)
        if (valido) {
            // getString(R.string.<chave i18n no strings.xml>, parâmetro1, parâmetro2, parâmetro3...)
            // isso recupera um texto do strings.xml em tempo de execução que espera por parâmetros
            tvResultado.text = getString(
                R.string.txt_resultado,
                etNome.text.toString(), // isso substituirá o %1$s
                etIdade.text.toString().toInt() // isso substituirá o %2$d
            )
            tvResultado.setTextColor(Color.BLUE)
            // mudando a cor do texto usando valor estático
        } else {
            tvResultado.text = "Cadastro inválido!"
            tvResultado.setTextColor(Color.parseColor("#FF0000"))
            // mudando a cor do texto usando código RGB
            // tvResultado.setTextColor(R.color.teal_700)
            // mudando a cor do texto usando valor do colors.xml
        }



    }

}




