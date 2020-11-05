package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsDoubt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String checkBoxValue	=	"Option2";
		driver.findElement(By.id("name")).sendKeys(checkBoxValue);
		driver.findElement(By.id("alertbtn")).click();
		String Alerttext = driver.switchTo().alert().getText();
		if (Alerttext.contains(checkBoxValue)) {
			System.out.println("Success");
		} else {
			System.out.println("Failure");
		}

	}

}
