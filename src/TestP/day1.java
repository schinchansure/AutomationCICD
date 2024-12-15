package TestP;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class day1 {
	@BeforeClass
	 public void BoforeClass() {
	System.out.println("BoforeClass");
	 }
	@Parameters({"URL", "APIKey"})
	@Test
	 public void Login(String url, String key) {
	System.out.println("Login");
	System.out.println(url);
	System.out.println(key);
	 }
	@Test(dataProvider = "GetData")
	 public void SIgnOut(String username, String password) {
	System.out.println("SignOut");
	System.out.println(username);
	System.out.println(password);
	 }
	@Test(enabled=true)
	 public void plano() {
	System.out.println("Plano");
	Assert.assertTrue(false);
	 }
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("I am BeforeMethod");
	}
	@BeforeTest
	 public void prerequiste() {
	System.out.println("I will execute first Before Test");
	 }
	@AfterSuite
	public void AfterSuiteCarLogin() {
		System.out.println("I am AfterSuite");
	}
	@Test(groups= {"Smoke"})
	 public void RIDS() {
	System.out.println("RIDS");
	 }
	@Test(dependsOnMethods= {"plano", "RIDS"}, timeOut=4000)
	 public void Gerland() {
	System.out.println("Gerland");
	 }
	@AfterClass
	 public void AfterClass() {
	System.out.println("AfterClass");
	 }
	@DataProvider
	 public Object[][] GetData() {
		Object[][]data = new Object[3][2];
		data[0][0]="FirstsetUserName";
		data[0][1]="FirstPassword";
		
		data[1][0]="SecondsetUserName";
		data[1][1]="SecondPassword";
		
		data[2][0]="ThridsetUserName";
		data[2][1]="ThridPassword";
		return data;
		
		 }
}
