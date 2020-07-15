package com.alxminyaev.notes.channel

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// "Rendezvous" channel
fun main(args: Array<String>) = runBlocking {

    val channel = Channel<String>() // default "Rendezvous" channel
    launch {
        channel.send("A1") // 1
        channel.send("A2") // 3
        println("A done")
    }
    launch {
        channel.send("B1") // 2
        println("B done")
    }
    launch {
        repeat(3) {
            val x = channel.receive()
            println(x)
        }
    }
    return@runBlocking
}
