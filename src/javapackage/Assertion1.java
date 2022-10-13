package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	
	@Test
	public void Test1() {
		
//		int a=10;
//		int b=20;
//		
//		Assert.assertTrue(a<b);
//		System.out.println("Assertion pass");
//		
//		Assert.assertTrue(a>b);
//		System.out.println("Assertion pass");
//		
//		Assert.assertFalse(a>b);
//		System.out.println("Assertion pass");
		
		String actualName = "Yahoo";
		String expectedName = "Yahooo";
		
		Assert.assertEquals(actualName, expectedName,"actual and expected are not matched");
		System.out.println("assertion pass");
	}
	
	//The scope of the assertion will be limited to test1() only
	@Test
	public void Test2() {
		System.out.println("Assertion pass2");
	}
}
