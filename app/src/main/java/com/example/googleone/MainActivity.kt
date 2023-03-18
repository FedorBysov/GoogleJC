package com.example.googleone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //  text function
            //  Text(text = "Hello World!")
            MessageCard(name ="android")
        }
    }
}

@Composable
fun MessageCard(name: String) {
    Text(text = "Hello World $name!")
}

@Preview
@Composable
fun PreviewMessageCard(){
    MessageCard(name ="Android")
}