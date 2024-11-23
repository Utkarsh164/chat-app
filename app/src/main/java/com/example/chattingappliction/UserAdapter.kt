package com.example.chattingappliction

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth

class UserAdapter(val context: Context, val userList:ArrayList<User>): RecyclerView.Adapter<UserAdapter.MyViewHolder>() {


    lateinit var firebaseAuth: FirebaseAuth
    //lateinit var databaseReference: DatabaseReference



    class MyViewHolder(val itemview: View): RecyclerView.ViewHolder(itemview) {
        val tex=itemview.findViewById<TextView>(R.id.txt_name)




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inf= LayoutInflater.from(parent.context).inflate(R.layout.user_layout,parent,false)
        return MyViewHolder(inf)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val cur=userList[position]
//        holder.tex.text=cur.name

        val displayName = if (!cur.name.isNullOrEmpty() && cur.name!!.length > 17) {
            cur.name!!.substring(0, 17) + "..."
        } else {
            cur.name ?: "Unknown"  // Handle null name, default to "Unknown"
        }

        // Set the truncated or full name
        holder.tex.text = displayName

        holder.itemview.setOnClickListener {
            val intent=Intent(context,ChatActivity::class.java)
            intent.putExtra("name",cur.name)
            intent.putExtra("uid",cur.uid)
            context.startActivity(intent)
        }



    }

    override fun getItemCount(): Int {
        return userList.size
    }
}


