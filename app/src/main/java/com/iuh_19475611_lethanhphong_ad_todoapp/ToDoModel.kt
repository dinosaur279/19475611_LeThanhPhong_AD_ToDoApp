package com.iuh_19475611_lethanhphong_ad_todoapp

class ToDoModel {
    companion object Factory{
        fun createList(): ToDoModel = ToDoModel()
    }
    var UID : String? = null
    var itemDataText : String? = null
    var done : Boolean? = false
}