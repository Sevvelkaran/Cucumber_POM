package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Util.HelperClass;

public class HomePage {

    @FindBy(id = "Email")
    public WebElement username;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Log in']")
    public WebElement Login;

    public HomePage() {
        PageFactory.initElements(HelperClass.getDriver(), this);
    }
}
