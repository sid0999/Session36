package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {
	
	@Test
	public void Test1() {
		
		String actualTitle = "Google";
		String expectedTitle = "Gooogle";
		
		
		try {
			Assert.assertEquals(actualTitle, expectedTitle);
	
		}catch(AssertionError a) {
			System.out.println(a);  //It will execute only single code
			//a.printStackTrace();      //It will execute whole exception
		}
		
		System.out.println("We are checking assertion ");
	}
}

