package br.com.brq.project_aula_brq_android_arrays.model

import androidx.annotation.DrawableRes
import java.io.Serializable

class Pessoa(val nome:String, val idade:Int,@DrawableRes val photo:Int, val sexo:String): Serializable {
}