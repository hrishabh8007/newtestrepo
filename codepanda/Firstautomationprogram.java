package codepanda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstautomationprogram {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		username.sendKeys("problem_user");

		WebElement pwd = driver.findElement(By.xpath(" //input[@id=\"password\"]"));
		pwd.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		login.click();

	}

}
