package pt.ipg.mensagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.TextValueSanitizer
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MostraMensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_mensagem)



        val mensagem = intent.getStringExtra(MainActivity.Info_Extra_Mensagem)
        val data = intent.getSerializableExtra(MainActivity.Info_Extra_Data)as Date

        val textViewMensagem = findViewById<TextView>(R.id.textViewMensagem)
        textViewMensagem.setText(mensagem)

        val textViewData = findViewById<TextView>(R.id.textViewData)
        val df = SimpleDateFormat("HH:mm:ss") //formato da data
        textViewData.setText(df.format(data))

    }
}