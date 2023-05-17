
Feature: emailafriend

  @email
  Scenario: As a user, I should able to login successfully
  So that, I can use email a friend user features

    Given I am on login page
    When I enter required login details
    And I select the apple macbook product
    Then I click on the email a friend button
    And I should able to email a friend successfully