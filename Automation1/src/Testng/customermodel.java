package Testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class customermodel {
	@Test
	public void createcustomer() {
		Reporter.log("createcustomer",true);
	}
	@Test
	public void deletecustomer() {
		Reporter.log("deletecustomer",true);
	}
@BeforeMethod
public void login() {
	Reporter.log("login",true);
}
@AfterMethod
public void logout() {
	Reporter.log("logout",true);
}
@BeforeClass
public void openBrowser() {
	Reporter.log("openBrowser",true);
}
@AfterClass
public void closeBrowser() {
	Reporter.log("closeBrowser",true);
}
}
