package com.example.testeretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criação da instancia do serviço através do client
        val remote = RetrofitClient.createService(PostService::class.java)

        //Criação da estrutura de recebimento da response
        val call: Call<List<PostModel>> = remote.listPosts()

        //execute() refere-se a chamada sincrona
        //call.execute()

        //enqueue() -> chamada assincrona, enfilera as chamadas e deixa que o retrofit as gerencie
        //Como é uma chamada assincrona, deve ser passado um CallBack, um código que deve ser usado em caso de sucesso e em caso de falha após o término da chamada
        val response = call.enqueue(object : Callback<List<PostModel>> {

            override fun onFailure(call: Call<List<PostModel>>, t: Throwable) {
                val s = t.message
            }

            override fun onResponse(call: Call<List<PostModel>>, res: Response<List<PostModel>>) {
                val s = res.body()

            }

        })
    }
}
