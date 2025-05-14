package ruelas.donia.primeraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ruelas.donia.primeraapp.components.MyTextField
import ruelas.donia.primeraapp.screens.LoginScreen
import ruelas.donia.primeraapp.statehoisting.MyStateHoisitng
import ruelas.donia.primeraapp.ui.theme.PrimeraAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimeraAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                  /*  Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    MostrarTexto()*/
                    //MyBox()
                   // MyColumn()
                 //   MyRow()
                  // MyState()
                   // MyStateHoisitng()
                    //MyTextField()
                    LoginScreen(modifier = Modifier.padding(innerPadding))


                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimeraAppTheme {
        Greeting("Android")
    }
}