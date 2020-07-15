package com.alxminyaev.notes.channel

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// Buffered channel
fun main(args: Array<String>) = runBlocking {

    val channel = Channel<String>(capacity = 2)

    val senderJob = launch(Dispatchers.IO) {
        var counter = 0
        repeat(10) {
            channel.send("$counter")
            println("Sent: $counter")
            counter++
        }
    }

    launch(Dispatchers.Default) {
        repeat(5) {
            println("Received: ${channel.receive()}")
            delay(2_000)
        }
    }

    return@runBlocking
}