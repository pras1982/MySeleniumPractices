package shoppinge2e;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCard {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] VeggiesTobeAddedList = { "Brocolli", "Cauliflower", "Walnuts" };
		List<String> VeggiesArrayList = Arrays.asList(VeggiesTobeAddedList);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> veggiesName = driver.findElements(By.xpath("//h4[@class='product-name']"));
		List<WebElement> addtoCardbtn = driver.findElements(By.xpath("//div[@class='product-action']/button"));
		int j = 0;
		for (int i = 0; i < veggiesName.size(); i++) {
			String[] splitedVeggies = veggiesName.get(i).getText().split("-");
			String trimmedVeggies = splitedVeggies[0].trim();
			// System.out.println(trimmedVeggies);

			if (VeggiesArrayList.contains(trimmedVeggies)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == VeggiesArrayList.size())
					break;
			}
		}

		// String itemsAdded =
		// driver.findElement(By.xpath("//div[@class='cart-info']//strong")).getText();

	}

}
