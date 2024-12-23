package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumCode {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/documentation/webdriver/troubleshooting/upgrade_to_selenium_4/");
		
	}
	
	@Test
	public void actualTest() {
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}

}
