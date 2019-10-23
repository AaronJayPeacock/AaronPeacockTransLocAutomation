package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

/*
class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}

 */

public class Stepdefs {
    private String today = "Friday";
    private String actualTitle = "";
    WebDriver myFireFoxDriver;

    @Given("I am on the Architect Stage TransLoc login page")
    public void I_am_on_Login_page() {
        System.out.println("Hey its working!");


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\aaron\\OneDrive\\Documents\\Work\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        myFireFoxDriver = new FirefoxDriver();
        myFireFoxDriver.get("https://login.stage.transloc.com/login/?next=https://architect.stage.transloc.com/");
    }

    @When("I enter qa_user_02 into the username text box")
    public void I_enter_username() {
        WebElement usernameTextBoxElement = myFireFoxDriver.findElement(By.id("username"));
        usernameTextBoxElement.click();
        usernameTextBoxElement.sendKeys("qa_user_02");
    }

    @When("I enter XMp$g7qc6Q6p5r!Rm5 into the password text box")
    public void I_enter_password() {
        WebElement usernameTextBoxElement = myFireFoxDriver.findElement(By.id("password"));
        usernameTextBoxElement.click();
        usernameTextBoxElement.sendKeys("XMp$g7qc6Q6p5r!Rm5");
    }

    @When("I click on the Log in button")
    public void I_click_login_button() {

        WebElement usernameTextBoxElement = myFireFoxDriver.findElement(By.xpath("//input[@value='Log in']"));
        usernameTextBoxElement.click();

    }


    @Then("I will successfully log in to the Architect Feeds page")
    public void I_should_enter_Architect() {

        String actualTitle = myFireFoxDriver.getTitle();
        System.out.println("Title: " + actualTitle);

        Assert.assertEquals("Architect", actualTitle);
    }
}
