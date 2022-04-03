package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinition"},
monochrome=true,
plugin={"pretty",
		"junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HTML/HTMLReports.html"})
//tags="@SanityTest")
public class TestRunner {

}





