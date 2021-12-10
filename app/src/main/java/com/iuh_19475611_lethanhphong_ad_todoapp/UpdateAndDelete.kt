package com.iuh_19475611_lethanhphong_ad_todoapp

interface UpdateAndDelete{
    fun modifyItem(itemUID : String , isDone : Boolean)
    fun onItemDelete(itemUID : String)
}