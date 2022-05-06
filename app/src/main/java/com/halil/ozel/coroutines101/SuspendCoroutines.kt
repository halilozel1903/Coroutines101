package com.halil.ozel.coroutines101

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        delay(2000)
        println("Run Blocking")
        myFunction()
    }
}

/**
It allows the completion of operations without blocking the current running thread.
Suspend; These are functions that can be restarted and stopped. These functions should be used in the coroutine.
 */
suspend fun myFunction() {
    coroutineScope {
        delay(4000)
        println("Suspend Function")
    }
}