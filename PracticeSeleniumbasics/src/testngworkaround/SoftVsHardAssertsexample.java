package testngworkaround;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftVsHardAssertsexample {

	SoftAssert sa = new SoftAssert();

	@Test (priority = 1)
	public void login() {
		System.out.println("Login to application");
		sa.assertEquals(true, false,"Login Failed");

		System.out.println("Click login btn is successful");
		sa.assertAll();
	}
	
	@Test 
	public void getTitle() {
		
		System.out.println("Validate Home page title");
		sa.assertEquals(true, false,"Home page title is mis-matching here");
		sa.assertAll();
	}

	@Test
	public void currentDatetime() {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		System.out.println(timeStamp);
	}
}
