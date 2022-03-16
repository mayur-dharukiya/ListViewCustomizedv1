package com.example.listviewcustomizedv1.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource


@Composable
fun PlantCard(name:String,description:String,image:Int)
{
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        shape = MaterialTheme.shapes.medium,
        elevation = 5.dp,
        backgroundColor = MaterialTheme.colors.surface
    ) {

        Row (
            verticalAlignment = Alignment.CenterVertically

                ){

            Image(painter = painterResource(id = image),
                contentDescription =null,
                modifier= Modifier
                    .size(130.dp)
                    .padding(8.dp),
                contentScale = ContentScale.Fit
            )
            Column(Modifier.padding(8.dp)) {

                Text(text = name,
                    style=MaterialTheme.typography.h2,
                    color=MaterialTheme.colors.onSurface,
                    modifier=Modifier.padding(bottom=8.dp)
                )
                Text(text = description,
                    style=MaterialTheme.typography.body2,
                    color=MaterialTheme.colors.onSurface,
                    modifier=Modifier.padding(bottom=4.dp)
                )

            }

        }

    }
}
