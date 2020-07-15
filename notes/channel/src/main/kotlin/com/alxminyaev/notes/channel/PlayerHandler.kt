package com.alxminyaev.notes.channel

import com.alxminyaev.notes.channel.model.Player
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.launch

class PlayerHandler(private val name: String, private val playerChannel: ReceiveChannel<Player>) {

    private var job: Job? = null
    private val coroutineScope = CoroutineScope(Dispatchers.Default)

    fun work() {
        job = coroutineScope.launch {
            for (player in playerChannel) {
                println("Handler ($name): $player")
            }
        }
    }

    fun cancel() {
        job?.cancel()
    }
}