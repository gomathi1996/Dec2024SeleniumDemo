package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropdownDemo {
	public WebDriver driver = null;

	@BeforeTest
	public void setUp() {
		driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	}

	@Test
	public void staticDropdown() throws InterruptedException {
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		Thread.sleep(1000);
//		WebElement fromDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
//		Select selFrom = new Select(fromDropdown);
//		selFrom.selectByIndex(1);
//		System.out.println(selFrom.getFirstSelectedOption().getText());
		
		WebElement Currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select selCurrency = new Select(Currency);
//		selCurrency.selectByIndex(2);
//		System.out.println(selCurrency.getFirstSelectedOption().getText());
		selCurrency.selectByValue("AED");
		System.out.println(selCurrency.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("divpaxinfo")).click();
		int flag = 1;
		while(flag>5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			flag++;
		}
		Thread.sleep(1000);
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
