package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingtoWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
				WebDriver	driver	=	new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				WebElement	DiscountFooterLinks	=	driver.findElement(By.xpath("//div[@id='gf-BIG']//ul"));
				String openinNewTab	=	Keys.chord(Keys.CONTROL,Keys.ENTER);
				List<WebElement> ClickOnLinks = DiscountFooterLinks.findElements(By.tagName("a"));
				for(WebElement ClickLinks:	ClickOnLinks ) {
					ClickLinks.sendKeys(openinNewTab);
				}

	}

}
