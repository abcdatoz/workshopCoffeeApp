package abcdatoz.code.workshopcoffee.ui.main

import abcdatoz.code.workshopcoffee.ui.card.Card
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.BottomAppBar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    val navController = rememberNavController()

    Scaffold(
        topBar = { },

        bottomBar = { MyBottomBar(navController) },
        floatingActionButton = {
//            FloatingActionButton(onClick = {}) {
//                Icon( Icons.Default.Home, contentDescription = "")
//            }
        }
    ) {
        Column(modifier.fillMaxSize()) {

            AppNavigation(navController = navController)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MainPreview() {
    MainScreen()
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar() {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            titleContentColor = MaterialTheme.colorScheme.tertiary,
            containerColor = MaterialTheme.colorScheme.tertiaryContainer
        ),
        title = { Text("WorkShop __Coffee") },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.List, "")
            }
        }

    )
}


@Composable
fun MyBottomBar(navController: NavHostController) {

    val items = listOf(
        AppScreens.HomeScreen,
        AppScreens.SeatScreen,
        AppScreens.MenuScreen,
        AppScreens.CardScreen
    )


    BottomAppBar(
        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
        contentColor = MaterialTheme.colorScheme.tertiary
    ) {
        NavigationBar {

            val currentRoute = currentRoute(navController = navController)

            items.forEach { screen ->
                NavigationBarItem(selected = currentRoute == screen.route,
                    onClick = {
                                  if(currentRoute != screen.route){
                                   navController.navigate(screen.route)
                                  }
                              },
                    label = { Text(screen.route) },
                    alwaysShowLabel = true,
                    icon = {
                        if (currentRoute == screen.route){
                            Icon(screen.selectedIcon, null)
                        }else{
                            Icon(screen.icon, null)
                        }

                    })
            }

        }
    }
}


@Composable
private fun currentRoute(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    return currentRoute
}