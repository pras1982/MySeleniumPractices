package shoppinge2e;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyBrokenImage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/broken_images");
		for (WebElement image : driver.findElements(By.cssSelector("img"))) {
			isImageBroken(image);
			
		}
		

	}

	public static void isImageBroken(WebElement image) {
		if (image.getAttribute("naturalWidth").equals("0")) {
			System.out.println(image.getAttribute("outerHTML") + " is broken.");
		}
		System.out.println(image.getAttribute("naturalWidth"));
	}

}
