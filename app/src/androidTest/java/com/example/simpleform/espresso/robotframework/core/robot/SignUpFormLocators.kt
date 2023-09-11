package com.example.simpleform.espresso.robotframework.core.robot

import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers

object SignUpFormLocators {

    val firstName = Espresso.onView(ViewMatchers.withId(com.example.simpleform.R.id.first_name))
    val lastName = Espresso.onView(ViewMatchers.withId(com.example.simpleform.R.id.last_name))
    val emailID = Espresso.onView(ViewMatchers.withId(com.example.simpleform.R.id.email))
    val dateOfBirth = Espresso.onView(ViewMatchers.withId(com.example.simpleform.R.id.date_of_birth))
    val password = Espresso.onView(ViewMatchers.withId(com.example.simpleform.R.id.password))
    val ppCheck = Espresso.onView(ViewMatchers.withId(com.example.simpleform.R.id.policy))
    val registerButton = Espresso.onView(ViewMatchers.withId(com.example.simpleform.R.id.signUpButtonId))

}