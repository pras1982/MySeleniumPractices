package handlingMultipleWindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMultpleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions	act	=	new Actions(driver);
		driver.get("https://accounts.google.com/signup?hl=en");
		System.out.println(driver.getTitle());
		act.contextClick(driver.findElement(By.xpath("//a[text()='Help']"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		/*
		 * driver.findElement(By.xpath("//a[text()='Help']")).click(); Set<String> Ids =
		 * driver.getWindowHandles(); String Parentid = Ids.iterator().next(); String
		 * Childid = Ids.iterator().next(); System.out.println(Parentid);
		 * System.out.println(Childid); driver.switchTo().window(Childid);
		 * System.out.println(driver.getTitle());
		 */

	}

}
