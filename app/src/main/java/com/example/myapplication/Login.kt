package com.example.myapplication

class Login {

    //Variable
    var username = ""
    var password = ""

    //method
    fun loginCheck():Boolean{
        if(username.equals("") && password.equals("")) {
            return true
        } else {
            return false
        }
    }
}