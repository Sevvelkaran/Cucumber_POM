package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    plugin = {
        "pretty",
        "json:target/cucumber-reports/Cucumber.json",
        "html:target/cucumber-reports/Cucumber.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "rerun:target/failedrerun.txt"
    },
    features = {
        "src/test/resources/com/feature/DemoWeb.feature",
        "src/test/resources/com/feature/Navigation.feature",
        "src/test/resources/com/feature/Register.feature"
    },
    glue = "StepDef"
)
public class Runner extends AbstractTestNGCucumberTests {
}
