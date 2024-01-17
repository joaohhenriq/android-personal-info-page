package com.joaohhenriq.android_personal_info_page.features.profile.presentation.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joaohhenriq.android_personal_info_page.features.profile.presentation.components.HeaderComponent
import com.joaohhenriq.android_personal_info_page.features.profile.presentation.components.TextFieldComponent
import com.joaohhenriq.android_personal_info_page.ui.theme.AndroidpersonalinfopageTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfilePage() {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        HeaderComponent(
            Modifier.padding(16.dp)
        )
        var text by rememberSaveable { mutableStateOf("") }
        TextFieldComponent(
            text = text,
            onValueChange = { text = it },
            modifier = Modifier.padding(top = 32.dp, start = 16.dp, end = 16.dp),
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfilePagePreview() {
    AndroidpersonalinfopageTheme {
        ProfilePage()
    }
}