package Steps;

import Pages.Homepage;
import config.DataItems;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static CucumberTools.Hooks.getDriver;

public class HomepageSteps{
    public HomepageSteps() throws Exception {}
    Homepage hp = new Homepage(getDriver());


    @When("^he presses the login button$")
    public void pressLoginButton() throws InterruptedException {
        System.out.println("Pressing 'Login' button");
        hp.clickLoginButton();
    }

    @Then("^the page will be translated in \"([^\"]*)\"$")
    public void pageLanguage(String language) throws Exception {

        switch (language) {
            case "ENGLISH":
                Assert.assertTrue(getDriver().getCurrentUrl().contentEquals(DataItems.HOMEPAGE));
                Assert.assertTrue(hp.checkLoginLabelBasedOnLanguge(language));
                break;
            case "BRAZILIAN":
                Assert.assertTrue(getDriver().getCurrentUrl().contentEquals("https://br.pathofexile.com/game"));
                Assert.assertTrue(hp.checkLoginLabelBasedOnLanguge(language));
                break;
        }
    }



    @When("^he presses on the \"([^\"]*)\" language option$")
    public void pressLanguageOption(String languageOption) throws Throwable {
        hp.clickLanguageoption(languageOption);
    }

}



