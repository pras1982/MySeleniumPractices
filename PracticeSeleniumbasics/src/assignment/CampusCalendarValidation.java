package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CampusCalendarValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://campus.ecgroup.in/Auth/Login");
		driver.findElement(By.id("UserId")).sendKeys("11322");
		driver.findElement(By.id("Password")).sendKeys("sairam123");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.className("menu-item-parent")).click();
		driver.findElement(By.linkText("TimeSheets")).click();
		driver.findElement(By.className("trigger")).click();
		WebElement CalMonth = driver.findElement(By.className("ui-datepicker-month"));
		Select CalMonthSelect = new Select(CalMonth);
		List<WebElement> CalMonthOptions = CalMonthSelect.getOptions();
		for (int i = 0; i < CalMonthOptions.size(); i++) {
			if (CalMonthOptions.get(i).getText().equalsIgnoreCase("Feb")) {
				CalMonthOptions.get(i).click();
				break;
			}
		}

		WebElement CalYear = driver.findElement(By.className("ui-datepicker-year"));
		Select CalYearSelect = new Select(CalYear);
		List<WebElement> CalYearOptions = CalYearSelect.getOptions();
		for (int j = 0; j < CalYearOptions.size(); j++) {
			if (CalYearOptions.get(j).getText().equalsIgnoreCase("2019")) {
				CalYearOptions.get(j).click();
				break;
			}
		}
		
		List<WebElement> SelectDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[a]"));
		for(int x=0;x<SelectDate.size();x++) {
			if(SelectDate.get(x).getText().equalsIgnoreCase("6")) {
				SelectDate.get(x).click();
				break;
			}
		}

	}

}
