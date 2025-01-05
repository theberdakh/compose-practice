package com.theberdakh.compose_practice.exercise

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.theberdakh.compose_practice.ui.theme.ComposepracticeTheme
import com.theberdakh.compose_practice.ui.theme.MyBlue
import com.theberdakh.compose_practice.ui.theme.Typography


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PersonaliseScreen() {
    ComposepracticeTheme {
        Scaffold { innerPadding ->
            Column(modifier = Modifier.padding(innerPadding).padding(horizontal = 16.dp)) {
                Row(modifier = Modifier.fillMaxWidth().height(8.dp).background(shape = RoundedCornerShape(4.dp), color = Color.LightGray)) {
                    Box(modifier = Modifier.fillMaxHeight().weight(1f).background(color = MyBlue, shape = RoundedCornerShape(8.dp)))
                    Box(modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.LightGray, shape = RoundedCornerShape(8.dp)))
                }
                Text(text = "Personalise your experience",
                    style = Typography.titleLarge,
                    modifier = Modifier.padding(top = 32.dp)
                )

                Text(text = "Choose your interests",
                    style = Typography.bodyMedium,
                    modifier = Modifier.padding(top = 16.dp)
                )

                Box(modifier = Modifier.fillMaxHeight()) {
                    Button(onClick = {},
                        modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp).align(Alignment.BottomCenter),
                        shape = RoundedCornerShape(8.dp), colors = ButtonColors(containerColor = MyBlue, contentColor = Color.Cyan, disabledContentColor = Color.Gray, disabledContainerColor = Color.Magenta),
                    ) {
                        Text(text = "Next", style = TextStyle(color = Color.White))
                    }
                }

            }


        }

    }
}