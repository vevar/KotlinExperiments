package com.alxminyaev.notes.channel

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

// Unlimited channel
fun main(args: Array<String>) = runBlocking {
    val channel = Channel<String>(Channel.UNLIMITED)

    launch(Dispatchers.IO) {
        var counter = 0
        while (true) {
            yield()
            channel.send("${counter++}")
        }
    }

    launch(Dispatchers.Default) {
        repeat(5) {
            println(channel.receive())
        }
    }

    return@runBlocking
}