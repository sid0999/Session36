package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion3 {
	
	WebDriver driver;
	
	@Test
	public void Test1() throws Exception {
		
		//SoftAssert soft = new SoftAssert();
		
		String expected = "Sorry, wee don't recognise this email address.";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Courses\\QE_software\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.intl=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.xpath("//p[@id='username-error']")).getText();
		Thread.sleep(2000);
		
		//soft.assertEquals(actual,expected);
		
		Assert.assertEquals(actual,expected,"actual and expected are not matched");
		
		System.out.println("Assertion successfully validated");
		
		//soft.assertAll();
	}
}
