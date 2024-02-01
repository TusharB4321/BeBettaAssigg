package com.example.bebettaassig

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bebettaassig.databinding.MatchPriviewBinding
import com.example.bebettaassig.databinding.SportsBinding

class SportAdapter(val context: Context, val list:ArrayList<SportsData>): RecyclerView.Adapter<SportAdapter.ViewHolder>() {
    class ViewHolder(val binding:SportsBinding)
        :RecyclerView.ViewHolder(binding.root){

    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

       holder.binding.logo1.setImageResource(list[position].logo1!!)
       holder.binding.logo2.setImageResource(list[position].logo2!!)
        holder.binding.text1.text=list[position].text1
        holder.binding.text2.text=list[position].text2
        holder.binding.no1.text=list[position].no1
        holder.binding.no2.text=list[position].no2
        holder.binding.time.text=list[position].time


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(SportsBinding.inflate(LayoutInflater.from(context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }
}