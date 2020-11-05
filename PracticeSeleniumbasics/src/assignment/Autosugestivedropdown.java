package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosugestivedropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		List<WebElement> autoSuggestion = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));
		for(int i =0;i<autoSuggestion.size();i++) {
			//System.out.println(autoSuggestion.get(i).getText());
			/*
			 * if(autoSuggestion.get(i).getText().contains("United Kingdom (UK)")) {
			 * autoSuggestion.get(i).click(); }
			 */
			while(autoSuggestion.get(i).getText().contains("Indonesia")) {
				autoSuggestion.get(i).click();
			}
		}
		

	}

}
