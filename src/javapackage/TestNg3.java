package javapackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNg3 {
	
	@Test(priority = 2)
	public void a() {
		System.out.println("This is a1 method");
	}
	
	@Test(priority = -8)
	public void c() {
		System.out.println("This is c1 method");
	}
	
	@Test(priority = -3)
	public void b() {
		System.out.println("This is b1 method");
	}
	
	@Test(priority = 1)
	public void d() {
		System.out.println("This is d1 method");
	}
	
	@Test
	public void e() {
		System.out.println("This is e1 method");
	}
	
	@Test(priority = 1)
	public void f() {
		System.out.println("This is f1 method");
	}
	
	
	@Test(priority = 5)
	public void z() {
		System.out.println("This is z1 method");
	}
	
	
	@Test
	public void x() {
		System.out.println("This is x1 method");
	}
}