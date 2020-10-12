package com.dehb.tourit.ui.category

import android.content.Context
import android.os.Bundle
<<<<<<< HEAD
import android.util.Log
=======
>>>>>>> fe80b660d89f3caf687ffd640f210a0d202ff3ec
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
<<<<<<< HEAD
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
=======
import androidx.fragment.app.Fragment
>>>>>>> fe80b660d89f3caf687ffd640f210a0d202ff3ec
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dehb.tourit.CategoryDetailsViewModel
<<<<<<< HEAD
import com.dehb.tourit.CategoryModele
import com.dehb.tourit.R
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.fragment_category.*
import kotlinx.android.synthetic.main.fragment_category.view.*
import kotlinx.android.synthetic.main.fragment_category.view.category_recycler
import kotlinx.android.synthetic.main.fragment_category.view.fetch
import kotlinx.android.synthetic.main.fragment_home.view.*

class CategoryFragment : Fragment() {

//    private lateinit var categoryViewModel: CategoryViewModel
    val categoryViewModel: CategoryViewModel by activityViewModels()
//    private lateinit var cats: ArrayList<Any>
    val cats = ArrayList<String>()
    val database = FirebaseDatabase.getInstance()
       val myRefCat = database.getReference("Category")
=======
import com.dehb.tourit.R
import kotlinx.android.synthetic.main.fragment_category.*
import kotlinx.android.synthetic.main.fragment_category.view.*
import kotlinx.android.synthetic.main.fragment_category.view.category_recycler

class CategoryFragment : Fragment() {

    private lateinit var categoryViewModel: CategoryViewModel
//    private lateinit var layoutManager: RecyclerView.LayoutManager
//    private lateinit var adapter: CategoryAdapter
>>>>>>> fe80b660d89f3caf687ffd640f210a0d202ff3ec

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
<<<<<<< HEAD
        val root = inflater.inflate(R.layout.fragment_category, container, false)
        fromFirebase()
                categoryViewModel.text.observe(viewLifecycleOwner, Observer {


                    if (cats.isNullOrEmpty()){
                        Log.i("FromFirebasefunc", cats.toString())
                        root.fragment_category.addView(View.inflate(context, R.layout.empty_response_view, null ))
                    } else {

//                        setUpCategoryView(root.category_recycler, cats)
                    }
        })

//        root.fetch.setOnClickListener {
//            fromFirebase()
//        }




=======

        val root = inflater.inflate(R.layout.fragment_category, container, false)

//        category_recycler.layoutManager = LinearLayoutManager(context)
//        category_recycler.adapter = CategoryAdapter()
        setUpCategoryView(root.category_recycler)

//        categoryViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
>>>>>>> fe80b660d89f3caf687ffd640f210a0d202ff3ec
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
<<<<<<< HEAD
//        categoryViewModel =
//            ViewModelProviders.of(this).get(CategoryViewModel::class.java)
        categoryViewModel.text
        // TODO: Use the ViewModel
    }

//    private fun setUpCategoryView(view: RecyclerView) =with(view) {
//        layoutManager = GridLayoutManager(context, 2)
//        adapter = CategoryAdapter()
//    }
    private fun setUpCategoryView(view: RecyclerView, categoryData: ArrayList<CategoryModele>) =  with(view) {
        layoutManager = GridLayoutManager(context, 2)
        adapter = CategoryAdapter(categoryData,  R.layout.category_item)
    }


    private fun fromFirebase() {
        myRefCat.addListenerForSingleValueEvent(object : ValueEventListener {

            override fun onDataChange(dataSnapshot: DataSnapshot) {

                for (e in dataSnapshot.children){
                    val categories: String = e.value.toString()
                    Log.i("FromFirebaseCategori", categories.toString())
                   cats.add(categories!!)
                    Log.i("FromFirebaseCat", cats.toString())
                }

//                val categories = dataSnapshot.children
//                categories.forEach {
//                    cats = it.value!!
//                    Log.i("FromFirebaseCat", cats.toString())
//                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Toast.makeText(requireContext(), "Error fetching data", Toast.LENGTH_LONG)
                    .show()
            }
        })


    }


=======
        categoryViewModel =
            ViewModelProviders.of(this).get(CategoryViewModel::class.java)
        // TODO: Use the ViewModel
    }

    private fun setUpCategoryView(view: RecyclerView) =with(view) {
        layoutManager = GridLayoutManager(context, 2)
        adapter = CategoryAdapter()
    }
>>>>>>> fe80b660d89f3caf687ffd640f210a0d202ff3ec
}