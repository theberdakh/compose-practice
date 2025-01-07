package com.theberdakh.compose_practice.exercise.task3

import android.text.Highlights
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.theberdakh.compose_practice.R
import com.theberdakh.compose_practice.component.HyperlinkText
import com.theberdakh.compose_practice.ui.theme.MyBlue

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun LoginScreen() {
    Scaffold { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Image(
                painter = painterResource(id = R.drawable.onboarding_empty),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 24.dp)) {
                Text(
                    text = "Welcome!",
                    style = TextStyle(fontWeight = FontWeight.Black, fontSize = 24.sp)
                )

                Column(modifier = Modifier.padding(vertical = 16.dp)) {
                    TextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("Email Address") },
                        textStyle = TextStyle(color = Color.Black),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .background(color = Color.White, shape = RoundedCornerShape(8.dp))
                            .border(
                                width = 1.dp,
                                brush = Brush.linearGradient(
                                    colors = listOf(
                                        Color.Red,
                                        Color.Blue
                                    )
                                ),
                                shape = RoundedCornerShape(16.dp)
                            ),
                        colors = TextFieldDefaults.colors(
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            focusedContainerColor = Color.Transparent,
                            disabledContainerColor = Color.Transparent,
                            errorContainerColor = Color.Transparent
                        )
                    )
                    TextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("Password") },
                        textStyle = TextStyle(color = Color.Black),
                        trailingIcon = {
                            IconButton(onClick = {}) {
                                Icon(imageVector = Icons.Outlined.Lock, contentDescription = null)
                            }
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .background(color = Color.White, shape = RoundedCornerShape(8.dp))
                            .border(
                                width = 1.dp,
                                brush = Brush.linearGradient(
                                    colors = listOf(
                                        Color.Red,
                                        Color.Blue
                                    )
                                ),
                                shape = RoundedCornerShape(16.dp)
                            ),
                        colors = TextFieldDefaults.colors(
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            focusedContainerColor = Color.Transparent,
                            disabledContainerColor = Color.Transparent,
                            errorContainerColor = Color.Transparent
                        )
                    )

                    Text(
                        text = "Forgot password?",
                        style = TextStyle(fontWeight = FontWeight.SemiBold, color = MyBlue),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    )
                }

                Button(
                    onClick = {},
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonColors(
                        contentColor = MyBlue,
                        containerColor = MyBlue,
                        disabledContainerColor = MyBlue,
                        disabledContentColor = MyBlue
                    )
                ) {
                    Text(
                        text = "Login", color = Color.White,
                        modifier = Modifier.padding(vertical = 4.dp)
                    )
                }

                HyperlinkText(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    fullText = "Not a member? Register now",
                    hyperLinks = mutableMapOf("Register now" to "https://google.com"),
                    textStyle = TextStyle(
                        textAlign = TextAlign.Center, color = Color.Gray
                    ),
                    linkTextColor = MyBlue,
                    linkTextFontWeight = FontWeight.SemiBold
                )

                HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp))
                Text(
                    text = "Or continue with",
                    style = TextStyle(color = Color.Gray, textAlign = TextAlign.Center),
                    modifier = Modifier.fillMaxWidth()
                )

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                    horizontalArrangement = Arrangement.Center) {
                    IconButton(
                        onClick = {},
                        colors = IconButtonColors(
                            contentColor = Color.Red,
                            disabledContentColor = Color.Red,
                            containerColor = Color.Red,
                            disabledContainerColor = Color.Red
                        )
                    ) {
                        Icon(imageVector = Icons.Default.Face, contentDescription = null, tint = Color.White)
                    }
                    IconButton(
                        onClick = {},
                        colors = IconButtonColors(
                            contentColor = Color.Black,
                            disabledContentColor = Color.Black,
                            containerColor = Color.Black,
                            disabledContainerColor = Color.Black
                        )
                    ) {
                        Icon(imageVector = Icons.Default.Face, contentDescription = null, tint = Color.White)
                    }
                    IconButton(
                        onClick = {},
                        colors = IconButtonColors(
                            contentColor = MyBlue,
                            disabledContentColor = MyBlue,
                            containerColor = MyBlue,
                            disabledContainerColor = MyBlue
                        )
                    ) {
                        Icon(imageVector = Icons.Default.Face, contentDescription = null, tint = Color.White)
                    }
                }

            }
        }
    }
}