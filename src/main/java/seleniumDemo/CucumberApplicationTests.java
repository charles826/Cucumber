package seleniumDemo;
import org.testng.annotations.Test;


import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.PageFactory.initElements;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = CucumberApplication.class)

public class CucumberApplicationTests {
	//FirefoxDriver driver = new FirefoxDriver();
	ChromeDriver driver = new ChromeDriver();
	BlogPage blogPage = initElements(driver, BlogPage.class);
	String blogUrl = "http://yaowenjie.github.io";

	// This is actually Selenium Test
	@Test
	public void search_function_should_work_well() {
		driver.get(blogUrl);

		blogPage.clickSearchButton();
		blogPage.inputSearchWording("PowerShell");
		blogPage.clickFirstResultOfSearch();
	}

}
