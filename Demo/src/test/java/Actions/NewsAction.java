package Actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.NewsPage;
import Util.HelperClass;
import Util.LogManagers;

import java.time.Duration;

public class NewsAction {
    NewsPage obj1;

    public NewsAction() {
        this.obj1 = new NewsPage();
        PageFactory.initElements(HelperClass.getDriver(), obj1);
    }

    public void setemailnews(String emailnews) {
        obj1.inputnews.sendKeys(emailnews);
    }

    public void clicksubscribe() {
        obj1.subscribe.click();
        LogManagers.logInfo("Clicked Subscribe");

    }

    public String getstringofnews() {
        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(obj1.textaftersubscribe));
        return obj1.textaftersubscribe.getText();
    }
}