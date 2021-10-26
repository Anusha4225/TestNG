package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeTest (alwaysRun = true)
	public void BeforeTestMethod() {
		System.out.println("inside before test");
	}
	@BeforeClass
	public void BeforeClassM() {
		System.out.println("inside before class");
	}
	@BeforeMethod (alwaysRun = true)
	public void setup() {
		System.out.println("inside before method");
	}
	
	@AfterMethod (alwaysRun = true)
	public void teardown() {
		System.out.println("inside after method");
	}
	@AfterClass
	public void AfterClassM() {
		System.out.println("inside after class");
	}
	@AfterTest (alwaysRun = true)
	public void AfterTestMethod() {
		System.out.println("inside after test");
	}


}
