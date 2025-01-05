package com.theberdakh.compose_practice.exercise

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.theberdakh.compose_practice.R
import com.theberdakh.compose_practice.ui.theme.ComposepracticeTheme


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OnBoardingScreen(modifier: Modifier = Modifier) {
    ComposepracticeTheme {
        Scaffold() { innerPadding ->
            Column(modifier = Modifier.padding(innerPadding)) {
                Image(
                    painter = painterResource(R.drawable.onboarding_empty),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1.8f),
                    contentScale = ContentScale.FillBounds
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1.2f)
                        .padding(16.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.pagination_dots),
                        contentDescription = null,
                        modifier = Modifier.size(25.dp)
                    )
                    Text(
                        text = "Create a prototype in just few minutes",
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Black
                        ),
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                    Text(text = "Enjoy these pro-made components and worry only about creating the product ever.",
                        style = TextStyle(color = Color.Gray),
                        modifier = Modifier.padding(vertical = 8.dp)
                    )

                    Button(onClick = {},
                        modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp),
                        shape = RoundedCornerShape(8.dp), colors = ButtonColors(containerColor = Color.Blue, contentColor = Color.Cyan, disabledContentColor = Color.Gray, disabledContainerColor = Color.Magenta)) {
                        Text(text = "Next", style = TextStyle(color = Color.White))
                    }
                }
            }
        }
    }

}