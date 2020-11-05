package assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import collections.LinkedListConcept;

public class TablesAssignment {

	public static void main(String[] args) {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Shalini\\eclipse-workspace\\PracticeSeleniumbasics\\drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * driver.get("https://rahulshettyacademy.com/AutomationPractice/"); int
		 * rowsCount =
		 * driver.findElements(By.cssSelector("table[id='product'] tr")).size();
		 * System.out.println(rowsCount); int columnsCount =
		 * driver.findElements(By.cssSelector("table[id='product'] tr th")).size();
		 * System.out.println(columnsCount); int columnsize =
		 * driver.findElements(By.cssSelector("table[id='product'] tr:nth-child(3) td"))
		 * .size(); List<WebElement> columnvalues =
		 * driver.findElements(By.cssSelector("table[id='product'] tr:nth-child(3) td"))
		 * ; for(int i=0;i<columnsize;i++) {
		 * System.out.println(columnvalues.get(i).getText()); }
		 * System.out.println("****************"); WebElement Table =
		 * driver.findElement(By.xpath("//table[@id='product']"));
		 * System.out.println(Table.findElements(By.tagName("tr")).size());
		 * System.out.println(Table.findElements(By.tagName("tr")).get(0).findElements(
		 * By.tagName("th")).size());
		 * System.out.println(Table.findElements(By.tagName("tr")).get(3).findElements(
		 * By.tagName("td")).get(0).getText());
		 * System.out.println(Table.findElements(By.tagName("tr")).get(3).findElements(
		 * By.tagName("td")).get(1).getText());
		 * System.out.println(Table.findElements(By.tagName("tr")).get(3).findElements(
		 * By.tagName("td")).get(2).getText());
		 */
		linkedListsConcepts();
		

	}
	
	public static void linkedListsConcepts() {
		LinkedList<String> ll	=	new LinkedList<String>();
		ll.add("Sam");
		ll.add("Vincent");
		for(int i =0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(String result:ll) {
			System.out.println(result);
		}
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
