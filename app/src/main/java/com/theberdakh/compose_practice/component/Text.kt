package com.theberdakh.compose_practice.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextStandard(text: String) {
    Text(
        modifier = Modifier
            .width(IntrinsicSize.Max)
            .height(IntrinsicSize.Min)
            .padding(8.dp),
        text = AnnotatedString(text)
    )
}

@Composable
fun TextStandard(text: String, backgroundColor: Color) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = backgroundColor)
            .wrapContentSize()
            .padding(horizontal = 8.dp, vertical = 4.dp),
        text = AnnotatedString(text),
        style = TextStyle(
            color = Color.White,
            fontSize = 18.sp,
            background = Color.Transparent
        )
    )
}