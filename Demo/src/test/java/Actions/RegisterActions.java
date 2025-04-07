package Actions;

import java.awt.print.PageFormat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import Pages.RegisterPage;
import Util.HelperClass;

public class RegisterActions {

	RegisterPage register;
	String strFN1, strLN1, strEmail1, strPass, strConfirmPass;
	
	public void RegisterActions() {
		this.register = new RegisterPage();
		PageFactory.initElements(HelperClass.getDriver(), register);
	}
	public void Reg() {
		register.Register.click();
	}
	public void FirstN(String strFN1) {
		register.FN1.sendKeys(strFN1);
	}
	public void LastN(String strLN1) {
		register.LN1.sendKeys(strLN1);
	}
	public void mail1(String strEmail1) {
		register.Email1.sendKeys(strEmail1);
	}
	public void Password(String strPass) {
		register.Pass.sendKeys(strPass);
	}
	public void Confirm(String strConfirmPass) {
		register.ConfirmPass.sendKeys(strConfirmPass);
	}
	public void registerbtn() {
		register.Registerbtn.click();
	}
	public void RegisterDetails() throws IOException {
		File file = new File("/Users/sevvelkaranpalanivetrivel/Desktop/Seleniumjava/Demo/src/test/resources/testdata.properties");
		FileInputStream fileInput=null;
		try {
			fileInput=new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop2 = new Properties();
		try {
			prop2.load(fileInput);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		strFN1 = prop2.getProperty("FirstName");
		strLN1 = prop2.getProperty("LastName");
		strEmail1 = prop2.getProperty("Email1");
		strPass = prop2.getProperty("Pass");
		strConfirmPass = prop2.getProperty("ConfirmPass");
		this.Reg();
		this.FirstN(strFN1);
		this.LastN(strLN1);
		this.mail1(strEmail1);
		this.Password(strPass);
		this.Confirm(strConfirmPass);
		this.registerbtn();
		

}
}
