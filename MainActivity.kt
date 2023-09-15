package com.example.mystudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mystudy.ui.theme.MyStudyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyStudyTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    var result:String=practice()
                    ResultScreen(result)
                }
            }
        }
    }
}

@Composable
fun ResultScreen(result: String) {
    Column(
            modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .verticalScroll(rememberScrollState())
    ){
      Text(
        "$result",modifier = Modifier.padding(2.dp),
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        color = Color.Blue
      )
    }
}

@Preview(showBackground = true)
@Composable
fun ResultScreenPreview() {
    MyStudyTheme {
        ResultScreen("Android")
    }
}