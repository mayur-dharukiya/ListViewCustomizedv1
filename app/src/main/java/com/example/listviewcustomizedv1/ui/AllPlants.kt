package com.example.listviewcustomizedv1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.listviewcustomizedv1.R
import com.example.listviewcustomizedv1.model.data.Plant

@Composable
fun AllPlants(plantList:List<Plant>)
{

    Scaffold(
        
        topBar = {

            TopAppBar(backgroundColor = MaterialTheme.colors.primary,
                title = {stringResource(R.string.title)})

        }
    )
    {

        LazyColumn(

            Modifier.fillMaxWidth(),
            contentPadding= PaddingValues(16.dp)

        )
        {

            item {

                Row(
                    modifier= Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(vertical = 25.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically

                ) {

                    Text(text = "Plants used fo Cancer Treatment",
                         style= MaterialTheme.typography.h1 )
                }

            }// end of item

            items(plantList)
            { plant->

                PlantCard(plant.name,plant.description,plant.imageRes)

            }



        }

    }
}








