package com.eyyuperdogan.registerlocation.coroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    runBlocking {
        launch {
            delay(2000)
            println("run blocking")
            myFunction()
        }
    }

}

suspend fun myFunction(){
    coroutineScope {
        delay(4000)
        println("suspend function")
    }
}