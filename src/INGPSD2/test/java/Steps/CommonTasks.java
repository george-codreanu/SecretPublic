package Steps;


import org.openqa.selenium.WebDriver;

public class CommonTasks {

    public String getAttributeValue(String element, String elementName){
        return null;
    }

    public static String getTitle(WebDriver webDriver){
        return webDriver.getTitle();
    }

    public static void accessURL(String url, String pageName, WebDriver driver){
        System.out.println("Accessing: " + pageName);
        driver.get(url);
    }
}
