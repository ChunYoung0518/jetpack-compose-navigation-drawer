package com.example.jetpack_compose_navigation_drawer.ui.theme.pages

import androidx.compose.foundation.layout.*
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MenuPage(openDrawer: () -> Unit, openTerminalSettings: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(
            title = "Menu",
            buttonIcon = Icons.Filled.Menu,
            onButtonClicked = { openDrawer() }
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            ExtendedFloatingActionButton(
                text = { Text(text = "Transaction History") },
                onClick = {},
                icon = { Icon(Icons.Filled.Add, "") },
                modifier = Modifier.width(256.dp)
            )

            Spacer(modifier = Modifier.height(4.dp))

            ExtendedFloatingActionButton(
                text = { Text(text = "Settlements") },
                onClick = {},
                icon = { Icon(Icons.Filled.AccountBox, "") },
                modifier = Modifier.width(256.dp)
            )

            Spacer(modifier = Modifier.height(4.dp))

            ExtendedFloatingActionButton(
                text = { Text(text = "Terminal Settings") },
                onClick = { openTerminalSettings() },
                icon = { Icon(Icons.Filled.Settings, "") },
                modifier = Modifier.width(256.dp)
            )
        }
    }


}