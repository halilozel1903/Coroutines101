package com.halil.ozel.coroutines101

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class DispatchersCoroutines {
    fun main() {

        /**
        It is a mechanism that specifies which thread the coroutine will run on. There are 4 different types.

        Dispatchers.Default : Used for CPU operations. launch is the default dispatcher of the async standard
        coroutine creation functions.

        Dispatchers.IO : It is used for Network and Disk based jobs. It is frequently used in corporate applications.

        Dispatchers.Main : Works with Main Thread. UI thread operations are done.

        Dispatchers.Unconfined: Although it is used in Main Thread operations, it is a dispatcher that is not
        recommended to be used. It starts the coroutine process in the called thread.
         */

        runBlocking {
            launch(Dispatchers.Main) {
                println("Main Thread: ${Thread.currentThread().name}")
            }
            launch(Dispatchers.IO) {
                println("IO Thread: ${Thread.currentThread().name}")
            }
            launch(Dispatchers.Default) {
                println("Default Thread: ${Thread.currentThread().name}")
            }
            launch(Dispatchers.Unconfined) {
                println("Unconfined Thread: ${Thread.currentThread().name}")
            }
        }
    }
}

