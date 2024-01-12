package com.example.tiendaarticulosregalo

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProductoItem(nombre: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = nombre, textAlign = TextAlign.Center, fontSize = 25.sp
        )
        Image(
            painter = painterResource(id = obtenerIdImagen(nombre)),
            contentDescription = null,
            modifier = Modifier.size(width = 110.dp, height = 110.dp)
        )
    }
}

@DrawableRes
fun obtenerIdImagen(nombre: String): Int {
    return when (nombre) {
        //Juguetería
        "Peluche" -> R.drawable.oso_peluche
        "Avion" -> R.drawable.avion
        "Bloques" -> R.drawable.bloques
        "Bote" -> R.drawable.bote
        "Espada de madera" -> R.drawable.espada
        "Robot" -> R.drawable.robot
        "Trencito" -> R.drawable.tren_de_juguete
        "Coche RC" ->R.drawable.coche_radiocontrol
        "Dinosaurio"->R.drawable.dinosaurio
        "Xilófono"->R.drawable.xilofono
        //Hogar
        "Conjunto comedor"->R.drawable.conjunto_comedor
        "Mesa comedor"->R.drawable.mesa_de_comedor
        "Silla comedor"->R.drawable.silla_del_comedor
        "Alfombra"->R.drawable.alfombra
        "Espejo salón"->R.drawable.espejo_salon
        "Radiador"->R.drawable.calentador
        "Sofá"->R.drawable.sofa
        "Perchero"->R.drawable.percha
        "Lámpara de salón"->R.drawable.lampara_de_suelo
        "Cuadro de salón"->R.drawable.cuadro_pintura
        "Florero"->R.drawable.florero
        //Cocina
        "Horno"->R.drawable.horno
        "Arrocera"->R.drawable.olla_arrocera
        "Nevera"->R.drawable.nevera_inteligente
        "Microondas"->R.drawable.microondas
        "Vasos"->R.drawable.vasos
        "Fregadero"->R.drawable.fregadero
        "Juego de cocina"->R.drawable.juego_cocina
        "Platos"->R.drawable.platos
        "Cubiertos"->R.drawable.cubiertos_cocina
        //Decoracion
        "Fuente"->R.drawable.fuente
        "Estantería"->R.drawable.estanteria
        "Árbol de navidad"->R.drawable.arbol_de_navidad
        "Bola de cristal"->R.drawable.bola_de_cristal
        "Puf"->R.drawable.puff
        "Lámpara"->R.drawable.lampara
        "Foto familiar"->R.drawable.foto_familiar
        "Maceta"->R.drawable.maceta
        //Electrónica
        "Ordenador de sobremesa"->R.drawable.ordenador_de_sobremesa
        "Altavoces"->R.drawable.altavoces
        "Teclado + ratón"->R.drawable.teclado_y_raton
        "XBOX"->R.drawable.xbox
        "PS4"->R.drawable.ps4
        "Switch"->R.drawable.resource_switch
        "WII"->R.drawable.wii
        "Gafas VR"->R.drawable.vr
        "Proyector"->R.drawable.proyector
        //Ropa
        "Modelo sud 1"->R.drawable.sudadera_con_capucha
        "Modelo sud 2"->R.drawable.sudadera_con_capucha__1_
        "Modelo sud 3"->R.drawable.sudadera_con_capucha__2_
        "Modelo sud 4"->R.drawable.sudadera_con_capucha__3_
        "Modelo sud 5"->R.drawable.sudadera_con_capucha__4_
        "Modelo sud 6"->R.drawable.sudadera_con_capucha__5_
        "Modelo sud 7"->R.drawable.sudadera_con_capucha__6_
        "Modelo sud 8"->R.drawable.sudadera_con_capucha__7_
        "Modelo sud 9"->R.drawable.sudadera_con_capucha__8_
        "Modelo pant 1"->R.drawable.pantalones
        "Modelo pant 2"->R.drawable.pantalones__1_
        "Modelo pant 3"->R.drawable.pantalones__2_
        "Modelo pant 4"->R.drawable.pantalones__3_
        "Modelo pant 5"->R.drawable.pantalones__4_
        "Modelo pant 6"->R.drawable.pantalones__5_
        "Modelo pant 7"->R.drawable.pantalones__6_
        "Modelo pant 8"->R.drawable.pantalones__7_
        "Modelo pant 9"->R.drawable.pantalones__8_
        "Modelo vest 1"->R.drawable.vestir
        "Modelo vest 2"->R.drawable.vestir__1_
        "Modelo vest 3"->R.drawable.vestir__2_
        "Modelo vest 4"->R.drawable.vestir__3_
        "Modelo vest 5"->R.drawable.vestir__4_
        "Modelo vest 6"->R.drawable.vestir__5_
        "Modelo vest 7"->R.drawable.vestir__6_
        "Modelo vest 8"->R.drawable.vestir__7_
        "Modelo vest 9"->R.drawable.vestir__8_
        else -> R.drawable.ic_launcher_foreground
    }
}