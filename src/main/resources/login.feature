@ignore
Feature: Amazon Login feature

  Scenario: AmazonLogin Test Scenario

    Given I am on amazon appplicato
    When title of login page is Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
    And I click on Sign in link
    When I  enter username
    And  I click on Continue
    When I enter password
    And   I click on Sign in button
    Then I should be on  homepage