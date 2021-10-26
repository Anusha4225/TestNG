package testNg;


import org.testng.annotations.Test;

public class Testcase1 extends BaseClass {
	
	@Test(priority = 0,description="this test case is to test home loan functionality")
	public void HomeLoanTest() {
		System.out.println("inside homeloan test");
	}

	@Test(priority =2,description="this test case is to test home loan functionality")
	public void HomeLoanTest1() {
		System.out.println("inside homeloan test1");
	}
	
	
	@Test(priority = 1,groups = {"sanity"}, description="this test case is to test car loan functionality")
	public void CarLoanTest() {
		System.out.println("inside car loan test");
		
	}
	
	
	
}
