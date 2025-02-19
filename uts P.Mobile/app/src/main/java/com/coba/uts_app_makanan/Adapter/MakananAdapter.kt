package com.coba.uts_app_makanan.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.coba.uts_app_makanan.DetailMakanan
import com.coba.uts_app_makanan.R
import com.coba.uts_app_makanan.RecycleMakanan
import com.coba.uts_app_makanan.model.ModelMakanan

class MakananAdapter (
    val itemList: ArrayList<ModelMakanan>,
    private val getActivity: RecycleMakanan
) : RecyclerView.Adapter<MakananAdapter.MyViewHolder>(){
    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage : ImageView
        var itemText : TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar)
            itemText = itemView.findViewById(R.id.nama_makanan)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_custom_makanan, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemText.setText(itemList[position].judul)

        holder.itemView.setOnClickListener(){
            val intent = Intent(getActivity, DetailMakanan::class.java)

            intent.putExtra("image", itemList[position].image)
            intent.putExtra("judul", itemList[position].judul)
            getActivity.startActivity(intent)
        }
    }
}
