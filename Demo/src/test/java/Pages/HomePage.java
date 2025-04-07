package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	
	@FindBy(xpath="//input[@name=\"Email\"]")
	public static WebElement Username;
	
	@FindBy(xpath="//input[@name=\"Password\"]")
	public static WebElement Password;
	
	@FindBy(xpath="//input[@class=\"button-1 login-button\"]")
	public WebElement Login;
	
	
}
