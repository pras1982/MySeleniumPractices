package newIdeas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParticipationReg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait	wait	=	new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.get("https://omega-menlo-qa-frontend.herokuapp.com/grow/674df3f2-e96b-413e-ad3b-b85e9023a6b0/registration");
		int howManyAttend = driver.findElements(By.xpath("//input[@role='combobox']")).size();
		Thread.sleep(3000);
		for(int i =0;i<howManyAttend;i++) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ng-arrow-wrapper']")));
			driver.findElements(By.xpath("//span[@class='ng-arrow-wrapper']")).get(i).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']//div//div[2]")));
			driver.findElement(By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']//div//div[2]")).click();
		}
	}

}
