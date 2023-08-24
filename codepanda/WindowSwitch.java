package codepanda;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitch {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		// to switch child window
		String parentID = driver.getWindowHandle();
		System.out.println("parentID");
		WebElement Btn = driver.findElement(By.cssSelector("button#newTabBtn"));
		Btn.click();
		Set<String> allWindows = driver.getWindowHandles();

		for (String s : allWindows) {
			if (!parentID.equals(s)) {
				driver.switchTo().window(s);

			}
		}
		/*
		 * //to switch parent window
		 * 
		 * driver.switchTo().window(parentID); WebElement
		 * inputBox=driver.findElement(By.cssSelector("input#name"));
		 * inputBox.sendKeys("TESTAUTOMATION"); driver.quit();
		 */

	}

}
