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
@login
Feature: User Login Test
  Login with scenario outline

  @tag1
  Scenario Outline: Login with the scenario outline
    Given I navigate to login page
    When I login with email address "<email>" and password "<password>"
    Then I should arrive at the My Account page

    Examples: 
      | email  								| password			|
      | jamesbond@test.com 		| Password007		|
      | petejenkins@test.com 	| Password1234	|