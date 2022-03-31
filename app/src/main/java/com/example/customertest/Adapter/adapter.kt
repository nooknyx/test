package com.example.customertest.Adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.customertest.data.data
import com.example.customertest.R

class adapter(private val datalist: ArrayList<data> )
    : RecyclerView.Adapter<adapter.MyViewHolder>()
{


        override fun onCreateViewHolder( parent: ViewGroup,viewType: Int ): adapter.MyViewHolder
    {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.urllist, parent,false)

        return MyViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: adapter.MyViewHolder, position: Int)
    {
        val urldata : data = datalist[position]
        holder.name.text = urldata.name
        holder.url.text = urldata.url



        holder.itemView.setOnClickListener(
            View.OnClickListener {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse(urldata.url.toString())
                    )
                )
            }
        )


    }

    private fun startActivity(intent: Intent) {
        return
    }

    override fun getItemCount(): Int
    {
        return datalist.size
    }

    public class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val name: TextView = itemView.findViewById(R.id.system)
        val url: TextView = itemView.findViewById(R.id.descrip)
    }

    interface OnItemClickListener
    {
        fun onItemClick()
    }

}
