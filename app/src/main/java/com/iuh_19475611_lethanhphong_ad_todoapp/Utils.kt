package com.iuh_19475611_lethanhphong_ad_todoapp

object Utils {
    fun getStatus(status: Boolean) : String {
        return when (status) {
            true -> "Completed"
            else -> "Not Completed"
        }
    }
}