package com.example.androidcompose_mercadolibre

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.androidcompose_mercadolibre.ui.theme.AndroidCompose_MercadoLibreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidCompose_MercadoLibreTheme {

            }
        }
    }
}
