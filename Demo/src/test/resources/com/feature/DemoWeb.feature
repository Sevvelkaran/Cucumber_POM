@tag
Feature: DemoWebShop
  I want to access My Accounts and change customer info

  @Login
  Scenario: Valid Login
    Given The User is on the DemoWebShop Page "https://demowebshop.tricentis.com/login"
    When The User click on the Login option and enters Username and Password
    Then Check is the user on Login page


