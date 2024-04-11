package com.stu25327.class2app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.stu25327.class2app.ui.theme.Class2AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            myFirstCompLogin()
            // myLogin()

        }
    }
}

@Composable
fun myFirstCompLogin() {
    Surface(
        color = Color.Red,
    ) {
        Colum (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxSize()

        ) {
            Text(text = "Hello", fontSize = 40.sp)
            Text(text = "World", fontSize = 40.sp)
        }

    }
}