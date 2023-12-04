package com.example.todolistapp

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val tasksList:ArrayList<Task> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toDoTaskEditText:EditText=findViewById(R.id.toDoTaskEditText)

        val plusImage:ImageView=findViewById(R.id.plusImage)
        val refreshImage:ImageView=findViewById(R.id.refreshImage)
        val toDoListRecycler:RecyclerView=findViewById(R.id.ToDoListRecycler)

        toDoListRecycler.layoutManager= LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        plusImage.setOnClickListener()
        {
            tasksList.add(Task(toDoTaskEditText.text.toString()))
//            val adapter=Adapter(tasksList)
//            toDoListRecycler.adapter=adapter
        }

            val adapter=Adapter(tasksList)


        refreshImage.setOnClickListener()
        {
            toDoListRecycler.adapter=adapter
        }



    }
}