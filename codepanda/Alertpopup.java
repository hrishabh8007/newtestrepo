package codepanda;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertpopup {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
	WebElement clickBtn=driver.findElement(By.cssSelector("button#promptBox"));
	clickBtn.click();
	
		Alert a=driver.switchTo().alert();
			
		a.sendKeys("Automation");
		a.accept();
			
		// 	for cancel
	//	a.dismiss();  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
