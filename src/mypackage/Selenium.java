package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		
 WebDriver driver = new ChromeDriver();

 driver.get("https://opensource-demo.orangehrmlive.com/");
 driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		submit.click();
		
	}

}
