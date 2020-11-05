import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
			WebDriver	driver =	new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			driver.findElement(By.id("name")).sendKeys("Working on Alerts");
			driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
			String	alertMsgValidation	=	driver.switchTo().alert().getText();
			System.out.println(alertMsgValidation);
			driver.switchTo().alert().accept();
			driver.findElement(By.id("name")).sendKeys("Working on Confirmation");
			driver.findElement(By.id("confirmbtn")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();

	}

}
