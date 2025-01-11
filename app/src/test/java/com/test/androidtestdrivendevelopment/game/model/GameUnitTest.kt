package com.test.androidtestdrivendevelopment.game.model

import org.junit.Assert
import org.junit.Test

class GameUnitTest {


    @Test
    fun whenIncScore_shouldIncScore(){
        val game = Game()

        game.incrementScore()

        Assert.assertEquals(1,game.currentScore)

    }

    @Test
    fun whenIncScore_aboveHighScore_shouldUpdateHighScore(){
        val game = Game()

        game.incrementScore()

        Assert.assertEquals(game.currentScore,game.highestScore)
    }

    @Test
    fun whenInScore_belowHighScore_shouldNotUpdateHighScore(){
        val game = Game(10)

        game.incrementScore()

        Assert.assertEquals(10,game.highestScore)
    }


}