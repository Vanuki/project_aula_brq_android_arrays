package br.com.brq.project_aula_brq_android_arrays

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.brq.project_aula_brq_android_arrays.model.Pessoa

class MainActivity : AppCompatActivity() {

    var recycler: RecyclerView? = null
    var fabButton: View? = null
    lateinit var arrayDePessoas: ArrayList<Pessoa>
    var adapter: Adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carregarElementos()
        carregarEventos()
        carregarArray()

        Adapter(this, arrayDePessoas, this).let {
            adapter = it
            recycler?.adapter = it
        }
        recycler?.layoutManager = LinearLayoutManager(this)

    }

    fun carregarElementos(){
        recycler = findViewById(R.id.reciclador)
    }
    fun carregarEventos() {
        fabButton?.setOnClickListener {
            adapter?.addItem(Pessoa("Nova pessoa", 10, R.drawable.ic_helmet, "F"))
        }
    }
    fun carregarArray(){
        arrayDePessoas = ArrayList()
        arrayDePessoas.add(Pessoa("Rodolfo", 25, R.drawable.ic_android,"M"))
        arrayDePessoas.add(Pessoa("Sharanore", 66, R.drawable.ic_helmet,"M"))
        arrayDePessoas.add(Pessoa("Shuraste", 79, R.drawable.ic_airplane,"M"))
    }
    fun onClickItem(visao:View, index:Int){
        val intent = Intent(this, DetalhesActivity::class.java)
        intent.putExtra("parametro_nome", arrayDePessoas[index].nome)
        intent.putExtra("parametro_objeto", arrayDePessoas[index])
        startActivity(intent)
    }
    fun onLongClickItem(view: View?, index: Int) {
        adapter?.removeItem(index)
    }
}