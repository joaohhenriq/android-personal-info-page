package com.joaohhenriq.android_personal_info_page.features.profile.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joaohhenriq.android_personal_info_page.R

@Composable
fun HeaderComponent(modifier: Modifier = Modifier) {
    Row(modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .width(82.dp)
                .height(82.dp)
                .clip(shape = CircleShape)
                .background(color = Color.White)
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile_picture),
                contentDescription = null,
                modifier = Modifier
                    .width(80.dp)
                    .height(80.dp)
                    .clip(shape = CircleShape)
                    .align(Alignment.Center),
                contentScale = ContentScale.Crop
            )
        }
        Column(
            modifier = Modifier
                .height(82.dp)
                .padding(start = 16.dp)
                .weight(0.7f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "João Henrique",
                fontSize = 18.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "GitHub: joaohhenriq",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}

@Preview()
@Composable
fun HeaderComponentPreview() {
    HeaderComponent()
}