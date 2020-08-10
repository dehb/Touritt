package com.dehb.tourit.ui.category

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dehb.tourit.R

class CategoryAdapter(): RecyclerView.Adapter<CategoryAdapter.ViewHolder> () {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.ViewHolder {

        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        )
    }

    override fun getItemCount(): Int= 10

    override fun onBindViewHolder(holder: CategoryAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}