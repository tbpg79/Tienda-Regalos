@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.tiendaarticulosregalo

import com.example.tiendaarticulosregalo.ProductoItem
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Hogar() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "HOGAR",
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
            LazyColumn(
                modifier = Modifier
                    .padding(innerPadding)
                    .background(color = Color.Yellow)
                    .fillMaxWidth()
            ) {
                item {
                    LazyRow(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        item {
                            ProductoItem(nombre = "Conjunto comedor")
                        }
                    }
                }
                item {
                    LazyRow(modifier = Modifier.padding(start = 20.dp)) {
                        item {
                            ProductoItem(nombre = "Mesa comedor")
                            ProductoItem(nombre = "Sofá")
                        }
                    }
                }
                item {
                    LazyRow(modifier = Modifier.padding(start = 20.dp)) {
                        item {
                            ProductoItem(nombre = "Silla comedor")
                            ProductoItem(nombre = "Alfombra")
                        }
                    }
                }
                item {
                    LazyRow(modifier = Modifier.padding(start = 20.dp)) {
                        item {
                            ProductoItem(nombre = "Espejo salón")
                            ProductoItem(nombre = "Radiador")
                        }
                    }
                }
                item {
                    LazyRow(modifier = Modifier.padding(start = 20.dp)) {
                        item {
                            ProductoItem(nombre = "Perchero")
                            ProductoItem(nombre = "Lámpara de salón")
                        }
                    }
                }
                item {
                    LazyRow(modifier = Modifier.padding(start = 20.dp)) {
                        item {
                            ProductoItem(nombre = "Cuadro de salón")
                            ProductoItem(nombre = "Florero")
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
                    text = "Hogar",
                    color = Color.White
                )
            }
        }
    )
}