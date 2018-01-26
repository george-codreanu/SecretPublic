package CucumberTools;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/INGPSD2/main/resources/Homepage_TC.feature",format = {"pretty", "html:target/cucumber"})
@RunWith(Cucumber.class)
public class runnerCucumber { }