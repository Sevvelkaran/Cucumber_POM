package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage {
	
	@FindBy(xpath="//input[@name=\"NewsletterEmail\"]")
	public WebElement inputnews;
	
	@FindBy(xpath="//input[@id=\"newsletter-subscribe-button\"]")
	public WebElement subscribe;
	
	@FindBy(id="newsletter-result-block")
	public WebElement textaftersubscribe;
	

}