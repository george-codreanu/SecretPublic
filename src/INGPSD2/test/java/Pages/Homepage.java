package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends _GeneralPage{

    public Homepage(WebDriver passedDriver) throws Exception {
        this.webDriver = passedDriver;
        PageFactory.initElements(passedDriver, this);
    }

    @FindBy(css="div.loggedOut > a:first-child")
    private WebElement loginButton;

    @FindBy(css = "span.br-lang > img")
    private WebElement brazilianLang;



    public void clickLoginButton() {
        loginButton.click();
    }

    public boolean checkLoginLabelBasedOnLanguge(String language){

        switch (language){
            case "ENGLISH":
                return loginButton.getText().contentEquals("LOG IN");
            case "BRAZILIAN":
                return loginButton.getText().contentEquals("CONECTAR");
        }
        return false;
    }

    public void clickLanguageoption(String languageOption){
        switch (languageOption){
            case "BRAZILIAN":
                System.out.println("Pressing Brazilian option: ");
                brazilianLang.click();
                break;
        }
    }
}
