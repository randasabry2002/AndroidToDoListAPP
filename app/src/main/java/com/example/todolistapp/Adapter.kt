package com.example.todolistapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class Adapter (private val tasksList:ArrayList<Task>):RecyclerView.Adapter<Adapter.ViewHolder>(){


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val task :TextView=itemView.findViewById(R.id.itemTaskText)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.task_item,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return tasksList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.task.text=tasksList[position].task
    }
}