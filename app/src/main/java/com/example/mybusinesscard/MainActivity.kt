
package com.example.mybusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartedevisite.R
import com.example.mybusinesscard.ui.theme.CarteDeVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteDeVisiteTheme {
                Cartedevisite(
                )
            }
        }
    }
}

@Composable
fun Cartedevisite() {


    Column(
        modifier = Modifier.fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
    }

}

@Composable
fun BusinessCardScreen() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderSection(
            logo = painterResource(R.drawable.android_logo),
            name = stringResource(R.string.NomPrenom),
            title = "Business Card"
        )
        ContactSection(
            phone = "05 65 43 25 50",
            email = stringResource(R.string.adresseMail),
            socialAddress = "cybersecurite.ci"
        )
    }
}


@Composable
fun HeaderSection(
    logo: Painter,
    name: String,
    title: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = logo,
            contentDescription = "Android Icon",
            modifier = Modifier.size(190.dp),
        )
        Text(
            text = name,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
fun ContactSection(
    phone: String,
    email: String,
    socialAddress: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp, start = 50.dp),
        ) {
            Icon(
                imageVector = Icons.Filled.Phone,
                contentDescription = "Phone Icon",
                tint = Color(0xFF3DDC84)
                )
            Text(
                text = phone,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 15.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp, start = 50.dp),
        ) {
            Icon(
                imageVector = Icons.Filled.Email,
                contentDescription = "Adresse Email Icon",
                tint = Color(0xFF3DDC84)
            )
            Text(
                text = email,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 15.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp, start = 50.dp),
        ) {
            Icon(
                imageVector = Icons.Filled.Person,
                contentDescription = "Address Icon",
                tint = Color(0xFF3DDC84)
            )
            Text(
                text = socialAddress,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 15.dp)
            )
        }
    }
}

@Preview(showBackground = true,showSystemUi = true)
@Composable
fun BusinessCardScreenPreview() {
    CarteDeVisiteTheme {
        BusinessCardScreen()
    }

}