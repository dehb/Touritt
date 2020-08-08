package com.dehb.tourit

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_search.view.*

class CategoryDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = CategoryDetailsFragment()
    }

    private lateinit var viewModel: CategoryDetailsViewModel
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root =  inflater.inflate(R.layout.category_details_fragment, container, false)
        setUpCategoryDetailsView(root.search_recycler)
        return root
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CategoryDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }
    private fun setUpCategoryDetailsView(searchRecycler: RecyclerView?) {
        layoutManager = LinearLayoutManager(context)
//        adapter =
    }
}