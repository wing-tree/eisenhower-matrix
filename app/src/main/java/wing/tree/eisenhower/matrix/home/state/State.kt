package wing.tree.eisenhower.matrix.home.state

import wing.tree.eisenhower.matrix.data.entity.Task

sealed class State {
    data object Loading : State()
    data class Content(val tasks: List<Task>) : State()
    data class Error(val exception: Exception): State()
}
