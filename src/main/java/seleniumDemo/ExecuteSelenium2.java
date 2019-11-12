package seleniumDemo;

import java.sql.Driver;
import java.util.zip.CheckedOutputStream;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import seleniumDemo.stepDemo;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import cucumber.api.java8.En;

import net.sourceforge.htmlunit.corejs.javascript.ast.KeywordLiteral;
import stepDefinitions.Checkout;

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
@SuppressWarnings("deprecation")
public class ExecuteSelenium2 {
//public class ExecuteSelenium {	
	private WebDriver driver = new ChromeDriver();
	private stepDemo stepdemo = new stepDemo();
	
    private static final String String = null;
    
public void BaseSteps() {
	//stepdemo = initElements(driver,stepDemo.class);
    Given("^I enter my blog address \"([^\"]*)\" and go to Home page$");
  
	When ("^Input searchbox keyword$", (String keyword) -> {
		stepdemo.send_keyword_into_searchbox(keyword);
		});
	And ("^I click search button$", () -> {
    	stepdemo.i_click_search_button();
    });
	Then("^The correct search result is returned$", () -> {
		stepdemo.the_correct_search_result_is_returned();
	});
	
	}
     
}