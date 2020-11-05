package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Baseclass;

public class seleniumBasics {

	public static void main(String[] args) {
		
			Baseclass browserInvoke = new Baseclass();
			browserInvoke.triggerBrowser("https://www.google.com");
			

	}

}
