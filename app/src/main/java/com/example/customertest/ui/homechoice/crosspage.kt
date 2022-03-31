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

class crosspage : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var crossborlist : ArrayList<data>
    private lateinit var crossadapter : adapter
    private lateinit var db : FirebaseFirestore



    override fun onCreate(saveInstanceState: Bundle?){

        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_crosspage)

        recyclerView = findViewById(R.id.crosspg)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        crossborlist = arrayListOf()
        crossadapter = adapter(crossborlist)
        recyclerView.adapter = crossadapter

        EventChangeListener()

    }

    private fun EventChangeListener()
    {
        db = FirebaseFirestore.getInstance()
        db.collection("crossbor").
            addSnapshotListener(object : EventListener <QuerySnapshot>
            {
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
                            crossborlist.add(dc.document.toObject(data::class.java))
                        }
                    }
                    crossadapter.notifyDataSetChanged()
                }
            }
            )



        }



}



