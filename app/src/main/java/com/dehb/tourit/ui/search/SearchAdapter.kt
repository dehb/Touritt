package com.dehb.tourit.ui.search

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dehb.tourit.R
import com.dehb.tourit.ui.category.CategoryAdapter

class SearchAdapter: RecyclerView.Adapter<SearchAdapter.ViewHolder> () {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchAdapter.ViewHolder {

        return SearchAdapter.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.search_item, parent, false)
        )
    }

    override fun getItemCount(): Int =10

    override fun onBindViewHolder(holder: SearchAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}