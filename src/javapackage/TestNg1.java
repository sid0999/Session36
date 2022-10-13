package javapackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg1 {
	
	@Test
	public void i() {
		System.out.println("This is i method");
	}
	
	
	@BeforeSuite
	public void d() {
		System.out.println("before suite method");
	}
	
	@BeforeTest
	public void e() {
		System.out.println("before test method");
	}
	
	
	@BeforeClass
	public void f() {
		System.out.println("before class method");
	}
	
	@BeforeMethod
	public void a() {
		System.out.println("before  method");
	}
	
	
	
	
	@AfterTest
	public void h() {
		System.out.println("after test method");
	}
	
	
	@AfterClass
	public void k() {
		System.out.println("after class method");
	}
	
	
	@AfterMethod
	public void b() {
		System.out.println("after method");
	}
	
	
	@Test
	public void j() {
		System.out.println("This is j method");
	}
	
	
	@AfterSuite
	public void g() {
		System.out.println("after suite method");
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is main method");
	}
	
}	
		
	

  


