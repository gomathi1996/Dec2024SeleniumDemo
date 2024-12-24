package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumCode {

	WebDriver driver;
	String url ="https://www.selenium.dev/documentation/webdriver/troubleshooting/upgrade_to_selenium_4/";
	

	@BeforeClass
	public void setUp() {
		driver = new EdgeDriver();
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\gmanohar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver = new FirefoxDriver();
//		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	@Test
	public void actualTest() {
		String title = driver.getTitle();
//		System.out.println(title);
		Assert.assertEquals(title, "Upgrade to Selenium 4 | Selenium");
		Assert.assertEquals(driver.getCurrentUrl(), url);

	}

	@AfterClass
	public void tearDown() {
		driver.quit();

	}

}
