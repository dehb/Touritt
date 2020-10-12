package com.dehb.tourit.ui.category

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
<<<<<<< HEAD
import com.dehb.tourit.CategoryModele
import com.dehb.tourit.R
import kotlinx.android.synthetic.main.category_item.view.*

class CategoryAdapter(private var mCategory: ArrayList<CategoryModele>, private var layout: Int): RecyclerView.Adapter<CategoryAdapter.ViewHolder> () {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
var categoryName = view.category_Name
        var categoryImage=view.category_Image
=======
import com.dehb.tourit.R

class CategoryAdapter(): RecyclerView.Adapter<CategoryAdapter.ViewHolder> () {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

>>>>>>> fe80b660d89f3caf687ffd640f210a0d202ff3ec
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.ViewHolder {

        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        )
    }

<<<<<<< HEAD
    override fun getItemCount(): Int {
        return mCategory.size
    }

    override fun onBindViewHolder(holder: CategoryAdapter.ViewHolder, position: Int) {
holder.categoryName.text =mCategory[position].Name
=======
    override fun getItemCount(): Int= 10

    override fun onBindViewHolder(holder: CategoryAdapter.ViewHolder, position: Int) {

>>>>>>> fe80b660d89f3caf687ffd640f210a0d202ff3ec
    }
}