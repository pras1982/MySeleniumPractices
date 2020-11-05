package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsWorkaround {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Actions act = new Actions(driver);
		act.click(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).keyDown(Keys.SHIFT)
				.sendKeys("success").build().perform();
		act.click(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).keyDown(Keys.SHIFT).sendKeys("again").doubleClick().build().perform();
		act.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();

	}

}
