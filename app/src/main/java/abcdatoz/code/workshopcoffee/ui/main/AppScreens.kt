package abcdatoz.code.workshopcoffee.ui.main

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class AppScreens (
    val route: String,
    val icon: ImageVector,
    val selectedIcon: ImageVector
) {
    object HomeScreen: AppScreens ("Home", Icons.Outlined.Home, Icons.Filled.Home)
    object SeatScreen: AppScreens("Seat", Icons.Outlined.LocationOn, Icons.Filled.LocationOn)
    object MenuScreen: AppScreens ("Menu", Icons.Outlined.Menu, Icons.Filled.Menu)
    object CardScreen: AppScreens("Card", Icons.Outlined.ShoppingCart, Icons.Filled.ShoppingCart)
}