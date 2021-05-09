package br.com.brq.project_aula_brq_android_arrays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycler: RecyclerView
    lateinit var arrayDeAnimais: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carregarElementos()
        carregarArray()

        recycler.adapter = Adapter(this, arrayDeAnimais)
        recycler.layoutManager = LinearLayoutManager(this)

    }

    fun carregarElementos(){
        recycler = findViewById(R.id.reciclador)
    }
    fun carregarArray(){
        arrayDeAnimais = ArrayList()
        arrayDeAnimais.add("Cachorro")
        arrayDeAnimais.add("Gato")
        arrayDeAnimais.add("Camelo")
    }

}