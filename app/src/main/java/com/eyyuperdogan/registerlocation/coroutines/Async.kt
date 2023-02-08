package com.eyyuperdogan.registerlocation.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){
    //async await ile beraber değişken atamasını bekletip ondan sonra atama işlemini sağlar ki değişkenler boş veya null olmasın
runBlocking {
    var userName=""
    var userAge=0

    val downloadedName=async {
        downloadName()
    }
    val downloadedAge =async {
        downloadAge()
    }
    userName = downloadedName.await()
    userAge=downloadedAge.await()

    println("${userName} ${userAge}")

}

}
suspend fun downloadName():String{
    delay(2000)
    val username="Eyyüp"
    return username
}
suspend fun downloadAge():Int{
    delay(2000)
    val userAge=24
    return userAge
}