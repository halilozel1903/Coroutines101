package com.halil.ozel.coroutines101

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// Marks declarations in the coroutines that are delicate —
// they have limited use-case and shall be used with care in general code
@DelicateCoroutinesApi
fun main() {

    /**
    GlobalScope: The difference of GlobalScope from runBlocking is that it acts independently.
    The end of the thread it is in does not prevent it from running.
     */

    println("Global Scope Start")
    GlobalScope.launch {
        delay(4000)
        println("Global Scope Continue")
    }
    println("Global Scope End")
}