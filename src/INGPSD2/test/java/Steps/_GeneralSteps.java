package Steps;

import config.DataItems;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static CucumberTools.Hooks.getDriver;

public class _GeneralSteps {

    public _GeneralSteps() throws Exception {}
    WebDriver driver = getDriver();


    @Given("^that user is on \"([^\"]*)\"$")
    public void redirectUserOnPage(String page) throws Throwable {
        switch (page){
            case "HOMEPAGE":
                CommonTasks.accessURL(DataItems.HOMEPAGE,"Homepage",driver);
                Assert.assertTrue(driver.getTitle().contentEquals("Path of Exile"));
                break;

            default:
                System.out.println("Page not specified");
        }

    }

    @Then("^he will be redirected to the \"([^\"]*)\" page$")
    public void isUserOnPage(String page) throws Throwable {
        switch (page){
            case "LOGIN":
                Assert.assertTrue(driver.getTitle().contentEquals("Path of Exile"));
                break;

            default:
                System.out.println("Incorrect page displayed");
        }
    }

}

