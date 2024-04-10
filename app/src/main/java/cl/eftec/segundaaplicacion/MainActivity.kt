package cl.eftec.segundaaplicacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cl.eftec.segundaaplicacion.ui.theme.SegundaAplicacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SegundaAplicacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Componente1()
                }
            }
        }
    }
}
@Composable
fun Componente1() {
    val prod=Producto()
    prod.nombre="cocacola"
    prod.cantidad=30
    prod.precio=500
    var name by remember { mutableStateOf("") }
    var contador by remember { mutableStateOf(0)}
    Column(Modifier.background(Color.Cyan)) {
        Text(text="hola mundo")
        for(i in 1..20) {
           Componente2(texto1 = name, texto2 = "fila: #$i contador:$contador")
        }
        FilledButtonExample(onClick = {name="hola mundo"; contador++})
    }

}

@Composable
fun FilledButtonExample(onClick: () -> Unit) {
    Button(onClick = { onClick() }) {
        Text("Filled")
    }
}

@Composable
fun Componente2(texto1:String,texto2:String) {
    Row(Modifier.background(Color.Gray)) {
        Text(text = texto1,Modifier.width(200.dp))
        Text(text = texto2)
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
    SegundaAplicacionTheme {
        Greeting("Android")
    }
}