package pt.ipg.mensagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    companion object{

        val Info_Extra_Mensagem = "Mensagem"
        val Info_Hora = "Hora"


    }
    fun enviaMensagem(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextMensagem)

        val mensagem = editTextMensagem.text.toString()

        val hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY).toString()

        if(mensagem.isBlank()){
            editTextMensagem.error = getString(R.string.MensagemVazia)
            return
        }

        val intent = Intent(this, MostraMensagemActivity::class.java)
        intent.putExtra(Info_Extra_Mensagem, mensagem)
        intent.putExtra(Info_Hora, hora)

        startActivity(intent)

    }
}