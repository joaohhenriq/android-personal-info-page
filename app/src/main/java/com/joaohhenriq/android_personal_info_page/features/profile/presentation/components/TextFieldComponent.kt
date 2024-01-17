package com.joaohhenriq.android_personal_info_page.features.profile.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joaohhenriq.android_personal_info_page.R

@ExperimentalMaterial3Api
@Composable
fun TextFieldComponent(
    text: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    TextField(
        value = text,
        onValueChange = onValueChange,
        label = {
            Text("Searching for...")
        },
        trailingIcon = {
            Box(
                modifier = Modifier
                    .padding(end = 6.dp)
                    .height(45.dp)
                    .width(45.dp)
                    .background(Color.DarkGray, shape = RoundedCornerShape(10.dp))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = null,
                )
            }
        },
        shape = RoundedCornerShape(10.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = Color.White,
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
            textColor = Color.DarkGray,
            unfocusedLabelColor = Color.DarkGray,
        ),
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White, CircleShape)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun TextFieldComponentPreview() {
    TextFieldComponent(text = "", onValueChange = {})
}