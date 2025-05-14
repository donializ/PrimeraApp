package ruelas.donia.primeraapp.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview
@Composable
fun MyConstraintLayout() {

    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxMagenta, boxYellow, boxGreen) = createRefs()

        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Red)
            .constrainAs(boxRed){
                bottom.linkTo(parent.bottom)
            }
        )
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Blue)
            .constrainAs(boxBlue){
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            }

        )
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Magenta)
            .constrainAs(boxMagenta){
                start.linkTo(boxGreen.end)
                bottom.linkTo(boxGreen.top)
            }
        )
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Yellow))
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Green))
    }

}