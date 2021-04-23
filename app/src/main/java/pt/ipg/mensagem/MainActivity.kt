package pt.ipg.mensagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    companion object{

        public val Info_Extra_Mensagem = "Mensagem"


    }
    fun enviaMensagem(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextMensagem)

        val mensagem = editTextMensagem.text.toString()

        val intent = Intent(this, MostraMensagemActivity::class.java)
        intent.putExtra(Info_Extra_Mensagem, mensagem)

        startActivity(intent)

    }
}