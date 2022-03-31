package com.example.customertest.ui.homechoice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.customertest.Adapter.adapter
import com.example.customertest.data.data
import com.example.customertest.R
import com.google.firebase.firestore.*

class domespage : AppCompatActivity() {


    private lateinit var recyclerView: RecyclerView
    private lateinit var domeslist : ArrayList<data>
    private lateinit var domesadapter : adapter
    private lateinit var db : FirebaseFirestore

    override fun onCreate(saveInstanceState: Bundle?){

        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_domespage)

        recyclerView = findViewById(R.id.domespg)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        recyclerView.isClickable = true

        domeslist = arrayListOf()
        domesadapter = adapter(domeslist)
        recyclerView.adapter = domesadapter

        EventChangeListener()

    }

    private fun EventChangeListener()
    {
        db = FirebaseFirestore.getInstance()
        db.collection("domestic").
        addSnapshotListener(object : EventListener<QuerySnapshot> {

            override fun onEvent(value: QuerySnapshot?, error: FirebaseFirestoreException?)
            {
                if (error!=null)
                {
                    Log.e("Firestore error", error.message.toString())
                    return
                }

                for (dc : DocumentChange in value?.documentChanges!!)
                {
                    if(dc.type == DocumentChange.Type.ADDED)
                    {
                        domeslist.add(dc.document.toObject(data::class.java))
                    }
                }

                domesadapter.notifyDataSetChanged()
            }

        })

    }
}