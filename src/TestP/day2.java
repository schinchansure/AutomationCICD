package TestP;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups= {"Smoke"})
	public void WebCarlogin() {
		System.out.println("WebCarlogin");
	}
	@BeforeSuite
	public void BeforeSuiteCarLogin() {
		System.out.println("I am BeforeSuite");
	}
	@Test
	public void MobileCarlogin() {
		System.out.println("MobileCarlogin");
	}
	@Test
	public void LoginAPICarLoan() {
		System.out.println("LoginAPICarLoan");
	}
}
