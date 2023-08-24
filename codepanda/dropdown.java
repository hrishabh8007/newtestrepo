package codepanda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	public static void main(String[]args) { 	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        driver.manage().window().maximize();

	WebElement drop=driver.findElement(By.cssSelector("[id=\"course\"]"));
	Select s=new Select(drop);
	s.selectByValue("net");
	
	WebElement multidrop=driver.findElement(By.xpath("//select[@id=\"ide\"]"));
        
        Select s1=new Select(multidrop);
        s1.selectByIndex(1);
        s1.selectByIndex(2);
        s1.selectByIndex(3);
        
        
        
        
        
}
}