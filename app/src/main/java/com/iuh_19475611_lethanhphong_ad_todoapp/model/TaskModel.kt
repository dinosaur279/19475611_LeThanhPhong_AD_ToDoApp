package com.iuh_19475611_lethanhphong_ad_todoapp.model

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class TaskModel(
    val id: String? = null,
    val data: TaskItemModel? = null
)