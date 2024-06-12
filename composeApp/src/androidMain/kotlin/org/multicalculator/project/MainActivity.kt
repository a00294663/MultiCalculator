package org.multicalculator.project

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
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
fun CalcRow(display: MutableState<String>, startNum: Int, numButtons: Int) {
    val endNum = startNum + numButtons
    Row(
        modifier = Modifier
            .padding(0.dp)
            .fillMaxWidth()
    ) {
        for (i in 0 until numButtons) {
            //val number = startNum + i
            CalcNumericButton(i, display)
        }
    }
}


@Composable
fun CalcDisplay(display:MutableState<String> ){

}


@Composable
fun CalcNumericButton(number: Int,display: MutableState<String>){
    Button(onClick ={
        if (display.value == "0") {
            display.value = number.toString()
        } else {
            display.value += number.toString()
        }
    },  modifier= Modifier.padding(4.dp)) {Text(text = number.toString())
    Text(text = number.toString())

        
    }

}
@Composable
fun CalcOperationButton(operation: String, display: MutableState<String>){
    Button(onClick = { /*TODO*/ }, modifier= Modifier.padding(4.dp)) {
     Text(text=operation)
    }

}
@Composable
fun CalcEqualsButton(display: MutableState<String>){
  Button(onClick = { display.value= "0"}, modifier = Modifier.padding(4.dp)) {
   Text("=")
  }
}
