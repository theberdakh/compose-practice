package com.theberdakh.compose_practice.component

import androidx.compose.foundation.background
import androidx.compose.material3.Button
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape

@Composable
fun ButtonPractice(modifier: Modifier = Modifier, text: String) {
    Button(onClick = {}, modifier = modifier) {
        TextStandard(text)
    }
}