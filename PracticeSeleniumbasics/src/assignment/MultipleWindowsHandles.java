package assignment;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowsHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
			Actions	act	=	new Actions(driver);
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it	=	allWindows.iterator();
		String ParentWindow = it.next();
		String ChildWindow = it.next();
		System.out.println(ParentWindow);
		System.out.println(ChildWindow);
		 
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Click Here']")));
		driver.switchTo().window(ChildWindow);
		String childWindowText = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println(childWindowText);
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());

	}

}
