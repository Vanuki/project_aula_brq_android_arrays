package br.com.brq.project_aula_brq_android_arrays

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.brq.project_aula_brq_android_arrays.model.Pessoa

class Adapter(val contexto: Context, val listaDePessoas: ArrayList<Pessoa>) : RecyclerView.Adapter<SuporteDeVisaoPessoas>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuporteDeVisaoPessoas {
        val inflador:LayoutInflater = LayoutInflater.from(contexto)
        val visao:View = inflador.inflate(R.layout.item_da_lista, parent, false)
        return SuporteDeVisaoPessoas(visao)
    }

    override fun onBindViewHolder(holder: SuporteDeVisaoPessoas, position: Int) {
        listaDePessoas.get(position).also{
            holder.item1.text = "${it.nome}"
            holder.item2.text = "Idade: ${it.idade}"
            holder.imagem.setImageResource(it.photo)
        }
    }

    override fun getItemCount(): Int {
        return listaDePessoas.size
    }
}


class SuporteDeVisaoPessoas(visaoDeItem:View) : RecyclerView.ViewHolder(visaoDeItem){

    var item1:TextView
    var item2:TextView
    var imagem:ImageView

    init {
        item1 = itemView.findViewById(R.id.item1)
        item2 = itemView.findViewById(R.id.item2)
        imagem = itemView.findViewById(R.id.image)
    }
}