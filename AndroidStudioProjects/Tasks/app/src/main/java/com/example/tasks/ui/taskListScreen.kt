package com.example.tasks.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.tasks.data.Task
import com.example.tasks.viewmodel.TaskViewModel
import java.util.Calendar

@Composable
fun TaskListScreen(viewModel: TaskViewModel) {
    val today = Calendar.getInstance().timeInMillis
    val tasks by viewModel.getTasksForDate(today).collectAsStateWithLifecycle(initialValue = emptyList())

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Tasks for Today")

        LazyColumn {
            items(tasks) { task ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            viewModel.markTaskAsCompleted(task)
                        }
                        .padding(16.dp)
                ) {
                    Text(text = task.taskName)
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { /* navigate to AddTaskScreen */ }) {
            Text("Add Task")
        }
    }
}