package mypackage;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshotcode {

	public static void main(String[] args) throws IOException {

		takeScreenshot("Facebook_login_page");
		
	}
	
	public static void takeScreenshot(String filename) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file,new File("C:\\Users\\rohil\\eclipse-workspace\\PracticeProg\\src\\mypackage\\screenshots\\"+filename+".jpg"));
	}

}
