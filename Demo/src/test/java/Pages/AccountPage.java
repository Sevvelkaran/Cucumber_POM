package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage {

	
	@FindBy(xpath="//a[@class=\"account\"]")
	public WebElement ACC;
	
	@FindBy(xpath="//input[@id=\"gender-male\"]")
	public WebElement Radio;
	
	@FindBy(xpath="//input[@name=\"FirstName\"]")
	public WebElement FN;
	
	@FindBy(xpath="//input[@name=\"LastName\"]")
	public WebElement LN;
	
	@FindBy(xpath="//input[@name=\"Email\"]")
	public WebElement Email;
	
	@FindBy(xpath="//input[@value=\"Save\"]")
	public WebElement Save;
	
	@FindBy(xpath="//a[@class=\"ico-logout\"]")
	public WebElement Logout;
}
