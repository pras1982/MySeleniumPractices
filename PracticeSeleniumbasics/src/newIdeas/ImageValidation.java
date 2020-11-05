package newIdeas;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImageValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				WebDriverWait	w	=	new WebDriverWait(driver, 15);
		driver.get("https://omega-menlo-qa-frontend.herokuapp.com/");
		driver.manage().window().maximize();
		w.until(ExpectedConditions.elementToBeClickable(By.name("email")));
		driver.findElement(By.name("email")).sendKeys("test.email@mission-pathways.com");
		driver.findElement(By.name("password")).sendKeys("MP2020Mission*");
		List<WebElement> missionImages = driver.findElements(By.xpath("//*[img]"));
		for(int i =0;i<missionImages.size();i++) {
			System.out.println(missionImages.get(i).getAttribute("outerHTML"));
			System.out.println(missionImages.get(i).getAttribute("innerHTML"));
		}
		/*
		 * for(WebElement ch:missionImages) { imageBroken(ch); }
		 */

	}

	/*
	 * public static void imageBroken(WebElement ch) {
	 * 
	 * if(ch.getAttribute("naturalWidth").equals("0")) {
	 * System.out.println("Image is broken"); } else {
	 * System.out.println("Image loaded fine"); }
	 * 
	 * System.out.println(ch.getAttribute("naturalWidth")); }
	 */

}
