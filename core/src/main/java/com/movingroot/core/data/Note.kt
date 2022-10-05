package com.movingroot.core.data

data class Note(
    var string: String,
    var content: String,
    var creationTime: Long,
    var updateTime: Long,
    var id: Long = 0
)