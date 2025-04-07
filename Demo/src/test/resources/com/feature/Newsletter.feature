Feature: Pass the Email id for NewsLetter to get regular updates

Background:
	Given The User is on the DemoWebShop Page "https://demowebshop.tricentis.com/login"



	@Newslettervalid
	Scenario: To pass the valid email to the newsletter 
	When user enter the valid email id to the newsletter
	|abc@gmail.com  |
	Then user should see the Thank you message
	
	
	@NewsletterInvalid
	Scenario: To pass the invalid email to the newsletter
	When user enter the invalid email id to the newsletter
	|abc    |
	Then user should see the message as enter valid email