package StepDef;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Actions.AccountActions;
import Actions.HomeActions;
import Actions.NewsAction;
import Util.HelperClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class DemoWebStep {

    AccountActions objAccount = new AccountActions();
    HomeActions objHome = new HomeActions();
    NewsAction objnews = new NewsAction();
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

    @When("user enter the valid email id to the newsletter")
    public void user_enter_the_valid_email_id_to_the_newsletter(io.cucumber.datatable.DataTable dataTable) {
    	List<List<String>> data1 = dataTable.asLists(String.class);
        String emailnews = data1.get(0).get(0);
        objnews.setemailnews(emailnews);
        objnews.clicksubscribe();

    }

    @Then("user should see the Thank you message")
    public void user_should_see_the_thank_you_message() {
    	String act="Thank you for signing up! A verification email has been sent. We appreciate your interest.";
    	System.out.println("act:"+act);
    	System.out.println("exp:"+objnews.getstringofnews());
    	String exp=objnews.getstringofnews();
    	Assert.assertEquals(act, exp);

    }

    @When("user enter the invalid email id to the newsletter")
    public void user_enter_the_invalid_email_id_to_the_newsletter(io.cucumber.datatable.DataTable dataTable) {
    	List<List<String>> data = dataTable.asLists(String.class);
        String emailnews = data.get(0).get(0);
        objnews.setemailnews(emailnews);
        objnews.clicksubscribe();

    }

    @Then("user should see the message as enter valid email")
    public void user_should_see_the_message_as_enter_valid_email() {
    	String act1="Thank you for signing up! A verification email has been sent. We appreciate your interest.";
    	
    	System.out.println("exp:"+objnews.getstringofnews()); 
    	String exp=objnews.getstringofnews(); 
    	Assert.assertNotEquals(exp, act1);

    }







}
