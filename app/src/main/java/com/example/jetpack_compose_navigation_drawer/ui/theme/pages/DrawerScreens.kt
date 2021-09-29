package com.example.jetpack_compose_navigation_drawer.ui.theme.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_navigation_drawer.R
import com.example.jetpack_compose_navigation_drawer.ui.theme.JetpackcomposenavigationdrawerTheme

sealed class DrawerScreens(val title: String, val route: String) {
    object Home : DrawerScreens("Home", "home")
    object Account : DrawerScreens("Account", "account")
    object Help : DrawerScreens( "Help", "help")
    object MenuPage : DrawerScreens( "MenuPage", "MenuPage")
    object TerminalSetting : DrawerScreens( "TerminalSettings", "TerminalSettings")
}

private val screens = listOf(
    DrawerScreens.Home,
    DrawerScreens.Account,
    DrawerScreens.Help,
    DrawerScreens.MenuPage
)

@Composable
fun Drawer(
    modifier: Modifier = Modifier,
    onDestinationClicked: (rounte: String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 24.dp, top = 48.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.daniel),
            contentDescription = "App icon"
        )
        screens.forEach { screen ->
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = screen.title,
                style = MaterialTheme.typography.h4,
                modifier = Modifier.clickable {
                    onDestinationClicked(screen.route)
                }
            )
        }
    }
}

@Preview
@Composable
fun DrawerPreview() {
    JetpackcomposenavigationdrawerTheme {
        Drawer{}
    }
}