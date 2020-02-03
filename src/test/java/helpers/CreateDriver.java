package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateDriver {

    public WebDriver createDriver(){
        // Chrome options to disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        // init Chrome driver
        WebDriver driverChrome = new ChromeDriver(options);
        return driverChrome;

    }


}
