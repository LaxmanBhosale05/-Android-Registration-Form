package com.example.simpleform.espresso.robotframework.core.robot

import com.example.simpleform.espresso.core.BaseTest

class SignUpFormRobot : BaseTest(){

    fun setFirstName(firstName:String) = fillEditText(SignUpFormLocators.firstName,firstName)
    fun setLastName(lastName:String) = fillEditText(SignUpFormLocators.lastName,lastName)
    fun setEmailID(emailID:String) = fillEditText(SignUpFormLocators.emailID,emailID)
    fun setDateOfBirth(dateOfBirth:String) = fillEditText(SignUpFormLocators.dateOfBirth,dateOfBirth)
    fun setPassword(password:String) = fillEditText(SignUpFormLocators.dateOfBirth,password)

    fun checkPolicy(polictCheck:String) = fillEditText(SignUpFormLocators.ppCheck,polictCheck)
    fun clickOnRegister(registerButton:String) = fillEditText(SignUpFormLocators.registerButton,registerButton)

}
fun signUp(func: SignUpFormRobot.() ->Unit) = SignUpFormRobot().apply(func)