package com.jeongwoochang.composelayout.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jeongwoochang.composelayout.ui.theme.ComposeLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.wrapContentSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PhotographerCard()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeLayoutTheme {
        PhotographerCard()
    }
}