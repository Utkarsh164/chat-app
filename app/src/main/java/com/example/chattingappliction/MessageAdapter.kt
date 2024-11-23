package com.example.chattingappliction

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chattingappliction.UserAdapter.MyViewHolder
import com.google.firebase.auth.FirebaseAuth

class MessageAdapter(val context:Context,val messageList:ArrayList<Message>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    val ITEM_RECEIVE=1;
    val ITEM_SENT=2;


    class SentViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val sendmessage = itemview.findViewById<TextView>(R.id.send_message)

    }

    class RecieveViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val receive = itemview.findViewById<TextView>(R.id.receive_message)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType==1){
            val inf= LayoutInflater.from(parent.context).inflate(R.layout.receive,parent,false)
            return RecieveViewHolder(inf)
        }
        else{
            val inf= LayoutInflater.from(parent.context).inflate(R.layout.sent,parent,false)
            return SentViewHolder(inf)
        }
    }

    override fun getItemCount(): Int {
        return messageList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val currentMessage=messageList[position]
        if(holder.javaClass==SentViewHolder::class.java){

            val viewHolder=holder as SentViewHolder
           holder.sendmessage.text=currentMessage.message
//            viewHolder.sendmessage.text=currentMessage.message
        }
        else{
            val viewHolder=holder as RecieveViewHolder
            holder.receive.text=currentMessage.message
//            viewHolder.receive.text=currentMessage.message
        }
    }

    override fun getItemViewType(position: Int): Int {
        val currentMessage=messageList[position]
        if(FirebaseAuth.getInstance().currentUser?.uid.equals(currentMessage.sendId)){
            return ITEM_SENT
        }
        else{return ITEM_RECEIVE}
    }
}