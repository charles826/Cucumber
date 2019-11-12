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
import stepDefinitions.*;

public class StartDriver {
	WebDriver driver;
    private static final String String = null;
    
 public void openBrowser() {
	driver =new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	driver.get("https://www.baidu.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
}
    
    
    
StartDriver start =new StartDriver();

}
