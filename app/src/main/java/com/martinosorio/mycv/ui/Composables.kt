package com.martinosorio.mycv.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ScreenTitle(title: String) {
    Text(
        text = title,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp, bottom = 10.dp),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.titleLarge
    )
}