package Actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import Pages.HomePage;

public class HomeActions {

    private HomePage homepage;
    private String strUsername, strPassword;

    public HomeActions() {
        this.homepage = new HomePage();
    }

    public void setUsername(String strUserName) {
        homepage.username.sendKeys(strUserName);
    }

    public void setPassword(String strPassword) {
        homepage.password.sendKeys(strPassword);
    }

    public void login() {
        homepage.Login.click();
    }

    public void logindetails() throws IOException {
        FileInputStream fis = new FileInputStream("src/test/resources/testdata.properties");
        Properties prop = new Properties();
        prop.load(fis);
        fis.close();

        strUsername = prop.getProperty("Username");
        strPassword = prop.getProperty("Password");

        setUsername(strUsername);
        setPassword(strPassword);
        login();
    }
}
