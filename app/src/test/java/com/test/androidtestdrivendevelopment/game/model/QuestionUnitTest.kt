package com.test.androidtestdrivendevelopment.game.model

import org.junit.Assert
import org.junit.Test

class QuestionUnitTest {

    @Test
    fun whenCreatingQuestion_answeredOptionShouldBeNull(){

        val question = Question(correctOption = "CORRECT", incorrectOption = "INCORRECT")

        Assert.assertNull(question.answeredOption)
    }
}