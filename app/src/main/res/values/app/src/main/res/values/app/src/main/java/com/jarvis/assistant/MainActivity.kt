package com.jarvis.assistant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

fun statusMessage(): String = "JARVIS online"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { JarvisApp() }
    }
}

@Composable
fun JarvisApp() {
    val cyan = Color(0xFF00E5FF)
    MaterialTheme(colorScheme = darkColorScheme(primary = cyan)) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF05070D)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "JARVIS", color = cyan, fontSize = 40.sp)
            Text(text = statusMessage(), color = Color.White, fontSize = 18.sp)
        }
    }
}
