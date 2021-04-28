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

        const val Info_Extra_Mensagem = "Mensagem"
        const val Info_Extra_Data = "Data"

    }
    fun enviaMensagem(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextMensagem)

        val mensagem = editTextMensagem.text.toString()

        val data = Date()

        if(mensagem.isBlank()){
            editTextMensagem.error = getString(R.string.MensagemVazia)
            return
        }

        val intent = Intent(this, MostraMensagemActivity::class.java).apply {

            putExtra(Info_Extra_Mensagem, mensagem)
            putExtra(Info_Extra_Data, data)

        }

        startActivity(intent)

    }
}