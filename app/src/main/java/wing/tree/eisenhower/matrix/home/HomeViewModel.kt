package wing.tree.eisenhower.matrix.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import wing.tree.eisenhower.matrix.home.state.State

class HomeViewModel : ViewModel() {
    val _state = MutableStateFlow(State.Loading)
}