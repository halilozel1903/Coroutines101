package com.halil.ozel.coroutines101

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/**
 * Created by halilozel1903 on 01.01.2022
 */


fun main() {
    var url = ""
    var name = ""

    /**
    It is used for asynchronous operations that return a value.
    The difference from launch is that it returns Deffered instead of Job.
    The await() function is used to get the result.
     */

    runBlocking {
        val downloadedUrl = async { downloadUrl() }
        val downloadedName = async { downloadName() }
        url = downloadedUrl.await()
        name = downloadedName.await()
        println("$url -> $name")
    }
}

private suspend fun downloadUrl(): String {
    delay(3000)
    val url = "https://www.brooklyn99.com"
    println("Url was downloaded.")
    return url
}

private suspend fun downloadName(): String {
    delay(5000)
    val name = "Brooklyn Nine-Nine"
    println("Name was downloaded.")
    return name
}