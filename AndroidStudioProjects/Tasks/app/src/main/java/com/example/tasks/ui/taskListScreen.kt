package com.example.tasks.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

class taskListScreen(viewModel: TAskViewModel) {
    val today = remember{Calendar.getInstance()}
    val tasks by remember { mutableStateOf(viewModel.getTasksByDate(today.time)) }

    column(modifierr = Modifier.padding(16.dp)){
        text("Today's Tasks", style = MaterialTheme.typography.headlineMedium)

        LazyColumn {
            items(tasks) { task ->
                Row(modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable{viewModel.markTaskAsComplete(task)
                                        }
                                        .padding(8.dp)) {
                                            Text(text = task.taskName))
                                                        }

                        }
                    }
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {navController.navigate("addTask")}) {
            Text("Add Task")
        }
    }
}