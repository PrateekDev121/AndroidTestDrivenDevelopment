package com.test.androidtestdrivendevelopment.game.model

class Game(lastHighScore: Int = 0, gameQuestions: List<Question>) {


    private val questions: List<Question> = gameQuestions

    private var currentQuestion: Int = -1


    var currentScore = 0
        private set

    var highestScore = lastHighScore
        private set

    fun incrementScore() {
        currentScore++

        if (currentScore > highestScore) {
            highestScore = currentScore
        }
    }

    fun getQuestion(): Question? {
        return questions[currentQuestion].let {
            currentQuestion++
            it
        } ?: null
    }
}