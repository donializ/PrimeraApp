package ruelas.donia.primeraapp.statehoisting

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MyStateHoisitng(){
    var cont by rememberSaveable{ mutableStateOf(1) }
    var cont1 by rememberSaveable{ mutableStateOf(0) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        MyStateHoisting1(cont) {cont+=2}
        MyStateHoisting2(cont1, onClick={cont1+=2})
    }

}

@Composable
fun MyStateHoisting1(cont:Int, onClick:()->Unit){
    Button( onClick = { onClick() }) {
        Text(text="Pulsar1")
    }
    Text("He sido pulsado ${cont} veces")
}

@Composable
fun MyStateHoisting2(cont:Int, onClick:()->Unit){
    Button( onClick = { onClick() }) {
        Text(text="Pulsar2")
    }
    Text("He sido pulsado ${cont} veces")
}