Feature: Amazon Login feature

  Scenario Outline: Login functionality

    Given  User is navigated to "https://www.amazon.com/"page
    When user clicks on Sign in
    And User clicks on Continue
    And  User enter password
    When User clicks on Sign in button
    Then User should be on  homepage
    Examples:
      |username  |password
      |khanshabb111@gmail.com  |Agustina2426
