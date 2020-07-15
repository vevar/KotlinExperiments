package com.alxminyaev.notes.channel

import com.alxminyaev.notes.channel.model.Player
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

object Main {

    @JvmStatic
    fun main(args: Array<String>) = runBlocking {

        val playerChannel = Channel<Player>()

        val playersController =
            PlayersController(playerChannel, listOf(Player(1), Player(2)))
                .apply { randomMoving(amountTick = 1) }

        val playerHandler1 = PlayerHandler("#1", playerChannel).apply { work() }
        val playerHandler2 = PlayerHandler("#2", playerChannel).apply { work() }
        val playerHandler3 = PlayerHandler("#3", playerChannel).apply { work() }

        delay(5_000)
    }
}