package Pages;

import org.openqa.selenium.WebDriver;
import static CucumberTools.Hooks.getDriver;

abstract class _GeneralPage {

    protected _GeneralPage() throws Exception {    }
    protected WebDriver webDriver = getDriver();

}
