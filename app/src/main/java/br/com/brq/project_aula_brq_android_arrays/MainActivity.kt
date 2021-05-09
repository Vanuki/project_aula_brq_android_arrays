package br.com.brq.project_aula_brq_android_arrays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.brq.project_aula_brq_android_arrays.model.Pessoa

class MainActivity : AppCompatActivity() {

    lateinit var recycler: RecyclerView
    lateinit var arrayDePessoas: ArrayList<Pessoa>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carregarElementos()
        carregarArray()

        recycler.adapter = Adapter(this, arrayDePessoas)
        recycler.layoutManager = LinearLayoutManager(this)

    }

    fun carregarElementos(){
        recycler = findViewById(R.id.reciclador)
    }
    fun carregarArray(){
        arrayDePessoas = ArrayList()
        arrayDePessoas.add(Pessoa("Rodolfo", 25, R.drawable.ic_android))
        arrayDePessoas.add(Pessoa("Sharanore", 66, R.drawable.ic_helmet))
        arrayDePessoas.add(Pessoa("Shuraste", 79, R.drawable.ic_airplane))


    }

}