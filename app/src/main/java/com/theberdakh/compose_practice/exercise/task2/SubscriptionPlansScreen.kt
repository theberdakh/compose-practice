package com.theberdakh.compose_practice.exercise.task2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextMotion
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.theberdakh.compose_practice.ui.theme.MyBlue

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun SubscriptionPlansScreen() {
    Scaffold { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Text(
                text = AnnotatedString(
                    text = "Choose your \nsubscription plan",
                    paragraphStyle = ParagraphStyle(
                        textAlign = TextAlign.Start,
                        textMotion = TextMotion.Animated
                    ),
                    spanStyle = SpanStyle(fontWeight = FontWeight.Black, fontSize = 24.sp)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
            )

            Text(
                text = "And get a 7-day free trial",
                modifier = Modifier.padding(16.dp),
                fontWeight = FontWeight.W400,
                color = Color.Gray
            )
            CardBadged(badged = true, startIcon = Icons.Default.CheckCircle,title = "Yearly", subtitle = "-45 discount", price = "$ 94.80", priceTag = "every year")
            CardBadged(badged = false, startIcon = Icons.Default.CheckCircle,title = "Yearly", subtitle = "-45 discount", price = "$ 94.80", priceTag = "every year")
            CardBadged(badged = false, startIcon = Icons.Default.CheckCircle,title = "Yearly", subtitle = "-45 discount", price = "$ 94.80", priceTag = "every year")

        }
    }
}

@Composable
private fun CardBadged(badged: Boolean = true, startIcon: ImageVector, title: String, subtitle: String, price: String, priceTag: String) {
    BadgedBox(
        badge = {if (badged){
            Badge(
                containerColor = MyBlue,
                modifier = Modifier
                    .background(MyBlue, CircleShape)
                    .size(18.dp)
            ) {
                Image(
                    imageVector = Icons.Default.Star,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(Color.White)
                )

        } }
        },
        modifier = Modifier.padding(horizontal = 18.dp, vertical = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .applySelectedBackground(badged)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector =
                    if (badged){
                        startIcon
                    } else {
                        Icons.Outlined.CheckCircle
                    }
                ,
                contentDescription = null,
                tint = MyBlue
            )
            Column(modifier = Modifier.padding(horizontal = 8.dp)) {
                Text(
                    text = title,
                    modifier = Modifier.fillMaxWidth(0.5f),
                    style = TextStyle(fontWeight = FontWeight.Black)
                )
                Text(
                    text = subtitle,
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .padding(vertical = 4.dp),
                    style = TextStyle(
                        color = Color(0xff75b0fe),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 10.sp
                    )
                )
            }
            Column(modifier = Modifier.padding(horizontal = 8.dp)) {
                Text(
                    text = price,
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(
                        fontWeight = FontWeight.Black,
                        textAlign = TextAlign.End
                    )
                )
                Text(
                    text = priceTag,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 10.sp,
                        textAlign = TextAlign.End
                    )
                )
            }
        }
    }
}

private fun Modifier.applySelectedBackground(badged: Boolean): Modifier {
   return if (badged){
        this.background(Color(0xffeaf2ff), shape = RoundedCornerShape(12.dp))
    } else {
        this.background(Color.White, shape = RoundedCornerShape(12.dp)).border(width = 0.1.dp, color = Color.Black, shape = RoundedCornerShape(12.dp))
    }
}
