package zoom12;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class J {

	@BeforeSuite
	public void beforeSuit() {

		System.out.println("before suit");
		System.out.println("-------------------------------------------------------");
	}

	@AfterSuite
	public void afterSuit() {

		System.out.println("after suit");
		System.out.println("-------------------------------------------------------");
	}

	@BeforeGroups
	public void beforeGroup() {
		System.out.println("before group");
		System.out.println("-------------------------------------------------------");

	}

	@AfterGroups
	public void afterGroup() {
		System.out.println("after group");
		System.out.println("-------------------------------------------------------");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
		System.out.println("-------------------------------------------------------");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class");
		System.out.println("-------------------------------------------------------");
	}

	@AfterTest
	public void afterTestrun() {
		System.out.println("after Test");
	}

	@BeforeTest
	public void beforeTestrun() {
		System.out.println("before Test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}

	@Test(priority = 1)
	public void login() {
		System.out.println("in login");

	}

	@Test(priority = 2)
	public void dashboard() {
		System.out.println("in dashboard ");

	}

	@Test(priority = 3)
	public void changePassword() {
		System.out.println("in change password ");

	}

	@Test(priority = 4)
	public void logout() {
		System.out.println("in logout ");

	}

}
