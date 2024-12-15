package TestP;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@Test(groups= {"Smoke"})
	public void WebHomelogin() {
		System.out.println("WebHomelogin");
	}
	@Test
	public void MobileHomelogin() {
		System.out.println("MobileHomelogin");
	}
	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("LoginAPIHomeLoan");
	}
	@Parameters({"URL"})
	@Test
	 public void cogin(String urlname) {
	System.out.println("cogin");
	System.out.println(urlname);
	 }
}
