package testNg;

import org.testng.annotations.Test;

public class Testcase2 extends BaseClass {
	
	@Test(groups = {"sanity"}, dependsOnMethods="CCTest")
	public void CreditcardLoan() {
		System.out.println("inside credit card loan");
	}

	@Test(groups = {"sanity"})
	public void CCTest() {
		System.out.println("inside credit cctest");
	}
}
