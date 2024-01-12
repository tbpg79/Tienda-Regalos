@file:OptIn(ExperimentalMaterial3Api::class)

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
fun Decoracion(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "DECORACIÓN",
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
                .background(color = Color.LightGray)
                .fillMaxWidth()) {
                item {
                    LazyRow(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        item {
                            ProductoItem(nombre = "Árbol de navidad")
                        }
                    }
                }
                item {
                    LazyRow (modifier = Modifier.padding(start = 20.dp)){
                        item {
                            ProductoItem(nombre = "Bola de cristal")
                            ProductoItem(nombre = "Fuente")
                        }
                    }
                }
                item {
                    LazyRow (modifier = Modifier.padding(start = 40.dp)){
                        item {
                            ProductoItem(nombre = "Estantería")
                            Spacer(modifier = Modifier.width(40.dp))
                            ProductoItem(nombre = "Lámpara")
                        }
                    }
                }
                item {
                    LazyRow(modifier = Modifier.padding(start = 30.dp)) {
                        item {
                            ProductoItem(nombre = "Puf")
                            Spacer(modifier = Modifier.width(40.dp))
                            ProductoItem(nombre = "Foto familiar")
                        }
                    }
                }
                item {
                    LazyRow (modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxSize(),
                        horizontalArrangement = Arrangement.Center){
                        item {
                            ProductoItem(nombre = "Maceta")
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
                    text = "Decoración",
                    color = Color.White
                )
            }
        }
    )
}