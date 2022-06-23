# Coroutines-101 🧵

![Coroutines-101](https://miro.medium.com/max/800/1*1tDZwUd3NMQuIjZVkv-r0w.png)

A coroutine is a concurrency design pattern that you can use on Android to simplify code that executes asynchronously. Coroutines were added to Kotlin in version 1.3 and are based on established concepts from other languages.

On Android, coroutines help to manage long-running tasks that might otherwise block the main thread and cause your app to become unresponsive. Over 50% of professional developers who use coroutines have reported seeing increased productivity. This topic describes how you can use Kotlin coroutines to address these problems, enabling you to write cleaner and more concise app code.


## Features 👀

![Coroutines-101](https://www.techyourchance.com/wp-content/uploads/2020/11/coroutines-cheat-sheet.jpg)

Coroutines is our recommended solution for asynchronous programming on Android. Noteworthy features include the following:

1. **Lightweight**: You can run many coroutines on a single thread due to support for suspension, which doesn't block the thread where the coroutine is running. Suspending saves memory over blocking while supporting many concurrent operations.
2. **Fewer memory leaks**: Use structured concurrency to run operations within a scope.  
3. **Built-in cancellation support**: Cancellation is propagated automatically through the running coroutine hierarchy.
4. **Jetpack integration**: Many Jetpack libraries include extensions that provide full coroutines support. Some libraries also provide their own coroutine scope that you can use for structured concurrency.

## Project Contents 📜

- [CoroutineScope](https://github.com/halilozel1903/Coroutines101/blob/master/app/src/main/java/com/halil/ozel/coroutines101/CoroutineScopeClass.kt)
- [Dispatchers Coroutines](https://github.com/halilozel1903/Coroutines101/blob/master/app/src/main/java/com/halil/ozel/coroutines101/DispatchersCoroutines.kt)
- [GlobalScope](https://github.com/halilozel1903/Coroutines101/blob/master/app/src/main/java/com/halil/ozel/coroutines101/GlobalScopeClass.kt)
- [Nested Coroutines](https://github.com/halilozel1903/Coroutines101/blob/master/app/src/main/java/com/halil/ozel/coroutines101/NestedCoroutines.kt)
- [RunBlocking](https://github.com/halilozel1903/Coroutines101/blob/master/app/src/main/java/com/halil/ozel/coroutines101/RunBlockingClass.kt)
- [Suspend Coroutines](https://github.com/halilozel1903/Coroutines101/blob/master/app/src/main/java/com/halil/ozel/coroutines101/SuspendCoroutines.kt)
- [Coroutines Async](https://github.com/halilozel1903/Coroutines101/blob/master/app/src/main/java/com/halil/ozel/coroutines101/CoroutinesAsync.kt)


## License ℹ️
```
MIT License 

Copyright © 2022 Halil OZEL

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
