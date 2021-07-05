package simons.valdez.ignacio.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val bundle = intent.extras
        if(bundle!=null){
            var nombre = bundle.getString("name")
            var email = bundle.getString("email")

            var tv_nombre = findViewById<TextView>(R.id.tv_nombre)
            var tv_email = findViewById<TextView>(R.id.tv_email)

            tv_nombre.text = nombre
            tv_email.text = email
        }

        var btn_cerrarSesion = findViewById<Button>(R.id.btn_cerrarSesion)

        btn_cerrarSesion.setOnClickListener{
            finish()
        }

    }
}