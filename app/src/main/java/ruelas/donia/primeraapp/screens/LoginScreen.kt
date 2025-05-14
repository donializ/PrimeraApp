package ruelas.donia.primeraapp.screens

import android.app.Activity
import android.graphics.drawable.Icon
import androidx.activity.compose.LocalActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DisabledVisible
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.remember
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ruelas.donia.primeraapp.R


@Composable
fun LoginScreen(modifier: Modifier) {

    Box(
        Modifier
            .fillMaxSize()
            .padding(30.dp)
    ) {
        Header(Modifier.align(Alignment.TopEnd))
        Body(Modifier.align(Alignment.Center))
        Footer(Modifier.align(Alignment.BottomCenter))
    }

}

@Composable
fun Footer(modifier: Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        HorizontalDivider(
            Modifier
                .background(Color(0XFFF9F9F9))
                .height(3.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.size(24.dp))
        SignUp()
        Spacer(modifier = Modifier.size(24.dp))
    }
}

@Composable
fun SignUp() {
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
    ) {
        Text(
            "Don´t have an account",
            fontSize = 12.sp,
            color = Color(0XFFB5B5B5),
        )
        Text(
            "Sign Up",
            Modifier.padding(horizontal = 8.dp),
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF4EA8E9)
        )
    }
}


@Composable
fun Body(modifier: Modifier) {

    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var isLoginEnable by rememberSaveable { mutableStateOf(false) }

    Column(modifier = modifier) {
        LogoLogin(Modifier.align(Alignment.CenterHorizontally))
        Spacer(Modifier.size(48.dp))
        Email(email, { email = it })
        Spacer(Modifier.size(16.dp))
        Password(password, { password = it })
        ForgotPassword(Modifier.align(Alignment.End))
        Spacer(Modifier.size(32.dp))
        LoginButton(isLoginEnable, Modifier.fillMaxWidth())
    }
}

@Composable
fun LoginButton(loginEnable:Boolean, modifier: Modifier) {

    Button(onClick = {},
        enabled =loginEnable ,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF4EA8E9),
            disabledContainerColor = Color(0xFF78C8F9),
            contentColor = Color.White,
            disabledContentColor = Color.White
        )
        ) {
        Text("Login")
    }
}

@Composable
fun ForgotPassword(modifier: Modifier) {
    Text(
        text = "Forgot password?",
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF4EA8E9),
        modifier = modifier
    )
}

@Composable
fun Password(password: String, onTextChanged: (String) -> Unit) {

    var passwordVisibility by remember { mutableStateOf(false) }

    TextField(
        value = password,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text("Password")},
        shape = RoundedCornerShape(16.dp),
        minLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color(0XFF4285F4),
            unfocusedIndicatorColor = Color(0XFF4285F4),
            focusedContainerColor = Color(0xFFFAFAFA),
            unfocusedContainerColor = Color(0xFFFAFAFA)
        ),
        trailingIcon ={
            val imagen = if(passwordVisibility){
                Icons.Filled.Visibility
            }else{
                Icons.Filled.DisabledVisible
            }
            IconButton(onClick = {passwordVisibility =!passwordVisibility}) {
                Icon(imageVector = imagen, contentDescription = "show password")
            }
        },
        visualTransformation = if(passwordVisibility){
            VisualTransformation.None
        }else{
            PasswordVisualTransformation()
        }
    )
}

@Composable
fun Email(email: String, onTextChanged: (String) -> Unit) {
    TextField(
        value = email,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text("Email or PhoneNumber")},
        shape = RoundedCornerShape(8.dp),
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color(0XFF4285F4),
            unfocusedIndicatorColor = Color(0XFF4285F4),
            focusedContainerColor = Color(0xFFFAFAFA),
            unfocusedContainerColor = Color(0xFFFAFAFA)
        ),
        trailingIcon = {
            Icon(imageVector = Icons.Default.Email, contentDescription = "Email Icon")
        }
    )
}



@Composable
fun LogoLogin(modifier: Modifier) {

    Image(
        painter = painterResource(R.drawable.tutoria),
        contentDescription = "Logo Login",
        modifier = modifier
    )

}


@Composable
fun Header(modifier: Modifier) {
    val activity = LocalActivity.current as Activity

    Icon(imageVector = Icons.Default.Close,
        contentDescription = "icono cerrar",
        modifier = modifier.clickable { activity.finish() }

    )
}
