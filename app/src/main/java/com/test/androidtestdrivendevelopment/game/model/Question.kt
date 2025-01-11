package com.test.androidtestdrivendevelopment.game.model

class Question(
    val correctOption: String,
    val incorrectOption: String,
) {
    var answeredOption: String? = null
        private set

    val isAnsweredCorrectly: Boolean
        get() = answeredOption == correctOption


    fun answer(value: String): Boolean {

        if(value != correctOption && value != incorrectOption){
            throw IllegalArgumentException("Not a valid answer")
        }

        answeredOption = value

        return isAnsweredCorrectly

    }
}