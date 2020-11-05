package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	public void triggerBrowser(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver	driver =	new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	public void explicitlyWait(WebDriver driver,WebElement emailLocator) {
		WebDriverWait	Exp	=	new WebDriverWait(driver, 15);
		Exp.until(ExpectedConditions.visibilityOf(emailLocator));
	}
}
