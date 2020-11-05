package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		WebDriverWait	w	=	new	WebDriverWait(driver, 10);
		w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='results'][contains(text(),'Process')]")));
		WebElement	demoText	=	driver.findElement(By.xpath("//div[@id='results'][contains(text(),'Process')]"));
		String demoTexts = demoText.getText();
		System.out.println(demoTexts);
		
	}

}
