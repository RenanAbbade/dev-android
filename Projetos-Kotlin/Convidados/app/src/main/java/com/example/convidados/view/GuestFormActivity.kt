package com.example.convidados.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.convidados.viewModel.GuestFormViewModel
import com.example.convidados.R
import kotlinx.android.synthetic.main.activity_guest_form.*

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var model: GuestFormViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest_form)

        model = ViewModelProvider(this).get(GuestFormViewModel::class.java)

        setListeners()

        observe()
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.buttonSave ->{
                val name = editName.text.toString()
                val presence = radio_presence.isChecked
                model.save(name, presence)
            }
        }
    }

    private fun setListeners(){
        buttonSave.setOnClickListener(this)
    }

    private fun observe(){
        model.saveGuest.observe(this, Observer {
            //it é o valor do tipo booleano observado, se for sucesso entrará no escopo do if
            if(it){
                Toast.makeText(applicationContext, "Sucesso", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "Falha", Toast.LENGTH_SHORT).show()
            }
        })
    }





}
