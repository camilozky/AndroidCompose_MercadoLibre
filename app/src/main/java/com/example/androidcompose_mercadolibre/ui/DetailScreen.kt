package com.example.androidcompose_mercadolibre.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun DetailsScreen(product: String = "Random Product") {
    Text(text = product)
}
