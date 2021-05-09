package br.com.brq.project_aula_brq_android_arrays

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter(val contexto: Context, val listaDeAnimais: ArrayList<String>) : RecyclerView.Adapter<SuporteDeVisaoProduto>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuporteDeVisaoProduto {
        val inflador:LayoutInflater = LayoutInflater.from(contexto)
        val visao:View = inflador.inflate(R.layout.item_da_lista, parent, false)
        return SuporteDeVisaoProduto(visao)
    }

    override fun onBindViewHolder(holder: SuporteDeVisaoProduto, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return listaDeAnimais.size
    }
}



class SuporteDeVisaoProduto(visaoDeItem:View) : RecyclerView.ViewHolder(visaoDeItem){

}