package com.alxminyaev.notes.channel

import com.alxminyaev.notes.channel.model.Player
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.SendChannel
import kotlin.random.Random

class PlayersController(private val channel: SendChannel<Player>, private val players: List<Player>) {

    private var job: Job? = null
    private val coroutineScope: CoroutineScope = CoroutineScope(Dispatchers.Default)

    fun randomMoving() {
        val random = Random(1)
        job?.cancel()
        job = coroutineScope.launch {
            while (true) {
                movePlayers(random)
            }
        }

    }

    fun randomMoving(amountTick: Int) {
        val random = Random(1)
        job?.cancel()
        job = coroutineScope.launch {
            repeat(amountTick) {
                movePlayers(random)
            }
        }

    }

    private suspend fun movePlayers(random: Random) {
        yield()
        players.forEach { player ->
            channel.send(player.copy(x = random.nextInt(0, 100), y = random.nextInt(0, 100)))
        }
        delay(1_000)
    }

    fun cancel() {
        job?.cancel()
    }
}