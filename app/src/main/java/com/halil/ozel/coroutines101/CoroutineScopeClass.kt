package com.halil.ozel.coroutines101

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CoroutineScopeClass {
    fun main() {
        println("Coroutine Scope Start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(4000)
            println("Coroutine Scope Continue")
        }
        println("Coroutine Scope End")
    }
}

