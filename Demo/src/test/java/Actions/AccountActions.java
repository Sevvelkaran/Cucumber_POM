package Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import Pages.AccountPage;
import Util.HelperClass;

public class AccountActions {

	
	AccountPage Account = null;
	String strFN,  strLN,  strEmail;
	
	public  AccountActions() {
	this.Account = new AccountPage();
	PageFactory.initElements(HelperClass.getDriver(), Account);
	}
	public void ClickAccount() {
		Account.ACC.click();
	}
	public void Radiobtn() {
		Account.Radio.click();
	}
	public void FirstName(String strFN) {
		Account.FN.sendKeys(strFN);
	}
	public void LastName(String strLN) {
		Account.LN.sendKeys(strLN);
	}
	public void Email(String strEmail) {
		Account.Email.sendKeys(strEmail);
	}
	public void Saveit() {
		Account.Save.click();
	}
	public void log() {
		Account.Logout.click();
	}
	public void AccountDetails() throws IOException {
		File file = new File("/Users/sevvelkaranpalanivetrivel/git/Demo/Demo/src/test/resources/testdata.properties");
		FileInputStream fileInput=null;
		try {
			fileInput=new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop1 = new Properties();
		try {
			prop1.load(fileInput);
			}catch(IOException e) {
				e.printStackTrace();
		}
		strFN = prop1.getProperty("FN");
		strLN = prop1.getProperty("LN");
		strEmail = prop1.getProperty("Email");
		this.FirstName(strFN);
		this.LastName(strLN);
		this.Email(strEmail);
		this.ClickAccount();
		this.Radiobtn();
		this.Saveit();
		this.log();
		

	}	

}
