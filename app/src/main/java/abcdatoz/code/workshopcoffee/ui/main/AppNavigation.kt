package abcdatoz.code.workshopcoffee.ui.main

import abcdatoz.code.workshopcoffee.ui.card.Card
import abcdatoz.code.workshopcoffee.ui.home.Home
import abcdatoz.code.workshopcoffee.ui.menu.Menu
import abcdatoz.code.workshopcoffee.ui.seat.Seat
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavigation(navController: NavHostController){


    NavHost(navController = navController, startDestination = AppScreens.HomeScreen.route ){
        composable(AppScreens.HomeScreen.route){
            Home()
        }

        composable(AppScreens.SeatScreen.route){
            Seat()
        }

        composable(AppScreens.MenuScreen.route){
            Menu()
        }
        composable(AppScreens.CardScreen.route){
            Card()
        }
    }
}


