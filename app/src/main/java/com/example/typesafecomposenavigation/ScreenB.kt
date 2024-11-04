package com.example.typesafecomposenavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScreenB(
    modifier: Modifier = Modifier,
    onButtonClick: () -> Unit,
    id : Int = 2
){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Screen B, ID = $id")
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { onButtonClick() }
        )
        {
            Text(text = "Go to next Screen")
        }
    }
}