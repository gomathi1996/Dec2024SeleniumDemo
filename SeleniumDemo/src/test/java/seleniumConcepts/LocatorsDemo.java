package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LocatorsDemo {
	
	public WebDriver driver;
	String resetPwd = null;
	String userName = "Gomathi";
	
	@BeforeMethod
	public void setUp() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	}
	
	@Test(priority = 0)
	public void incorrectLogIn() {
		
		driver.findElement(By.id("inputUsername")).sendKeys(userName);
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
		driver.findElement(By.xpath("//label[@for='chkboxTwo']/preceding-sibling::input")).click();
		driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();
		String errMsg = driver.findElement(By.cssSelector(".error")).getText();
		Assert.assertTrue(errMsg.contains("Incorrect username or password"), "Error Message appeared as expected");
	}
	
	@Test(priority = 1)
	public void resetPassword() throws InterruptedException {
		driver.findElement(By.cssSelector(".forgot-pwd-container")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9382648640");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String tempPassword = driver.findElement(By.cssSelector(".infoMsg")).getText();
		String[] splitted = tempPassword.split("'");
		resetPwd = splitted[1];
	}
	
	@Test(priority = 2)
	public void correctLogin() throws InterruptedException {	
		driver.findElement(By.id("inputUsername")).sendKeys(userName);
		driver.findElement(By.name("inputPassword")).sendKeys(resetPwd);
		driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
		driver.findElement(By.xpath("//label[@for='chkboxTwo']/preceding-sibling::input")).click();
		driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();
		Thread.sleep(1000);
		String welcomeMesg = driver.findElement(By.cssSelector(".login-container>h2")).getText();
		String loginMesg = driver.findElement(By.cssSelector(".login-container>p")).getText();
		Assert.assertTrue(welcomeMesg.contains(userName), "Not LoggedIn with username : "+userName);
		Assert.assertEquals(loginMesg, "You are successfully logged in.");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
