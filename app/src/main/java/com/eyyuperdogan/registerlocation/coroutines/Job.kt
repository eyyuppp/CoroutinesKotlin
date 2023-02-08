package com.eyyuperdogan.registerlocation.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    runBlocking {
       val myjob1= launch {
            delay(2000)
            println("job 1")

           val myjob2=launch {
               delay(1000)
               println("job 2")
           }
        }
        //job 1 bittiğinde ne yapyım
        myjob1.invokeOnCompletion {
            println("job 1 end")
        }
    }

}
