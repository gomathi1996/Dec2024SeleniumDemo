package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocatorsDemo2 {
	
	public WebDriver driver = null;
	public String loginText = "Login";
	public String QAMeetupNotification = "QA Meetup with Rahul Shetty @Bangalore - Limited Seats! Book Now!";
	
	@BeforeTest
	public void setUp() {
		driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
	}
	
	@Test
	public void siblingsToChild() {
		String actualText = driver.findElement(By.xpath("//div/a/following-sibling::button[2]")).getText();
		Assert.assertTrue(actualText.contentEquals(loginText));
		
	}
	
	@Test
	public void ChildToParentAndthenToSibling() {
		String actualText = driver.findElement(By.xpath("//button[text()='Login']/parent::div/preceding-sibling::a[@class='blinkingText']")).getText();
		Assert.assertTrue(actualText.contentEquals(QAMeetupNotification));
		
	}
	
	@Test
	public void browserNavigation() {
		driver.manage().window().maximize();

		driver.get("http://google.com");

		driver.navigate().to("https://rahulshettyacademy.com");

		driver.navigate().back();

		driver.navigate().forward();		
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
