package alerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingChecketc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Select selectDropdowns = new Select(driver.findElement(By.id("dropdown-class-example")));
		selectDropdowns.selectByValue("option2");
		List<WebElement> checkBoxCount = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int checkBoxSize = checkBoxCount.size();
		System.out.println(checkBoxSize);
		/*
		 * for(WebElement cb:checkBoxCount) { cb.click(); } Thread.sleep(1000); for(int
		 * i=0;i<checkBoxSize;i++) { String val =
		 * checkBoxCount.get(i).getAttribute("type"); if
		 * (val.equalsIgnoreCase("checkbox")){ checkBoxCount.get(i).click(); } }
		 */

		for (int j = 0; j < checkBoxSize; j++) {
			if (!checkBoxCount.get(j).isSelected()) {
				checkBoxCount.get(j).click();
			}
		}
		
		
	}

}
