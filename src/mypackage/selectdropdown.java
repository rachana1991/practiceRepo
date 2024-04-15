package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		Select day = new Select(driver.findElement(By.id("day")));
		Select month = new Select(driver.findElement(By.id("month")));
		Select year = new Select(driver.findElement(By.id("year")));
		
		day.selectByVisibleText("19");
		month.selectByVisibleText("Jan");
		year.selectByVisibleText("1991");
		
		List<WebElement> daylist = day.getOptions();
		System.out.println(daylist.size());
		
		for(int i=0; i<daylist.size(); i++)
		{
		System.out.println(daylist.get(i).getText());
		
		}
	}

}
