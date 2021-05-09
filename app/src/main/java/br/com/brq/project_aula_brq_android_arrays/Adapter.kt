package br.com.brq.project_aula_brq_android_arrays

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val contexto: Context, val listaDeAnimais: ArrayList<String>) : RecyclerView.Adapter<SuporteDeVisaoAnimais>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuporteDeVisaoAnimais {
        val inflador:LayoutInflater = LayoutInflater.from(contexto)
        val visao:View = inflador.inflate(R.layout.item_da_lista, parent, false)
        return SuporteDeVisaoAnimais(visao)
    }

    override fun onBindViewHolder(holder: SuporteDeVisaoAnimais, position: Int) {
        holder.titulo.text = listaDeAnimais[position]
    }

    override fun getItemCount(): Int {
        return listaDeAnimais.size
    }
}


class SuporteDeVisaoAnimais(visaoDeItem:View) : RecyclerView.ViewHolder(visaoDeItem){

    var titulo:TextView

    init {
        titulo = itemView.findViewById(R.id.item)
    }
}