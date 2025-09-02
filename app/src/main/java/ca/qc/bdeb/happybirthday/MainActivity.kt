package ca.qc.bdeb.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ca.qc.bdeb.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                MonAppli()
                }
            }
        }
    }

@Composable
fun ImageAcceuil(message: String, auteur: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        TexteAcceuil(message, auteur, modifier.fillMaxSize())
    }
}

@Composable
fun MonAppli(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background) {
        ImageAcceuil(message = "Joyeux anniversaire Joshua", auteur = "From me")
    }
}

@Composable
fun TexteAcceuil(message: String, auteur: String, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center, modifier = modifier.padding(8.dp)) {
        Text(
            text = message,
            fontSize = 60.sp,
            lineHeight = 66.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = auteur,
            fontSize = 30.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true,
    showSystemUi = true,
    name = "Happy Birthday")

@Composable
fun GreetingPreview() {
    HappyBirthdayTheme {
        MonAppli()
    }
}