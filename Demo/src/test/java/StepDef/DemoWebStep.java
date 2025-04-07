package StepDef;

import java.io.IOException;
import java.util.List;

import Actions.AccountActions;
import Actions.HomeActions;
import Actions.RegisterActions;
import Pages.RegisterPage;
import Util.HelperClass;
import io.cucumber.java.en.*;

public class DemoWebStep {
AccountActions objAccount =  new AccountActions();
HomeActions objHome = new HomeActions();
RegisterActions objReg = new RegisterActions(); 
RegisterPage objPage = new RegisterPage();


@Given("The User is on the DemoWebShop Page {string}")
public void the_user_is_on_the_demo_web_shop_page(String string) {
    HelperClass.openPage(string);

}

@When("The User click on the Login option and enters Username and Password")
public void the_user_click_on_the_login_option_and_enters_username_and_password() throws IOException {
objHome.logindetails();
}

@Then("Check is the user on Login page")
public void check_is_the_user_on_login_page() {

}

@When("The User click on the Login option and enters Username as asdfg and Password as qweqwe")
public void the_user_click_on_the_login_option_and_enters_username_as_asdfg_and_password_as_qweqwe() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


@When("The user clicks on MyAccounts")
public void the_user_clicks_on_my_accounts() throws IOException {
objAccount.ClickAccount();
}



@When("it opens the Customer enters the details and saves it")
public void it_opens_the_customer_enters_the_details_and_saves_it() throws IOException, InterruptedException {
objAccount.AccountDetails();
Thread.sleep(4000);
//objAccount.Saveit();
}

@Then("Click on logout")
public void click_on_logout() {
objAccount.log();
}

@When("the user click on Resgister")
public void the_user_click_on_resgister(io.cucumber.datatable.DataTable dataTable) {

	objPage.Register.click();
	
	 List<List<String>> Register=dataTable.asLists(String.class);
	 String FN = Register.get(0).get(0);
	 objPage.FN1.sendKeys(FN);
	 
	 String LN =  Register.get(1).get(0);
	 objPage.LN1.sendKeys(LN);
	 
	 String M = Register.get(2).get(0);
	 objPage.Email1.sendKeys(M);
	 
	 String Pas =  Register.get(3).get(0);
	 objPage.Pass.sendKeys(Pas);
	 
	 String confirm = Register.get(4).get(0);
	 objPage.ConfirmPass.sendKeys(confirm);
	 
	 objReg.registerbtn();
}

@Then("Click on Register")
public void click_on_register() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}






}
