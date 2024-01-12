@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.example.tiendaarticulosregalo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
fun Electronica() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "ELECTRÓNICA",
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
                    .background(color = Color.Gray)
                    .fillMaxWidth()
            ) {
                item {
                    LazyRow(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        item {
                            ProductoItem(nombre = "Ordenador de sobremesa")
                        }
                    }
                }
                item {
                    LazyRow(modifier = Modifier.padding(start = 20.dp)) {
                        item {
                            ProductoItem(nombre = "Altavoces")
                            Spacer(modifier = Modifier.width(60.dp))
                            ProductoItem(nombre = "Proyector")
                        }
                    }
                }
                item {
                    LazyRow(
                        modifier = Modifier
                            .fillMaxSize()
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        item {
                            ProductoItem(nombre = "Teclado + ratón")
                        }
                    }
                }
                item {
                    LazyRow {
                        item {
                            ProductoItem(nombre = "PS4")
                            ProductoItem(nombre = "XBOX")
                            ProductoItem(nombre = "Switch")
                        }
                    }
                }
                item {
                    LazyRow(modifier = Modifier.padding(start = 60.dp))
                    {
                        item {
                            ProductoItem(nombre = "WII")
                            ProductoItem(nombre = "Gafas VR")
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
                    text = "Electrónica",
                    color = Color.White
                )
            }
        }
    )
}