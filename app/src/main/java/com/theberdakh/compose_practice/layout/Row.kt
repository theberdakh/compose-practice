package com.theberdakh.compose_practice.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.theberdakh.compose_practice.component.ButtonPractice
import com.theberdakh.compose_practice.component.TextStandard


/*Horizontal linear layout
* Alignment is gravity
* android:gravity*/
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RowPractice(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        Row(modifier = Modifier.fillMaxSize().padding(innerPadding),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically) {
            ButtonPractice(text = "1")
            ButtonPractice(text = "2")
            ButtonPractice(text = "3")
        }
    }
}