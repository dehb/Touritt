package com.dehb.tourit.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dehb.tourit.R
import com.dehb.tourit.Site
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_search.view.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
//    private lateinit var layoutManager: RecyclerView.LayoutManager
val database = FirebaseDatabase.getInstance()
    val myRef = database.getReference("message")
    val myRefD = database.getReference("Data")

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
//        setUpHomeView(root.home_recycler)
//        val textView: TextView = root.findViewById(R.id.text_home)
        root.submit.setOnClickListener {
            toFirebase()
        }
        root.fetch.setOnClickListener {
            fromFirebase()
        }
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
        })
        return root
    }

    private fun fromFirebase() {
//        myRefD.addListenerForSingleValueEvent(object : ValueEventListener {
//
//            override fun onDataChange(dataSnapshot: DataSnapshot) {
//                val value = dataSnapshot.getValue(Site::class.java)
//               Log.i("FromFirebase", value!!.toString())
//            }
//
//            override fun onCancelled(databaseError: DatabaseError) {
//                Toast.makeText(requireContext(), "Error fetching data", Toast.LENGTH_LONG)
//                    .show()
//            }
//        })

        val postListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val place = dataSnapshot.getValue()
                Log.i("FromFirebase", place!!.toString())

//                val places = dataSnapshot.getValue().forEach()
//              val value = dataSnapshot.getValue(Site::class.java)
//               Log.i("FromFirebaseee", value!!.toString())
            }
            override fun onCancelled(databaseError: DatabaseError) {
               Toast.makeText(requireContext(), "Error fetching data", Toast.LENGTH_LONG)
                    .show()
            }
        }
        myRefD.addValueEventListener(postListener)
    }

    private fun toFirebase() {
                myRef.setValue("Hello World!! Im Rival :)")
    }
//    fun setUpHomeView(searchRecycler: RecyclerView){
//        layoutManager = LinearLayoutManager(context)
////        adapter =
//    }
}