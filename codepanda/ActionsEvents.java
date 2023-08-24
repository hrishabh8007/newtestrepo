package codepanda;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEvents { 
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement pmenu = driver.findElement(By.cssSelector("[id=\"product-menu-toggle\"]"));
		Actions a = new Actions(driver);
		a.moveToElement(pmenu).build().perform();
		WebElement livemenu = driver.findElement(By.cssSelector("[data-product=\"Live\"]"));
		livemenu.click();
		WebElement srch = driver.findElement(By.cssSelector(
				"[class=\"doc-search-menu dropdown-toggle doc-search-cta doc-search-menu-icon doc-menu-toggle\"]"));
		srch.click();
		WebElement srchinput = driver.findElement(By.cssSelector("[id=\"doc-search-box-input\"]"));
		srchinput.sendKeys("Test");
		a.sendKeys(Keys.ENTER).build().perform();

	}

}
