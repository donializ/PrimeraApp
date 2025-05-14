package ruelas.donia.primeraapp.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyRow(){
    Row(modifier = Modifier.fillMaxSize().horizontalScroll(rememberScrollState())) {
       Text("Texto 1", modifier = Modifier.height(100.dp).width(100.dp).background(Color.Cyan))
       Text("Texto 2", modifier = Modifier.height(100.dp).width(100.dp).background(Color.Red))
       Text("Texto 3", modifier = Modifier.height(100.dp).width(100.dp).background(Color.Green))
       Text("Texto 4", modifier = Modifier.height(100.dp).width(100.dp).background(Color.Cyan))
       Text("Texto 5", modifier = Modifier.height(100.dp).width(100.dp).background(Color.Red))
       Text("Texto 6", modifier = Modifier.height(100.dp).width(100.dp).background(Color.Green))

    }
}