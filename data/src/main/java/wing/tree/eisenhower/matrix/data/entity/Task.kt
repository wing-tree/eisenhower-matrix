package wing.tree.eisenhower.matrix.data.entity

import androidx.room.Entity
import java.time.LocalDate

@Entity
data class Task(
    val id: Long,
    val title: String,
    val description: String,
    val region: Region,
    val dueDate: LocalDate
) {
    enum class Region {
        DO,
        SCHEDULE,
        DELEGATE,
        DELETE
    }
}
