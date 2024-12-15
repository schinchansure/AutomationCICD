package TestP;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {

	@Test(groups= {"Smoke"})
	 public void Demo() {
	System.out.println("Hello");
	 }
	@Test
	 public void SecondDemo() {
	System.out.println("Bye");
	 }
	@AfterTest
	 public void prerequiste() {
	System.out.println("I will execute Last After Test");
	 }
}
