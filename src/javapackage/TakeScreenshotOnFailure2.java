package javapackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure2 {
	
	TakeScreenshotOnFailure1 t1 = new TakeScreenshotOnFailure1();
	
	@Test(priority=1)
	public void doLogin() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Courses\\QE_software\\chromedriver_win32 (2)\\chromedriver.exe");
		
		t1.driver = new ChromeDriver();
		
		t1.driver.get("https://www.facebook.com/");
		t1.driver.manage().window().maximize();
		Thread.sleep(2000);
		
		t1.driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		
		t1.driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123");
		Thread.sleep(2000);
		
		t1.driver.findElement(By.xpath("//button[@name='loginn']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
		public void assertionClick() {
			
			String actual = "abc";
			String expected = "abc";
			
			Assert.assertEquals(actual, expected);
		}
		
		
	@AfterMethod
	public void TakeScreenshotOnFailure(ITestResult result) throws Exception {
		t1.captureScreenshot(result);
	}
	
}
