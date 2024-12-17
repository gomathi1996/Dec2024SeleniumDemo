package getting_started;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstScript {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		System.out.println(driver.getTitle());

		WebElement textBox = driver.findElement(By.id("my-text-id"));
		WebElement submitBtn = driver.findElement(By.className("btn-outline-primary"));

		textBox.sendKeys("Gomathi");
		submitBtn.click();

		WebElement message = driver.findElement(By.id("message"));
		String text = message.getText();
		System.out.println(text);
		assert (text).contains("Received!");
//		assertEquals(text,"Received!")

		driver.quit();

	}

}
