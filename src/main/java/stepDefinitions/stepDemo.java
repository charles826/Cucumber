package stepDefinitions;
import java.sql.Driver;
import java.util.zip.CheckedOutputStream;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinitions.*;
import stepDefinitions.StartDriver;

/**
 * Feature: Search "cucumber" keyword

  @tag1
  Scenario: Title of your scenario
    Given open browser "https://www.baidu.com"

    When Input "Cucumber" keyword
    And click the second lick
    Then I validate the outcomes
 * @throws InterruptedException
 */
public class stepDemo {
	WebDriver driver;
	StartDriver start;
    //private static final String String = null;
	
	@Given("^open browser baidu page$")
    public void open_browser_baidu_page() throws Exception {
		
		start.openBrowser();
        //throw new PendingException();
	}
	
   @When ("^Input searchbox keyword$")
    public void send_keyword_into_searchbox(String Cucumber) throws Exception{
    	WebElement searchBox;
    	searchBox = driver.findElement(By.id("kw"));
        searchBox.sendKeys("Cucumber");
        //throw new PendingException();
        }
    
   @And ("^I click search button$")
    public void i_click_search_button() throws Exception{
    	WebElement searchButton;
    	searchButton =driver.findElement(By.id("su"));
    	searchButton.click();
    	//throw new PendingException();
    }
    @Then("^The correct search result is returned$")
    public void the_correct_search_result_is_returned() throws Exception {
        WebElement searchResult;
        searchResult = driver.findElement(By.xpath(".//*[@id='container']/div[2]/div/div[2]/span"));
        Assert.assertTrue(searchResult.isDisplayed());
        
        Thread.sleep(2000);
        driver.quit();
        //throw new PendingException();
}}