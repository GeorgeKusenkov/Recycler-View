package com.example.recyclerview.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.MySimpleListItemBinding

class MySimpleAdapter(
    private val values: List<String>
): RecyclerView.Adapter<MySimpleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MySimpleViewHolder {
        val binding = MySimpleListItemBinding.inflate(LayoutInflater.from(parent.context))
        return MySimpleViewHolder(binding)
    }

    //что нужно отобразить и куда нужно отобразить
    override fun onBindViewHolder(holder: MySimpleViewHolder, position: Int) {
        val item = values[position]
        holder.binding.testField.setText(item)
    }

    override fun getItemCount(): Int = values.size
}

//Adapter - это дженерик класс и необходимо предоставить информацию о типе, который должен быть наследником viewHolder. Создадим сой пустой класс
class MySimpleViewHolder(val binding: MySimpleListItemBinding): RecyclerView.ViewHolder(binding.root)