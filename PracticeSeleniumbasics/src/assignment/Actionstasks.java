package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionstasks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions	act	=	new Actions(driver);
		driver.get("https://www.amazon.in/");
		act.click(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).keyDown(Keys.SHIFT).sendKeys("upper").doubleClick().build().perform();
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Hello, Sign in']"))).build().perform();
		act.contextClick(driver.findElement(By.xpath("//span[text()='Hello, Sign in']"))).build().perform();
		

	}

}
