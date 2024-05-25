package wing.tree.eisenhower.matrix.ui.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import wing.tree.eisenhower.matrix.data.entity.Task

@Composable
fun Task(
    item: Task,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(text = item.title)
        Text(text = item.description)
    }
}
