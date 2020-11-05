package spiceJetWorkaround;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		// WebElement mouseHoverAddons =
		// driver.findElement(By.xpath("//a[@id='highlight-addons']"));
		// Actions action = new Actions(driver);
		// action.moveToElement(mouseHoverAddons).perform();

		/*
		 * List<WebElement> addOnsText = driver
		 * .findElements(By.xpath("//a[@id='highlight-addons']/following-sibling::ul/li"
		 * )); for (WebElement addOns : addOnsText) {
		 * System.out.println(addOns.getText()); }
		 */
		// WebElement parText = driver.findElement(By.partialLinkText("Spice"));

		// System.out.println(driver.findElement(By.linkText("SpiceClub")));

		System.out.println(driver.findElement(By.xpath("//a[text()='SpiceClub']")).getText());

		/*
		 * List<WebElement> parText = driver.findElements(By.partialLinkText("ICE")); //
		 * System.out.println(parText.size()); for (int i = 0; i < parText.size(); i++)
		 * { System.out.println(parText.get(i).getText()); }
		 */

	}

}
