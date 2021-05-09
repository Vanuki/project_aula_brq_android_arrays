package br.com.brq.project_aula_brq_android_arrays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carregarElementos()
        carregarArray()


    }

    fun carregarElementos(){
        recycler = findViewById(R.id.reciclador)
    }
    fun carregarArray(){
        var arrayDeAnimais: ArrayList<String> = ArrayList()
        arrayDeAnimais.add("Cachorro")
        arrayDeAnimais.add("Gato")
        arrayDeAnimais.add("Camelo")
    }

}