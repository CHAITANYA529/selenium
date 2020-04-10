#Author: krishnachaitu.usapp@gmail.com
#Keywords Summary :
#Feature: Login Feature Verify if user is able to Login in to the site
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
Feature: Login Feature
  Verify if user is able to login into united.com homepage

  @tag1
  Scenario: validate Homepage Login
    Given User is on the united.com homepage
    And signin tray is open
    When user enters mpid
    And password
    And click on signin  button
    Then validate if user is able to login on to homepage or not
    And check more outcomes

  @tag2
  Scenario Outline: login
    Given user on homepage <user>
    When user enters <mpid> <password>
    And click on signin
    Then verify signin <status> in step

    Examples: 
      | User  | mpid     | password | status  |
      | name1 | cf343243 | ecomm123 | success |
