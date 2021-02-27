package com.example.androiddevchallenge

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.navigate
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.detail.PuppyDetail
import com.example.androiddevchallenge.ui.home.HomeScreen

object MainDestinations {
    const val HOME = "home"
    const val DETAIL = "detail"
    const val DETAIL_ID_KEY = "puppyId"

}

@Composable
fun NavGraph(startDestination: String = MainDestinations.HOME) {
    val navController = rememberNavController()

    val actions = remember(navController) { MainActions(navController) }
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(MainDestinations.HOME) {
            HomeScreen(selectPuppy = actions.selectPuppy)
        }
//        composable(MainDestinations.COURSES_ROUTE) {
//            Courses(selectCourse = actions.selectCourse)
//        }
        composable(
            "${MainDestinations.DETAIL}/{${MainDestinations.DETAIL_ID_KEY}}",
            arguments = listOf(navArgument(MainDestinations.DETAIL_ID_KEY) { type = NavType.IntType }),
            content = {
                val arguments = requireNotNull(it.arguments)
                PuppyDetail(arguments.getInt(MainDestinations.DETAIL_ID_KEY))
            }
        )
    }
}

/**
 * Models the navigation actions in the app.
 */
class MainActions(navController: NavHostController) {
    val selectPuppy: (Int) -> Unit = { puppyId: Int ->
        navController.navigate("${MainDestinations.DETAIL}/$puppyId")
    }
    val upPress: () -> Unit = {
        navController.navigateUp()
    }
}