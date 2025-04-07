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
Feature: DemoWorkShop
  I want To Access to Muy Accounts and change the customer info


    
  @Login
  Scenario: Login 
    Given The User is on the DemoWebShop Page "https://demowebshop.tricentis.com/login"
  	When The User click on the Login option and enters Username and Password
    Then Check is the user on Login page
    

  @Invalid
  Scenario Outline: Login 
    Given The User is on the DemoWebShop Page "https://demowebshop.tricentis.com/login"
  	When The User click on the Login option and enters Username as <Username> and Password as <Password>
    Then Check is the user on Login page
	
	Examples:
	
	|Username|Password|
	|asdfg   |qweqwe  |
	
	
	
	
	
