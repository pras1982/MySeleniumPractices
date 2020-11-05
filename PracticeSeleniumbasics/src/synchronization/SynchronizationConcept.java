package synchronization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronizationConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		// WebDriverWait w = new WebDriverWait(driver, 5);
		List<WebElement> prodNames = driver.findElements(By.xpath("//*[@class='product-name']"));

		/*
		 * for(WebElement ch:prodNames) { System.out.println(ch); }
		 */
		String[] ExpectedVeggies = { "Brocolli", "Cauliflower" };
		List<String> ExpVegArrays = Arrays.asList(ExpectedVeggies);
		ArrayList VegLists = new ArrayList();
		for (int i = 0; i < prodNames.size(); i++) {
			String VegNames = prodNames.get(i).getText();
			VegLists.add(VegNames);
			String[] SplittedVeggies = VegLists.get(i).toString().split("-");
			String FormattedVeggies = SplittedVeggies[0];
			String TrimmedVeggies = FormattedVeggies.trim();
			if (TrimmedVeggies.contains(ExpVegArrays.get(i))) {
				System.out.println("Success");
			} else {
				System.out.println("Not Matching");
			}
		}
		

	}

}
