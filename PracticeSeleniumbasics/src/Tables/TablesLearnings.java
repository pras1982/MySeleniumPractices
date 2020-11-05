package Tables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesLearnings {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int sum =0;
		driver.findElements(By.cssSelector("table[id='product'] td:nth-child(3)"));
		int tablesize	=	driver.findElements(By.cssSelector("table[id='product'] td:nth-child(3)")).size();
		for(int i =0;i<tablesize;i++) {
			//System.out.println(driver.findElements(By.cssSelector("table[id='product'] td:nth-child(3)")).get(i).getText());
			String Price	=	driver.findElements(By.cssSelector("table[id='product'] td:nth-child(3)")).get(i).getText();
			int PriceValue	=	Integer.parseInt(Price);
			sum	=	sum + PriceValue;
			
		}
		System.out.println(sum);

	}

}
