package br.com.brq.project_aula_brq_android_arrays

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.brq.project_aula_brq_android_arrays.model.Pessoa

class Adapter(val contexto: Context, val listaDePessoas: ArrayList<Pessoa>, val onClick:SuporteDeVisaoPessoas.ItemClickListener) : RecyclerView.Adapter<SuporteDeVisaoPessoas>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuporteDeVisaoPessoas {
        val inflador:LayoutInflater = LayoutInflater.from(contexto)
        val visao:View = inflador.inflate(R.layout.item_da_lista, parent, false)
        return SuporteDeVisaoPessoas(visao, onClick)
    }

    override fun onBindViewHolder(holder: SuporteDeVisaoPessoas, position: Int) {
        listaDePessoas[position].also{
            holder.item1.text = "${it.nome}"
            holder.item2.text = "Idade: ${it.idade} Sexo: ${it.sexo}"
            holder.imagem.setImageResource(it.photo)
        }
    }

    override fun getItemCount(): Int {
        return listaDePessoas.size
    }

    fun addItem(pessoa:Pessoa){
        listaDePessoas.add(pessoa)
        notifyDataSetChanged()
    }

    fun removeItem(index: Int){
        listaDePessoas.removeAt(index)
        notifyDataSetChanged()
    }
}



class SuporteDeVisaoPessoas(visaoDeItem:View, private val Interface:ItemClickListener) :
    RecyclerView.ViewHolder(visaoDeItem), View.OnClickListener, View.OnLongClickListener {

    var item1: TextView
    var item2: TextView
    var imagem: ImageView

    init {
        item1 = itemView.findViewById(R.id.item1)
        item2 = itemView.findViewById(R.id.item2)
        imagem = itemView.findViewById(R.id.image)
        visaoDeItem.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        Interface.onClickItem(v, adapterPosition)
    }

    override fun onLongClick(v: View?): Boolean {
        Interface.onLongClickItem(v, adapterPosition)
        return true
    }

    interface ItemClickListener {

        fun onClickItem(view: View?, index: Int)
        fun onLongClickItem(view: View?, index: Int)
    }
}