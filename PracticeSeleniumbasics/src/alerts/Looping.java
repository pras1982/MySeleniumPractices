package alerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Looping {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//List<WebElement> allCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		/*
		 * for (WebElement cb : allCheckbox) { cb.click(); }
		 */

		/*
		 * for (int i = 0; i < allCheckbox.size(); i++) { if
		 * (allCheckbox.get(i).getAttribute("value").contains("option2")) {
		 * allCheckbox.get(i).click(); System.out.println(allCheckbox.get(i).getText());
		 * } }
		 */

		/*
		 * for (WebElement cb : allCheckbox) { if (!cb.isSelected()) { cb.click();
		 * System.out.println(cb.getText()); } }
		 */
		
	}

}
