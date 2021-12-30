package com.halil.ozel.coroutines101

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    runBlocking {
        launch {
            delay(4000)
            println("RunBlocking")
        }

        coroutineScope {
            launch {
                delay(2000)
                println("CoroutineScope")
            }
        }
    }

}