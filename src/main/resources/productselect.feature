Feature: Amazon Product Select feature

  Scenario: Product should be selected successfully

    Given I am on amazon app
    When title of login page would be  Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
    And I click on Sign in
    When I  enter userEmail
    And  I click on Continue button
    When I enter pass_word
    And   I click on Sign_in button
    When I  am  on  homepage
    And I type in laptop in search text box
    When I click on search icon
    And I should view laptopcomputers and click on computer to select
    And  I click on Add to Cart button
    And I click Procceed to Checkout
    Then I should view shipping address information to enter



