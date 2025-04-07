
@tag
Feature: Title of your feature
  I want to use this template for my feature file

	
	@Register
	Scenario: Registering as New User
	Given The User is on the DemoWebShop Page "https://demowebshop.tricentis.com/register"
	When the user click on Resgister
	|ASDFG             |
	|QWERT             |
	|poiuytre@gmail.com|
	|qwaszx            |
	|qwaszx            |
	Then Click on Register 
	
	@Invalid
		Scenario: Registering as New User
	Given The User is on the DemoWebShop Page "https://demowebshop.tricentis.com"
  When The User click on the Login option and enters Username and Password
	When the user click on Resgister
	|ASDFG             |
	|QWERT             |
	|poiuytre          |
	|qwaszx            |
	|qwaszx            |
	Then Click on Register 

