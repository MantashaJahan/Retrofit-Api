package com.example.retrofitapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        val queteApi = RetrofitBuilder.getInstance().create(MyInterface::class.java)


        GlobalScope.launch {
            val result = queteApi.getQuotes()

            if (result!=null){


                Log.d("mantasha" , result.body().toString())
            }
        }
    }
}