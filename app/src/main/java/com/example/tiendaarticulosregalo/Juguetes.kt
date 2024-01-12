@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.tiendaarticulosregalo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Juguetes() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "JUGUETERÍA",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 50.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp, bottom = 20.dp)
                    )
                },
            )
        },
        content = { innerPadding ->
            LazyColumn(modifier = Modifier
                .padding(innerPadding)
                .background(color = Color.Cyan)) {
                item {
                    LazyRow(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        item {
                            ProductoItem(nombre = "Espada de madera")
                        }
                    }
                }
                item {
                    LazyRow {
                        item {
                            ProductoItem(nombre = "Avion")
                            ProductoItem(nombre = "Bote")
                            ProductoItem(nombre = "Trencito")
                        }
                    }
                }
                item {
                    LazyRow {
                        item {
                            ProductoItem(nombre = "Peluche")
                            ProductoItem(nombre = "Robot")
                            ProductoItem(nombre = "Bloques")
                        }
                    }
                }
                item {
                    LazyRow {
                        item {
                            ProductoItem(nombre = "Coche RC")
                            ProductoItem(nombre = "Dinosaurio")
                            ProductoItem(nombre = "Xilófono")
                        }
                    }
                }
            }
        }, bottomBar = {
            BottomAppBar(
                containerColor = colorResource(id = R.color.black),
                contentColor = Color.Black,
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxSize(),
                    textAlign = TextAlign.Center,
                    text = "Juguetería",
                    color = Color.White
                )
            }
        }
    )
}

