package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

	@FindBy(xpath="//a[@class=\"ico-register\"]")
	public WebElement Register;
	
	@FindBy(xpath="//input[@name=\"FirstName\"]")
	public WebElement FN1;
	
	@FindBy(xpath="//input[@name=\"LastName\"]")
	public WebElement LN1;
	
	@FindBy(xpath="//input[@name=\"Email\"]")
	public WebElement Email1;
	
	@FindBy(xpath="//input[@name=\"Password\"]")
	public WebElement Pass;
	
	@FindBy(xpath="//input[@name=\"ConfirmPassword\"]")
	public WebElement ConfirmPass;
	
	@FindBy(xpath="//input[@name=\"register-button\"]")
	public WebElement Registerbtn;
	
}
