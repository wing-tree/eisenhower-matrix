package wing.tree.eisenhower.matrix.ui.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import wing.tree.eisenhower.matrix.data.entity.Task

@Composable
private fun Region(
    tasks: List<Task>,
    modifier: Modifier = Modifier
) {
    Surface(modifier = modifier) {
        LazyColumn {
            items(tasks) { item ->
                Task(item = item)
            }
        }
    }
}

@Composable
fun Matrix(
    tasks: List<Task>,
    modifier: Modifier = Modifier
) {
    Column {
        Row {

        }

        Row {

        }
    }
}
