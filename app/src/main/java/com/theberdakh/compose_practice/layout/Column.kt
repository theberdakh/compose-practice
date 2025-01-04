package com.theberdakh.compose_practice.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.theberdakh.compose_practice.component.ButtonPractice
import com.theberdakh.compose_practice.component.TextStandard
import com.theberdakh.compose_practice.ui.theme.ComposepracticeTheme

/*Vertical Linear layout*/
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ColumnPractice(modifier: Modifier = Modifier) {

    Scaffold { inner ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(inner),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.End
        ) {
            TextStandard("Hello", Color.Blue)
            TextStandard("Hello", Color.Yellow)
            TextStandard("Hello", Color.Cyan)
            TextStandard("Hello", Color.DarkGray)
            TextStandard("Hello", Color.Green)
            TextStandard("Hello", Color.Magenta)

        }
    }

}