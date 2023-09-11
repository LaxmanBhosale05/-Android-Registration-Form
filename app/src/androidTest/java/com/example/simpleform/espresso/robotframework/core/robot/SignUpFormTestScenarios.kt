package com.example.simpleform.espresso.robotframework.core.robot

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.simpleform.MainActivity
import com.example.simpleform.espresso.helper.SignUpFormTestData
import org.junit.Rule
import org.junit.Test

class SignUpFormTestScenarios {
    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)
    private val signUpFormTestData = SignUpFormTestData()

    @Test
    fun TestCase1() {
        signUp {

            setFirstName(signUpFormTestData.firstName)
            setLastName(signUpFormTestData.lastName)
            setEmailID(signUpFormTestData.email)
            setDateOfBirth(signUpFormTestData.dateOfBirth)
            setPassword(signUpFormTestData.password)


        }
    }

}