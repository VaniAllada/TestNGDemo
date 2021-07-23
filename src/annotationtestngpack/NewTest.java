package annotationtestngpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	@Test

	public void f() {

	System.out.println("testcase1");

	}

	@Test

	public void f2() {

	System.out.println("testcase2");

	}

	@Test

	public void f3() {

	System.out.println("testcase3");

	}

	@Test

	public void f4() {

	System.out.println("testcase4");

	}

	@BeforeMethod

	public void beforeMethod() {

	System.out.println("Before Method");

	}

	@AfterMethod

	public void afterMethod() {

	System.out.println("After method");

	}

	@BeforeClass

	public void beforeClass() {

	System.out.println("before Class");

	}

	@AfterClass

	public void afterClass() {

	System.out.println("after Class");

	}

	@BeforeTest

	public void beforeTest() {

	System.out.println("before Test");

	}

	@AfterTest

	public void afterTest() {

	System.out.println("after Test");

	}

	@BeforeSuite

	public void beforeSuite() {

	System.out.println("before Suite");

	}

	@AfterSuite

	public void afterSuite() {

	System.out.println("after Suite");

	}

	}

	