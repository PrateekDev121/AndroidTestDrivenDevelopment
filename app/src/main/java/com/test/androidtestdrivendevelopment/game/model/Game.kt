package com.test.androidtestdrivendevelopment.game.model

class Game(lastHighScore:Int = 0) {
    var currentScore = 0
        private set

    var highestScore = lastHighScore
        private set

    fun incrementScore(){
        currentScore++

        if(currentScore > highestScore){
            highestScore = currentScore
        }
    }
}