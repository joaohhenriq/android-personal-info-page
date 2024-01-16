package com.joaohhenriq.android_personal_info_page.features.profile.presentation.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joaohhenriq.android_personal_info_page.features.profile.presentation.components.HeaderComponent
import com.joaohhenriq.android_personal_info_page.ui.theme.AndroidpersonalinfopageTheme

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
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfilePagePreview() {
    AndroidpersonalinfopageTheme {
        ProfilePage()
    }
}