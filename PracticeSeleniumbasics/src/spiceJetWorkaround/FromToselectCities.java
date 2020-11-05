package spiceJetWorkaround;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FromToselectCities {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		// driver.findElement(By.xpath("//input[@value='Departure City']"));
		// driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']"))
				.click();
		// driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();

		// driver.findElement(By.xpath("//a[@class='.ui-state-default.ui-state-highlight.ui-state-active']")).click();
		// driver.findElement(By.cssSelector("//a[@class='.ui-state-default.ui-state-highlight.ui-state-active']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		String returnDateValidation = driver.findElement(By.className("picker-second")).getAttribute("style");
		if (returnDateValidation.contains("0.5")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(true);
		}
		// Thread.sleep(1000);
		// driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		// driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		List<WebElement> checkboxCheckAll = driver.findElements(
				By.xpath("//div[@id='discount-checkbox']//input[@type='checkbox']/following-sibling::label"));
		for (int i = 0; i < checkboxCheckAll.size(); i++) {
			checkboxCheckAll.get(i).click();
			System.out.println(checkboxCheckAll.get(i).getText());
			
		}

	}

}
