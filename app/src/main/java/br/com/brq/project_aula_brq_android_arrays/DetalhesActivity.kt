package br.com.brq.project_aula_brq_android_arrays

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.brq.project_aula_brq_android_arrays.model.Pessoa

class DetalhesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        val nossoNomeEnviadoPorParametro = intent.getStringExtra("parametro_nome")
        val nossoObjetoPessoa : Pessoa = intent.getSerializableExtra("parametro_objeto") as Pessoa

        val textViewTitle = findViewById<TextView>(R.id.textView_titulo)

        textViewTitle.text = "${nossoObjetoPessoa.nome} - ${nossoObjetoPessoa.idade}"
    }
}