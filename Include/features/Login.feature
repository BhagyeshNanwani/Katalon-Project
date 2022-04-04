#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Checking Login Functionality

  @tag1
  Scenario Outline: Login using different credentials
    Given I am on Login Page
    When I Enter the <username>
    And I Enter my <password>
    Then I should be redirected to Home Page

    Examples: 
      | username  | password |
      | demouser |     testingisfun99 |
      | fav_user |     testingisfun99 |