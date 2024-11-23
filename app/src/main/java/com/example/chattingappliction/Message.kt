package com.example.chattingappliction

class Message {
    var message:String?=null
    var sendId:String?=null

    constructor()
    constructor(message:String?,senderId:String?){
        this.message=message
        this.sendId=senderId
    }
}