package com.martinosorio.mycv.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Deprecated("Replace me")
@Composable
fun TitleText(title: String) {
    Text(
        text = title,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp, bottom = 10.dp),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.titleLarge
    )
}

@Composable
fun ScreenTitle(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 40.dp),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.displayLarge
    )
}

@Composable
fun ScreenSubTitle(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 12.dp, bottom = 20.dp),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.headlineMedium
    )
}