package cambron.jesus.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var numero:Int = 0
    var numeroMaximo:Int=100
    var numeroMinimo:Int=0
    var intentos: Int =0

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val label:TextView = findViewById(R.id.etiqueta) as TextView
            val labelIntentos:TextView = findViewById(R.id.intento) as TextView
            val down:Button = findViewById(R.id.down) as Button
            val up:Button = findViewById(R.id.up) as Button
            val generate:Button = findViewById(R.id.generate) as Button
            val correcto:Button = findViewById(R.id.correcto) as Button

            generate.setOnClickListener{
                intentos++
                labelIntentos.setText("Intentos: "+intentos)
                numero= Random.nextInt(numeroMinimo,numeroMaximo)
                label.setText(""+numero+"")
            }

            up.setOnClickListener{
                intentos++
                labelIntentos.setText("Intentos: "+intentos)
                numeroMinimo = numero+1
                numero = Random.nextInt(numeroMinimo,numeroMaximo)
                label.setText(""+numero+"")
            }

            down.setOnClickListener{
                intentos++
                labelIntentos.setText("Intentos: "+intentos)
                numeroMaximo = numero
                numero = Random.nextInt(numeroMinimo,numeroMaximo)
                label.setText(""+numero+"")
            }

            correcto.setOnClickListener{
                label.setText("Generar un número")
                numeroMaximo= 100
                numeroMinimo = 0
                intentos = 0
            }

        }
}
