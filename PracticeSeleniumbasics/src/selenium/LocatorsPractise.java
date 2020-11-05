package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractise {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
			WebDriver driver =	new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Success");

	}

}
