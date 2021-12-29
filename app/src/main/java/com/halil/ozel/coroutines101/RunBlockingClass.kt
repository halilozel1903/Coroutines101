package com.halil.ozel.coroutines101

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    /**
    runBlocking: It is used to start a new coroutine. The main thread is blocked until the related task is completed.
     */

    println("runBlocking Start")
    runBlocking {
        launch {
            delay(4000)
            println("runBlocking Continue")
        }
    }
    println("runBlocking End")
}