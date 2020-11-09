package brokenLinks;
//updated
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//This is to identify the broken links in the application
public class FindingBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> discountCouponsLinks = driver
				.findElements(By.cssSelector("table[class='gf-t'] td:nth-child(2) ul li a"));
		Set<String> brokenLinks = new HashSet<String>();
		for (WebElement links : discountCouponsLinks) {
			String linkName = links.getAttribute("href");
			System.out.println(linkName);

			URL url = new URL(linkName);
			URLConnection InitializeConn = url.openConnection();
			HttpURLConnection httpurlconn = (HttpURLConnection) InitializeConn;
			httpurlconn.setConnectTimeout(3000);
			httpurlconn.connect();
			if (httpurlconn.getResponseCode() > 400) {
				brokenLinks.add(linkName);
			}
			httpurlconn.disconnect();
		}
		for (String brokenLink : brokenLinks) {
			System.err.println(brokenLink);
		}
	}

}
