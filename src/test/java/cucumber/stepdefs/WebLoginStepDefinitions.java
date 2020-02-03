package cucumber.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.CreateDriver;
import pageobjects.WebLoginPage;

import org.openqa.selenium.WebDriver;

public class WebLoginStepDefinitions  {

    private WebLoginPage webLoginPage ;
    private  WebDriver driver;




//    @Given("^I am on the facebook.com Home Page$")
//    public void iAmOnFBHomePage() {
//        CreateDriver driverChrome = new CreateDriver() ;
//        driver = driverChrome.createDriver();
//        driver.get("http://facebook.com");
//        webLoginPage = new WebLoginPage(driver);
//    }

    @Given("^I am on the facebook\\.com Home Page test$")
    public void i_am_on_the_facebook_com_Home_Page_test() {
        CreateDriver driverChrome = new CreateDriver() ;
        driver = driverChrome.createDriver();
        driver.get("http://facebook.com");
        webLoginPage = new WebLoginPage(driver);
        // Write code here that turns the p
        // hrase above into concrete actions

    }

    @When("^I fill in Email \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void iFillEmailPass(String email, String pass)  {
        try {
            webLoginPage.fillINEmailPass(email, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("^I click login$")
    public void clickLogin(){

        webLoginPage.clickLogin();
    }

    @Then("^I am on main page$")
    public void logincheck() {
        webLoginPage.logincheck();
    }


    @Given("I am on the facebook Home Page one")
    public void iAmOnTheFacebookHomePageOne() {

    }
}
