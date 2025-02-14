package com.example.tasks.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "task_table")
class Task (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val taskName: String,
    val taskDescription: String,
    val taskDate: Long,
    val isCompleted: Boolean = false

)
