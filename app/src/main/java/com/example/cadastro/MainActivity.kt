package com.example.cadastro


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.cadastro.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var amb: ActivityMainBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            amb = ActivityMainBinding.inflate(this.layoutInflater)
            setContentView(amb.root)
    
            setSupportActionBar(amb.mainTb)
            supportActionBar?. title= getString(R.string.app_name)


            amb.limparBt.setOnClickListener(){

                amb.nomeEt.text.clear()
                amb.telefoneEt.text.clear()
                amb.emailEt.text.clear()
                amb.cidadeTv.text.clear()
                amb.emailRb.isChecked = false
                amb.masculinoRb.isChecked = true
                amb.femininoRb.isChecked = false
                amb.estadosSp.setSelection(0)
            }
    
            amb.salvaBt.setOnClickListener(){
                val sexoSelecionado = if (amb.masculinoRb.isChecked) "Masculino" else "Feminino"
                val mensagem = "Nome: ${amb.nomeEt.text}\n" +
                        "Telefone: ${amb.telefoneEt.text}\n" +
                        "Email: ${amb.emailEt.text}\n" +
                        "Sexo: $sexoSelecionado\n" +
                        "Cidade: ${amb.cidadeTv.text}\n" +
                        "UF: ${amb.estadosSp.selectedItem}"
    
                Toast.makeText(this, mensagem,
                    Toast.LENGTH_LONG).show()
            }
    
        }
}