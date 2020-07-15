package com.alxminyaev.notes.channel

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// Conflated channel
fun main() = runBlocking {
    val channel = Channel<String>(Channel.CONFLATED)

    launch(Dispatchers.IO) {
        var counter = 0
        repeat(10) {
            channel.send("$counter")
            println("Sent: $counter")
            counter++
        }
    }

    launch(Dispatchers.Default) {
        for (data in channel) {
            println("Received: $data")
            delay(1_000)
        }
    }

    return@runBlocking
}