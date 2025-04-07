package Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import Pages.HomePage;
import Util.HelperClass;

public class HomeActions {

	HomePage Homepage = null;
	String strUsername, strPassword;
	
	public HomeActions() {
		this.Homepage = new HomePage();
		PageFactory.initElements(HelperClass.getDriver(), Homepage);
	}
	public void setUsername(String strUserName) {
		Homepage.Username.sendKeys(strUserName);
	}
	public void setPassword(String strPassword) {
		Homepage.Password.sendKeys(strPassword);
	}
	
	public void login() {
		Homepage.Login.click();
	}
	
	public void logindetails() throws IOException {
		File file = new File("/Users/sevvelkaranpalanivetrivel/Desktop/Seleniumjava/Demo/src/test/resources/testdata.properties");
		FileInputStream fileInput=null;
		try {
			fileInput=new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		strUsername = prop.getProperty("Username");
		strPassword = prop.getProperty("Password");
		this.setUsername(strUsername);
		this.setPassword(strPassword);
		this.login();
	}
	
	
}
