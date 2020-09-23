package com.dehb.tourit.ui.category

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dehb.tourit.CategoryDetailsViewModel
import com.dehb.tourit.R
import kotlinx.android.synthetic.main.fragment_category.*
import kotlinx.android.synthetic.main.fragment_category.view.*
import kotlinx.android.synthetic.main.fragment_category.view.category_recycler

class CategoryFragment : Fragment() {

    private lateinit var categoryViewModel: CategoryViewModel
//    private lateinit var layoutManager: RecyclerView.LayoutManager
//    private lateinit var adapter: CategoryAdapter

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_category, container, false)

//        category_recycler.layoutManager = LinearLayoutManager(context)
//        category_recycler.adapter = CategoryAdapter()
        setUpCategoryView(root.category_recycler)

//        categoryViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        categoryViewModel =
            ViewModelProviders.of(this).get(CategoryViewModel::class.java)
        // TODO: Use the ViewModel
    }

    private fun setUpCategoryView(view: RecyclerView) =with(view) {
        layoutManager = GridLayoutManager(context, 2)
        adapter = CategoryAdapter()
    }
}