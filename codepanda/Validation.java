package codepanda;

import java.time.Duration; 

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation {
@Test
	public void validLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		username.sendKeys("problem_user");

		WebElement pwd = driver.findElement(By.xpath(" //input[@id=\"password\"]"));
		pwd.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		login.click();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("[class=\"title\"]")).isDisplayed());

	}

}
