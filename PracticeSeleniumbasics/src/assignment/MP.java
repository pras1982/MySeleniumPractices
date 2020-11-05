package assignment;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Base.Baseclass;

public class MP {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions act		=	new Actions(driver); 
		Baseclass	urlMatch	=	new Baseclass();
		driver.get("https://omega-menlo-stage-frontend.herokuapp.com");
		urlMatch.explicitlyWait(driver, driver.findElement(By.name("email")));
		driver.findElement(By.name("email")).sendKeys("test.email@mission-pathways.com");
		driver.findElement(By.name("password")).sendKeys("MP2020Mission*");
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		driver.findElement(By.id("sessionRetreatTileButton")).click();
		driver.findElement(By.id("sessionLocationLabel")).click();
		driver.findElement(By.cssSelector("a[href*='registration'][id='participantRegistrationLink']")).click();
		Set<String> getallWinHandle = driver.getWindowHandles();
		Iterator<String> windowHandle = getallWinHandle.iterator();
		String ParentWindow = windowHandle.next();
		String ChildWindow = windowHandle.next();
		driver.switchTo().window(ChildWindow);
		act.click(driver.findElement(By.id("firstName"))).keyDown(Keys.SHIFT).sendKeys("Success").doubleClick().build().perform();
		driver.switchTo().window(ParentWindow);
		driver.findElement(By.name("address")).sendKeys("Address");
		
		

	}

}
