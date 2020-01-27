package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebLoginPage  {

    WebDriver driver;

    public WebLoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebLoginPage clickLogin() {
        driver.findElement(By.id("loginbutton")).click();
        return this;
    }

    public WebLoginPage fillINEmailPass(String email, String password) throws Exception {
        WebElement emailw = driver.findElement(By.id("email"));
        WebElement pass = driver.findElement(By.id("pass"));
        emailw.clear(); pass.clear();
        emailw.sendKeys("XXXX.WWWW@gmail.com");
        pass.sendKeys("WWWWW");
        return this;
    }


    public WebLoginPage logincheck(){
        driver.findElement(By.id("loginbutton")).click();
        return this;
    }




}
