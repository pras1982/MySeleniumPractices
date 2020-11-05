package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TraversingtoFields {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String checkboxValue = ThrowcheckboxValue(driver);
		SelectDropdownValue(driver, checkboxValue);
		String Finalvalue = AlertValidation(driver, checkboxValue);
		if (Finalvalue.contains(checkboxValue)) {
			System.out.println("Success");
		} else {
			System.out.println("Failure");
		}

	}

	public static String ThrowcheckboxValue(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption1")).isSelected();
		String checkBoxValue = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		return checkBoxValue;
	}

	public static void SelectDropdownValue(WebDriver driver, String checkboxValue) {
		WebElement dropdownvale = driver.findElement(By.id("dropdown-class-example"));
		Select ss = new Select(dropdownvale);
		ss.selectByValue(checkboxValue);
	}

	public static String AlertValidation(WebDriver driver, String checkboxValue) {
		driver.findElement(By.id("name")).sendKeys(checkboxValue);
		driver.findElement(By.id("alertbtn")).click();
		String Alerttext = driver.switchTo().alert().getText();
		String[] SplittedText = Alerttext.split(",");
		String SplittedTextResult = SplittedText[0];
		System.out.println(SplittedTextResult);
		String[] SplittedLastValue = SplittedTextResult.split(" ");
		String SplittedFinalValue = SplittedLastValue[1];
		System.out.println(SplittedFinalValue);
		return SplittedFinalValue;

	}
}
