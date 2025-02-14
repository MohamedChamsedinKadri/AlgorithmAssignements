package com.example.tasks.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.tasks.data.Task
import com.example.tasks.data.TaskDatabase
import kotlinx.coroutines.launch
import java.util.Date

class TAskViewModel(application: Application) : AndroidViewModel(application) {
    private val taskDAO = TaskDatabase.getDatabase(application).taskDao()

    //function to add task
    fun addTask(task: Task) {
        viewModelScope.launch {
            taskDAO.insertTask(task)
        }
    }
    //function to retreive task from today onward
    fun getTasksForDate(date: Date): List<Task> {
        return taskDAO.getTasksByDate(date)
    }

    //function to delete task
    fun deleteTask(task: Task) {
        viewModelScope.launch {
            taskDAO.deleteTask(task)
        }

    }

}