package com.test.androidtestdrivendevelopment.game.model

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class QuestionUnitTest {

    // Declares a private lateinit variable for the Question object, to be initialized before each test
    private lateinit var question: Question

    @Before
    // The method annotated with @Before is executed before each test method.
    // It initializes the Question object to ensure every test starts with a fresh instance.
    fun initiateQuestion() {
        question = Question(correctOption = "CORRECT", incorrectOption = "INCORRECT")
    }

    @Test
    // Indicates that this is a test method. It verifies the initial state of the 'answeredOption' property in the Question object.
    fun whenCreatingQuestion_answeredOptionShouldBeNull() {
        Assert.assertNull(question.answeredOption)
    }

    @Test
    // Marks this as a test method. It checks that calling 'answer()' with the correct option returns true.
    fun whenAnswering_withCorrectOption_shouldReturnTrue() {
        val result = question.answer("CORRECT")
        Assert.assertEquals(true, result)
    }

    @Test
    // Denotes a test method. This test ensures that providing an incorrect answer to 'answer()' returns false.
    fun whenAnswering_whenInCorrectAnswer_shouldReturnFalse() {
        val result = question.answer("INCORRECT")
        Assert.assertEquals(false, result)
    }

    @Test(expected = IllegalArgumentException::class)
    // Specifies that this test method expects an IllegalArgumentException to be thrown.
    // It tests that an invalid option passed to 'answer()' results in an exception.
    fun whenAnswering_whenInvalidOption_throwException() {
        question.answer(value = "INVALID")
    }
}
