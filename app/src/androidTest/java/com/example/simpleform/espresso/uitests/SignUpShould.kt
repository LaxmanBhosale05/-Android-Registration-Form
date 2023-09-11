package com.example.simpleform.espresso.uitests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.simpleform.MainActivity
import com.example.simpleform.espresso.helper.SignUpFormTestData
import com.example.simpleform.espresso.pages.SignUpFormPage
import org.junit.Rule
import org.junit.Test

class SignUpShould {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    private val signUpFormPage = SignUpFormPage()
    private val signUpFormTestData = SignUpFormTestData()

    @Test
    fun signUpFormTest(){
        signUpFormPage.enterSignUpFormData()
    }

}