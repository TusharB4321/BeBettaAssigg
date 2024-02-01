package com.example.bebettaassig

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bebettaassig.databinding.MatchPriviewBinding

class MatchAdapter(val context: Context, val list:ArrayList<PreviewData>): RecyclerView.Adapter<MatchAdapter.ViewHolder>() {
    class ViewHolder(val binding:MatchPriviewBinding)
        :RecyclerView.ViewHolder(binding.root){

    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.player.setImageResource(list[position].player!!)
        holder.binding.prevback.setImageResource(list[position].prevback!!)
        holder.binding.blur.setImageResource(list[position].blur!!)
        holder.binding.team1.text=list[position].team1
        holder.binding.team2.text=list[position].team2
        holder.binding.time.text=list[position].time

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(MatchPriviewBinding.inflate(LayoutInflater.from(context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }
}