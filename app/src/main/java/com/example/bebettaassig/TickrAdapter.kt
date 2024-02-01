package com.example.bebettaassig

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bebettaassig.databinding.MatchPriviewBinding
import com.example.bebettaassig.databinding.TickrLayoutBinding

class TickrAdapter(val context: Context, val list:ArrayList<TickrData>): RecyclerView.Adapter<TickrAdapter.ViewHolder>() {
    class ViewHolder(val binding:TickrLayoutBinding)
        :RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TickrLayoutBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.img.setImageResource(list[position].img!!)
        holder.binding.text.text=list[position].text
    }

    override fun getItemCount(): Int {
        return list.size
    }
}