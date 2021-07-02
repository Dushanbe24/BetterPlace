Feature: Donation form for visit and payment method
  @betterP
  Scenario: visit and prepare a donation
    Given I visited donation Portal site
    When  I should prepare a donation of money
    Then  I should using the payment method
    And   I fill out the form donation data
    And   I click receive a donation receipt
    Then  I fill information could be deducted from the tax
    Then  I click submit donation button

  @betterP
  Scenario: the test should be fail
    Given I visited the Portal site
    When  I choose transfer
    Then  I fill the donation data
    Then  I clicked submit donation button






