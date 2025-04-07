package StepDef;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Util.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	@BeforeMethod
	public static void setUp() {
		HelperClass.setUpDriver();
}
//	@AfterMethod
//	public static void teardown(Scenario scenario) {
//		HelperClass.teardown();
//	}
}
