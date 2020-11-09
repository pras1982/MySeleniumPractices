package campus;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksinCampus {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://campus.ecgroup.in/Auth/Login");
		driver.findElement(By.cssSelector("input[id='UserId']")).sendKeys("11322");
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("sairam123");
		driver.findElement(By.cssSelector("input[value^='Sign']")).click();
		// List<WebElement> Links = driver.findElements(By.tagName("a"));
		// WebElement NavLink = driver.findElement(By.cssSelector(".login-info+nav"));
		WebElement NavLink = driver.findElement(By.cssSelector("a[href*='java']+ul"));
		List<WebElement> Links = NavLink.findElements(By.tagName("a"));
		Set<String> brokenLinks = new HashSet<String>();
		for (WebElement Link : Links) {
			String LinkURL = Link.getAttribute("href");
			//System.out.println(LinkURL);

			URL url = new URL(LinkURL);
			URLConnection OpeningtheConn = url.openConnection();
			HttpURLConnection InitializehttpConn = (HttpURLConnection) OpeningtheConn;
			InitializehttpConn.setConnectTimeout(3000);
			InitializehttpConn.connect();
			if (InitializehttpConn.getResponseCode() < 400) {
				brokenLinks.add(LinkURL);
			}
			InitializehttpConn.disconnect();

		}
		for (String brokenLink : brokenLinks) {
			System.out.println(brokenLink);
		}
	}

}
