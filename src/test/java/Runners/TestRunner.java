package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
(
		
		features = {"C:\\Users\\GunsanjamKaur\\eclipse-workspace\\com.DataTableinbdd.HRM\\src\\test\\java\\FeatureFile\\Login.feature"},
		glue = {"StepDefinition"},
		//dryRun=true,
		monochrome=true,
		tags = {"@SmokeTest"},
		//strict=true,
		plugin= {"pretty","json:Reports/Cucumber.json",
				"junit:Reports/XMLReports.xml",
				"html:Reports/cucumberReport"
				}
		
)
public class TestRunner 
{

}
