package com.eyyuperdogan.registerlocation.coroutines

//100 bin işlemde normalde uygulama çöker
//ama Coroutines ler sayesinde 1 milyon işlemi uygulamayı çökertmeden çalıştır.

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    /*

      GlobalScope.launch {
          repeat(100000){
              launch {
               println("Eyyüp")
              }
          }
      }

     */



       /*
       //runBloking
        println("run bloking start")
        runBlocking {
            launch {
                delay(5000)
                println("run bloking")
            }
        }
        println("run bloking end")
        */



        /*
      //GlobalScope
        println("GlobalScope start")
        GlobalScope.launch() {
                delay(5000)
                println("GlobalScope ")
            }
        println("GlobalScope end")

         */


        /*
        //CoroutineScope
        println("CoroutineScope start")
        CoroutineScope(Dispatchers.Default).launch() {
            delay(5000)
            println("CoroutineScope ")
        }
        println("CoroutineScope end")
         */

    }


}