package Util;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {
    private static HelperClass helperClassInstance;
    private static WebDriver driver;
    private static WebDriverWait wait;
    public final static int TIMEOUT = 10;

    private HelperClass() {
  

        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
        if (helperClassInstance == null) {
            synchronized (HelperClass.class) {  // ✅ Synchronized for thread safety
                if (helperClassInstance == null) {
                    helperClassInstance = new HelperClass();
                }
            }
        }
    }

//    public static void teardown() {
//        if (driver != null) {
//            //driver.quit();  // ✅ Avoid using driver.close()
//            driver = null;
//        }
//        helperClassInstance = null;
//    }
}
