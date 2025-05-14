package ruelas.donia.primeraapp.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyColumn() {
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        Text("Texto 1", modifier = Modifier
            .background(Color.Cyan)
            .fillMaxWidth()
            .height(100.dp))
        Text("Texto 2", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp))
        Text("Texto 3", modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth()
            .height(100.dp))
        Text("Texto 4", modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth()
            .height(100.dp))
        Text("Texto 5", modifier = Modifier
            .background(Color.Cyan)
            .fillMaxWidth()
            .height(100.dp))
        Text("Texto 6", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp))
        Text("Texto 7", modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth()
            .height(100.dp))
        Text("Texto 8", modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth()
            .height(100.dp))
        Text("Texto 9", modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth()
            .height(100.dp))
        Text("Texto 10", modifier = Modifier
            .background(Color.Cyan)
            .fillMaxWidth()
            .height(100.dp))
        Text("Texto 11", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth()
            .height(100.dp))
        Text("Texto 12", modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth()
            .height(100.dp))
        Text("Texto 13", modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth()
            .height(100.dp))
    }

}