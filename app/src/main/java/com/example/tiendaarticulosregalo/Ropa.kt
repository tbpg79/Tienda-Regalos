@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.tiendaarticulosregalo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Ropa() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "ROPA",
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
                    .background(color = Color.White)
                    .fillMaxWidth()
            ) {
                item {
                    Column(
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .background(color = Color(0.2f, 0.8f, 0.8f))
                            .padding(top = 10.dp, bottom = 10.dp)
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "Sudaderas con capucha",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Serif
                        )
                    }
                    LazyRow(
                        modifier = Modifier
                            .background(color = Color(0.4f, 1.0f, 1.0f))
                            .padding(top = 10.dp, bottom = 10.dp)
                            .fillMaxSize()
                    ) {
                        item {
                            ProductoItem(nombre = "Modelo sud 1")
                            ProductoItem(nombre = "Modelo sud 2")
                            ProductoItem(nombre = "Modelo sud 3")
                            ProductoItem(nombre = "Modelo sud 4")
                            ProductoItem(nombre = "Modelo sud 5")
                            ProductoItem(nombre = "Modelo sud 6")
                            ProductoItem(nombre = "Modelo sud 7")
                            ProductoItem(nombre = "Modelo sud 8")
                            ProductoItem(nombre = "Modelo sud 9")
                        }
                    }
                }
                item {
                    Column(
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .background(color = Color(0.2f, 0.8f, 0.8f))
                            .padding(top = 10.dp, bottom = 10.dp)
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "Pantalones",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Serif
                        )
                    }
                    LazyRow(
                        modifier = Modifier
                            .background(color = Color(0.4f, 1.0f, 1.0f))
                            .padding(top = 5.dp, bottom = 10.dp)
                            .fillMaxSize()
                    ) {
                        item {
                            ProductoItem(nombre = "Modelo pant 1")
                            ProductoItem(nombre = "Modelo pant 2")
                            ProductoItem(nombre = "Modelo pant 3")
                            ProductoItem(nombre = "Modelo pant 4")
                            ProductoItem(nombre = "Modelo pant 5")
                            ProductoItem(nombre = "Modelo pant 6")
                            ProductoItem(nombre = "Modelo pant 7")
                            ProductoItem(nombre = "Modelo pant 8")
                            ProductoItem(nombre = "Modelo pant 9")
                        }
                    }
                }
                item {
                    Column(
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .background(color = Color(0.2f, 0.8f, 0.8f))
                            .padding(top = 10.dp, bottom = 10.dp)
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "Vestidos",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Serif
                        )
                    }
                    LazyRow(
                        modifier = Modifier
                            .background(color = Color(0.4f, 1.0f, 1.0f))
                            .padding(top = 5.dp, bottom = 10.dp)
                            .fillMaxSize()
                    ) {
                        item {
                            ProductoItem(nombre = "Modelo vest 1")
                            ProductoItem(nombre = "Modelo vest 2")
                            ProductoItem(nombre = "Modelo vest 3")
                            ProductoItem(nombre = "Modelo vest 4")
                            ProductoItem(nombre = "Modelo vest 5")
                            ProductoItem(nombre = "Modelo vest 6")
                            ProductoItem(nombre = "Modelo vest 7")
                            ProductoItem(nombre = "Modelo vest 8")
                            ProductoItem(nombre = "Modelo vest 9")
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
                    text = "Ropa",
                    color = Color.White
                )
            }
        }
    )
}