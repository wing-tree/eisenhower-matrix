package wing.tree.eisenhower.matrix.home

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import wing.tree.eisenhower.matrix.destination.Route

@Composable
fun HomeNavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Route.Home
    ) {
        composable<Route.Home> {
            HomeDestination()
        }
    }
}
