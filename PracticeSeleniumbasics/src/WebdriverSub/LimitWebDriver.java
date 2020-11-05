package WebdriverSub;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LimitWebDriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement FooterLinks = driver.findElement(By.id("gf-BIG"));
		// System.out.println(FooterLinks.findElements(By.tagName("a")).size());
		WebElement DiscountLinks = driver.findElement(By.xpath("//div[@id='gf-BIG']//table//tr//td//ul"));
		// System.out.println(DiscountLinks.findElements(By.tagName("a")).size());
		System.out.println(DiscountLinks.findElement(By.tagName("a")).getText());
		int DiscountLinksSize = DiscountLinks.findElements(By.tagName("a")).size();
		for (int i = 1; i < DiscountLinksSize; i++) {
			System.out.println(DiscountLinks.findElements(By.tagName("a")).get(i).getText());
			String sendText = Keys.chord(Keys.CONTROL, Keys.ENTER);
			DiscountLinks.findElements(By.tagName("a")).get(i).sendKeys(sendText);

		}
		Set<String> ChildWindows = driver.getWindowHandles();
		Iterator<String> It = ChildWindows.iterator();

		while (It.hasNext()) { // String string = (//String) It.next();
			driver.switchTo().window(It.next());
			System.out.println(driver.getTitle());
		}

	}

}
