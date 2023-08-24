package codepanda;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trialprogramhahaha {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.newlook.com/row/register");
driver.manage().window().maximize();
	
	WebElement email=driver.findElement(By.xpath("//input[@id=\"email\"]"));
	email.sendKeys("rishabh8007@gmail.com");
	
	WebElement pwd=driver.findElement(By.xpath("//input[@id=\"pwd\"]"));
	pwd.sendKeys("Rishabh1234");
	
	WebElement fname=driver.findElement(By.xpath("//input[@id=\"firstName\"]"));	
	fname.sendKeys("RISHABH");
	
	WebElement lname=driver.findElement(By.xpath("//input[@id=\"lastName\"]"));
	lname.sendKeys("SHUKLA");
	
	//WebElement dropdown=driver.findElement(By.xpath("//select[@id=\"titleCode\"]"));
	
	//js click
	WebElement checkbox=driver.findElement(By.cssSelector("//input[@data-ng-blur=\"registerForm['ageConfirmation'].displayMessage = true; clearError('ageConfirmation', 'backend');\"]"));
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", checkbox);
	
	WebElement logb=driver.findElement(By.xpath("//button[@class=\'button button--primary button--full-width button-green button--mouse-up\']"));
	
	logb.click();
	
	
	
	
	
	
	
}	
}
