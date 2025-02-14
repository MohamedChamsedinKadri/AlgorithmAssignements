package com.example.tasks.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.tasks.viewmodel.TAskViewModel

@Composable
class addTaskScreen (viewModel: TAskViewModel){
    var taskName by remember { mutableStateOf("") }
    var taskDescription by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)){
        TextField(
            value = taskName,
            onValueChange = { taskName = it },
            label = { Text("Task Name") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = taskDescription,
            onValueChange = { taskDescription = it },
            label = { Text("Task Description") }
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                val newTask = Task(taskName, taskDescription)
            }
                viewModel.addTask(
                    taskName =taskName,
                    taskDescription =taskDescription,
                    taskDate =Calendar.getInstance().time,)
                viewModel.addTask(newTask)
    })
    {
        Text("Add Task")
    }}

}