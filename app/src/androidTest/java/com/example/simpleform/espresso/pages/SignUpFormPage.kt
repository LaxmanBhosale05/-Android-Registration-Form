package com.example.simpleform.espresso.pages

import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers
import com.example.simpleform.espresso.core.BaseTest

class SignUpFormPage : BaseTest() {


    //locators

    private val firstNameLocator =
        Espresso.onView(ViewMatchers.withId(com.example.simpleform.R.id.first_name))
    private val lastNameLocator =
        Espresso.onView(ViewMatchers.withId(com.example.simpleform.R.id.last_name))
    private val emailLocator =
        Espresso.onView(ViewMatchers.withId(com.example.simpleform.R.id.email))
    private val dateLocator =
        Espresso.onView(ViewMatchers.withId(com.example.simpleform.R.id.date_of_birth))
    private val passwordLocator =
        Espresso.onView(ViewMatchers.withId(com.example.simpleform.R.id.password))
    private val PPLocator = Espresso.onView(ViewMatchers.withId(com.example.simpleform.R.id.policy))
    private val registerButtonLocator =
        Espresso.onView(ViewMatchers.withId(com.example.simpleform.R.id.signUpButtonId))


    //function to sign up data

    fun enterSignUpFormData() {
        setFirstName("Laxman")
        setLastName("Bhosle")
        setEmail("laxman.bhosle@thks.com")
        setPassword("Test@1234")
    }

    //setters
    private fun setFirstName(firstName: String) = fillEditText(firstNameLocator, firstName)
    private fun setLastName(lastName: String) = fillEditText(lastNameLocator, lastName)
    private fun setEmail(email: String) = fillEditText(emailLocator, email)
    private fun setPassword(password: String) = fillEditText(dateLocator, password)


}