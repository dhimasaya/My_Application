package com.example.myapplication

class Login {

    //Variable
    var username = ""
    var password = ""

    //method
    fun loginCheck():Boolean{
        if(username.equals("dhimas") && password.equals("a1234")) {
            return true
        } else {
            return false
        }
    }
}