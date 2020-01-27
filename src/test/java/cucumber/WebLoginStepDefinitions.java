package cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.WebLoginPage;

import org.openqa.selenium.WebDriver;

public class WebLoginStepDefinitions  {

    private WebLoginPage webLoginPage = null;
    private  WebDriver driver;


    @Before
    public void beforeScenario() throws Exception {

        CreateDriver driverChrome = new CreateDriver() ;
        driver = driverChrome.createDriver();

        driver.get("http://facebook.com");
        webLoginPage = new WebLoginPage(driver);
    }

    @After
    public void afterScenario() {
        driver.quit();
    }

    @Given("^I am on the facebook.com Home Page$")
    public void iAmOnFBHomePage() {

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

}
