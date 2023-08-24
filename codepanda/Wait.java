package codepanda;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait {
public static void main(String[] args) {


	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
WebElement clickBtn=driver.findElement(By.cssSelector("button#promptBox"));



clickBtn.click();

	Alert a=driver.switchTo().alert();
		
	a.sendKeys("Automation");
	
	//explicit wait
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	wait.until( ExpectedConditions.alertIsPresent());
	a.accept();
	
	
	
	
	
	
	
	
	
	
	
}
}
