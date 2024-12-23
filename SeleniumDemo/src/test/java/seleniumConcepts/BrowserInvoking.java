package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrowserInvoking {
	WebDriver driver = null;

	@BeforeClass
	public void SetUp() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	@Test
	public void BasicTest() {
		System.out.println(driver.getTitle());

	}
	@AfterClass
	public void TearDown() {
		driver.quit();
	}

}
