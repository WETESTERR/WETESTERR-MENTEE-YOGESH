Feature: login to zero bank account

  Scenario: user is login into his account
    Given user is on home page of bank
    When user title of page is Zero - Personal Banking - Loans - Credit Cards
    Then user clicks on signin button
    Then user enters login and password
    Then user click on Sign in button
    Then user gets his or her account summary


