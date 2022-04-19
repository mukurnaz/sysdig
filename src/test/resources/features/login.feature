Feature:
    Background: Url
        When user navigates to "homepage_url" login page
    @SmokeTest
    Scenario Outline: Try to login with invalid credentials
        And Click on email textbox
        And Provide email "<Email>"
        And Click on password textbox
        And Provide password "<Password>"
        And User clicks login button
        Then User should be seen "Credentials are not valid" messages
        Examples: Invalid Username And Password
            |Email|Password|
            |email_2|password_1|
            |email_3|password_2|
    Scenario: Required Fields Email
        Then User clicks login button
        And User should be see "Please fill out this field." alert text to "email"
    Scenario: Required Fields Email Without @
        Then Click on email textbox
        Then Provide "email_1" to email
        Then Click on password textbox
        Then User clicks login button
        And User should be see "Please include an '@' in the email address." alert text to "email"
    Scenario: Required Fields Password
        Then Click on email textbox
        Then Provide "email_2" to email
        Then Click on password textbox
        Then User clicks login button
        And User should be see "Please fill out this field." alert text to "password"
    Scenario: Forget Password
        When Click forgot your password link
        Then Click email adress textbox on the forgot password page
        Then Provide "email_2" to email on the forgot password page
        Then Click Request password reset button
        And User should be see "We just sent the password reset email" messages
