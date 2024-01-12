package com.example.tiendaarticulosregalo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Principal() {
    val categorias = listOf(
        listOf("Juguetes", "Ropa"),
        listOf("Hogar", "Cocina"),
        listOf("Electrónica", "Decoración"),
    )
    Column() {
            Text(text = "PRINCIPAL",
                fontSize = 30.sp, 
                fontWeight = FontWeight.Bold)
    }
    Column(
        modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxSize()
    ) {
        categorias.forEach { rowValues ->
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
            ) {
                rowValues.forEach { botonV ->
                    Text(
                        text = botonV,
                        style = androidx.compose.ui.text.TextStyle(
                            color = Color.Black,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }
        }
        Text(
            text = "PROXIMAMENTE",
            fontSize = 45.sp,
            fontWeight = FontWeight.ExtraBold,
            textDecoration = TextDecoration.Underline,
            color = Color.Red,
            modifier = Modifier
                .rotate(340f)
                .offset(y = 90.dp)

        )
    }

}