package javapackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNg4 {
	
	@Test(priority = -7)
	public void a() {
		System.out.println("This is a1 method");
	}
	
	@Test(priority = 1)
	public void d() {
		System.out.println("This is d1 method");
	}
	
	@Test(enabled = false)
	public void x() {
		System.out.println("This is x1 method");
	}
	
	@Test(priority = 4)
	public void b() {
		System.out.println("This is b1 method");
	}
	
	@Test
	public void c() {
		System.out.println("This is c1 method");
	}
	
	
	@Test(priority = 8)
	public void z() {
		throw new SkipException("This is z1 method");
	}
	
	
}
