package mypackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		List<WebElement> linkslist = driver.findElements(By.tagName("a"));

		linkslist.addAll(driver.findElements(By.tagName("img")));

		List<WebElement> activelinks = new ArrayList<WebElement>();

		for (int i = 0; i < linkslist.size(); i++) {

			if (linkslist.get(i).getAttribute("href") != null
					&& (!linkslist.get(i).getAttribute("href").contains("javascript"))) {
				activelinks.add(linkslist.get(i));
			}
		}

		System.out.println("The number of active links found are = " + activelinks.size());

		for (int j = 0; j < activelinks.size(); j++) {

			HttpURLConnection con = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href"))
					.openConnection();
			con.connect();
			String response = con.getResponseMessage();
			int responsecode = con.getResponseCode();
			con.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href") + " ---- :" + response);
			if(responsecode >=400)
			{
				System.out.println(activelinks.get(j).getAttribute("href") + " ---- :" + ""
						+ "is a broken link");
			}
		}
	}

}
