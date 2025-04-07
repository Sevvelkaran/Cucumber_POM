package StepDef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Actions.AccountActions;
import Actions.HomeActions;
import Actions.RegisterActions;
import Pages.RegisterPage;
import Util.HelperClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class DemoWebStep {

    AccountActions objAccount = new AccountActions();
    HomeActions objHome = new HomeActions();
    RegisterActions objReg = new RegisterActions();
    RegisterPage objPage = new RegisterPage();
    WebDriver driver;

    @Before
    public void setUp() {
        HelperClass.setUpDriver();
        driver = HelperClass.getDriver();
        objHome = new HomeActions(); // Correctly injects driver
        // Do the same for others
    }

    @Given("The User is on the DemoWebShop Page {string}")
    public void the_user_is_on_the_demo_web_shop_page(String url) {
        HelperClass.openPage(url);
    }

    @When("The User click on the Login option and enters Username and Password")
    public void the_user_click_on_the_login_option_and_enters_username_and_password() throws IOException {
        objHome.logindetails(); // Handles valid login
    }

    @Then("Check is the user on Login page")
    public void check_is_the_user_on_login_page() {
        boolean isLoggedIn = driver.findElements(By.linkText("Log out")).size() > 0;
        Assert.assertTrue(isLoggedIn, "User login failed or 'Log out' link not found.");
    }

    @When("The user clicks on MyAccounts")
    public void the_user_clicks_on_my_accounts() throws IOException {
        objAccount.ClickAccount();
    }

    @When("it opens the Customer enters the details and saves it")
    public void it_opens_the_customer_enters_the_details_and_saves_it() throws IOException, InterruptedException {
        objAccount.AccountDetails();
        Thread.sleep(4000); // Consider replacing with explicit wait if needed
    }

    @Then("Click on logout")
    public void click_on_logout() {
        objAccount.log();
    }

    // --- Outline Step Definitions ---




}
