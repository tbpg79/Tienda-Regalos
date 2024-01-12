package com.example.tiendaarticulosregalo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tiendaarticulosregalo.ui.theme.TiendaArticulosRegaloTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TiendaArticulosRegaloTheme {
                mostrarContenido()
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun mostrarContenido() {
    val estadoMenu = rememberDrawerState(initialValue = DrawerValue.Closed)
    val accionMovimiento = rememberCoroutineScope()
    var elementoActual by remember() {
        mutableStateOf(0)
    }
    val colorRetro = Color(230,178,128)

    // NavController
    val controladorNavegacion = rememberNavController()
    NavHost(navController = controladorNavegacion, startDestination = "Principal") {
        composable("Principal") {
            Principal()
        }
        composable("Juguetes") {
            Juguetes()
        }
        composable("Ropa") {
            Ropa()
        }
        composable("Hogar") {
            Hogar()
        }
        composable("Cocina") {
            Cocina()
        }
        composable("Electrónica") {
            Electronica()
        }
        composable("Decoración") {
            Decoracion()
        }
    }

    //Menu lateral
    ModalNavigationDrawer(
        drawerState = estadoMenu,
        drawerContent = {
            ModalDrawerSheet {
                ListItem(
                    headlineText = { Text("Menú") },
                    leadingContent = {
                        IconButton(onClick = {
                            accionMovimiento.launch { estadoMenu.close() }
                        }) {
                            Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu")
                        }
                    }
                )
                Divider()
                NavigationDrawerItem(label = { Text(text = "Principal") },
                    selected = (elementoActual == 0), onClick = {
                        accionMovimiento.launch { estadoMenu.close() }
                        elementoActual = 0
                        controladorNavegacion.navigate("Principal")
                    }
                )
                NavigationDrawerItem(label = { Text(text = "Juguetes") },
                    selected = (elementoActual == 1), onClick = {
                        accionMovimiento.launch { estadoMenu.close() }
                        elementoActual = 1
                        controladorNavegacion.navigate("Juguetes")
                    }
                )
                NavigationDrawerItem(label = { Text(text = "Ropa") },
                    selected = (elementoActual == 2), onClick = {
                        accionMovimiento.launch { estadoMenu.close() }
                        elementoActual = 2
                        controladorNavegacion.navigate("Ropa")
                    }
                )
                NavigationDrawerItem(label = { Text(text = "Hogar") },
                    selected = (elementoActual == 3), onClick = {
                        accionMovimiento.launch { estadoMenu.close() }
                        elementoActual = 3
                        controladorNavegacion.navigate("Hogar")
                    }
                )
                NavigationDrawerItem(label = { Text(text = "Cocina") },
                    selected = (elementoActual == 4), onClick = {
                        accionMovimiento.launch { estadoMenu.close() }
                        elementoActual = 4
                        controladorNavegacion.navigate("Cocina")
                    }
                )
                NavigationDrawerItem(label = { Text(text = "Electrónica") },
                    selected = (elementoActual == 5), onClick = {
                        accionMovimiento.launch { estadoMenu.close() }
                        elementoActual = 5
                        controladorNavegacion.navigate("Electrónica")
                    }
                )
                NavigationDrawerItem(label = { Text(text = "Decoración") },
                    selected = (elementoActual == 6), onClick = {
                        accionMovimiento.launch { estadoMenu.close() }
                        elementoActual = 6
                        controladorNavegacion.navigate("Decoración")
                    }
                )
            }
        },
    ) {
        Scaffold(
            // Barra superior de navegación
            topBar = {
                TopAppBar(
                    title = {
                        Text(text = "Tienda de Artículos de Regalo")
                    },
                    navigationIcon = {
                        IconButton(onClick = {
                            accionMovimiento.launch { estadoMenu.open() }
                        }) {
                            Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu")
                        }
                    }
                )
            }
        ) { innerPadding ->
            Column( // CONTENIDO PRINCIPAL
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (elementoActual == 0) {
                    Principal()
                } else if (elementoActual == 1) {
                    Juguetes()
                } else if (elementoActual == 2) {
                    Ropa()
                } else if (elementoActual == 3) {
                    Hogar()
                } else if (elementoActual == 4) {
                    Cocina()
                } else if (elementoActual == 5) {
                    Electronica()
                } else if (elementoActual == 6) {
                    Decoracion()
                }
            }
        }
    }
}