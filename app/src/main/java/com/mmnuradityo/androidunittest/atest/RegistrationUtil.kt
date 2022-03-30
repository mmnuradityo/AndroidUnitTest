package com.mmnuradityo.androidunittest.atest

object RegistrationUtil {

    private val existUsers = listOf("Peter", "Carl")

    /**
     * the input not valid if
     * the username or password is empty
     * the username is alrea dy taken
     * the confirmed password is not the same as the real password
     * the password contains less than 2 digits
     * */
    fun validateRegistration(
        userName: String,
        password: String,
        confirmedPassword: String
    ) : Boolean {
        if (userName.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()) {
            return false
        } else if (userName in existUsers) {
            return false
        } else if (password.count { it.isDigit() } < 2 ) {
            return false
        } else if (password != confirmedPassword) {
            return false
        }

        return true
    }

}