package com.example.androiddevchallenge

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.home.HomeScreen

object MainDestinations {
    const val HOME = "home"
    const val DETAIL = "detail"
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
            HomeScreen()
        }
//        composable(MainDestinations.COURSES_ROUTE) {
//            Courses(selectCourse = actions.selectCourse)
//        }
//        composable(
//            "${MainDestinations.COURSE_DETAIL_ROUTE}/{$COURSE_DETAIL_ID_KEY}",
//            arguments = listOf(navArgument(COURSE_DETAIL_ID_KEY) { type = NavType.LongType })
//        ) { backStackEntry ->
//            val arguments = requireNotNull(backStackEntry.arguments)
//            CourseDetails(
//                courseId = arguments.getLong(COURSE_DETAIL_ID_KEY),
//                selectCourse = actions.selectCourse,
//                upPress = actions.upPress
//            )
//        }
    }
}

/**
 * Models the navigation actions in the app.
 */
class MainActions(navController: NavHostController) {
    val selectPuppy: (Long) -> Unit = { courseId: Long ->
        navController.navigate("${MainDestinations.DETAIL}/$courseId")
    }
    val upPress: () -> Unit = {
        navController.navigateUp()
    }
}