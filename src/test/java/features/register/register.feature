Feature: User should able to register so I can able to use my account facility

  Scenario:User should able to register with valid details

    Given User is on register page
    And user select a valid Gender
    And user entered a valid Firstname
    And user entered a valid Lastname
    And user choose a valid date of birth
    And user entered an Email
    And user entered company name
    And user select a newsletter option
    And user entered a Password
    And user entered Confirm Password
    When user click on Register Button
    Then user should see message Your registration completed
    And user get email Registration confirmation email
    And user click on Continue button
    Then user should navigate to Homepage








