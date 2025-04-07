package Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.LogManager;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import Pages.AccountPage;
import Util.Excel;
import Util.HelperClass;
import Util.LogManagers;

public class AccountActions {

    AccountPage Account = null;
    String strFN, strLN, strEmail;

    public AccountActions() {
        this.Account = new AccountPage();
        PageFactory.initElements(HelperClass.getDriver(), Account);
    }

    public void ClickAccount() {
        Account.ACC.click();
        LogManagers.logInfo("Clicked Account");
    }

    public void Radiobtn() {
        Account.Radio.click();
        LogManagers.logInfo("Clicked Radio Button");

    }
    public void FirstName(String strFN) {
        Account.FN.clear();
        Account.FN.sendKeys(strFN);
        LogManagers.logInfo("Entred FirstName");

    }

    public void LastName(String strLN) {
        Account.LN.clear();
        Account.LN.sendKeys(strLN);
        LogManagers.logInfo("Entred LastName");

    }

    public void Email(String strEmail) {
        Account.Email.clear();
        Account.Email.sendKeys(strEmail);
    }

    public void Saveit() {
        Account.Save.click();
        LogManagers.logInfo("Clicked Save");

    }

    public void log() {
        Account.Logout.click();
        LogManagers.logInfo("Clicked Logout");

    }
    public void AccountDetails() throws IOException {
        Excel excelUtil = new Excel();
        String[][] data = excelUtil.getExcelData("src/test/resources/TestData.xlsx", "Sheet1");

        
        strFN = data[1][0]; 
        strLN = data[1][1]; 
        strEmail = data[1][2]; 

        this.FirstName(strFN);
        this.LastName(strLN);
        this.Email(strEmail);
        this.ClickAccount();
        this.Radiobtn();
        this.Saveit();
        this.log();
    }
}
