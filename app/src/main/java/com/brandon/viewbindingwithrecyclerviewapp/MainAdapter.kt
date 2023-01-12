package com.brandon.viewbindingwithrecyclerviewapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.brandon.viewbindingwithrecyclerviewapp.databinding.RecyclerviewItemBinding

class MainAdapter(val taskList : List<Task>) :RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    // itemBinding.root 는 현재의 ViewHolder 가리킴
    inner class MainViewHolder(val itemBinding : RecyclerviewItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bindItem(task : Task) {
            itemBinding.titleTv.text = task.title
            itemBinding.timeTv.text = task.timeStamp
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(RecyclerviewItemBinding.inflate(LayoutInflater.from((parent.context)), parent, false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        // TaskList 에 등록된 순서대로 position 이 0 번부터 넘버링 됨
        val task = taskList[position]
        holder.bindItem(task)
    }

    override fun getItemCount(): Int {
        return taskList.size
    }

}