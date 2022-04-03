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
#@tag
Feature: Add Customer Functionality

  Scenario: Add New Customer To MyBank
  
    Given Login as a Bank Manager
    When 	Click Add Customer Tab
    Then 	Enter the Customer Details
    And 	Click the Add Customer Icon

    #Examples: 
      #| FirstName | LastName | PostCode |
      #| Vicky     | James    | 600 033  |
      #| Vignesh   | Varun    | 600 018  |
