package org.multicalculator.project

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}
@Composable
fun  CalcView(){

}
@Composable
fun CalcRow(){

}
@Composable
fun CalcDisplay(){

}
@Composable
fun CalcNumericButton(){

}
@Composable
fun CalcOperationButton(){

}
@Composable
fun CalcEqualsButton(display: MutableState<String>){
  Button(onClick = { display.value= "0"}, modifier = Modifier.padding(4.dp)) {
   Text("=")
  }
}
