package com.coba.uts_app_makanan.model

import com.coba.uts_app_makanan.R

data class ModelMakanan(
    val image : Int,
    val judul : String
)
object Mocklist{
    fun getModel(): List<ModelMakanan>{
        val item1 = ModelMakanan(
            R.drawable.yum,
           "Cake 1"
        )

        val item2 = ModelMakanan(
            R.drawable.yum2,
            "Cake 2"
        )

        val itemList: ArrayList<ModelMakanan> = ArrayList()
        itemList.add(item1)
           itemList.add(item2)
        return itemList

    }
}