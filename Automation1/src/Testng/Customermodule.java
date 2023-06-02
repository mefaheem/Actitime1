package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customermodule {
	@Test(priority=1,invocationCount=3)
	public void CreateCustomer() {
		Reporter.log("CreateCustomer",true);
	}
		@Test(priority=2,dependsOnMethods="CreateCustomer")
		public void ModifyCustomer() {
			Reporter.log("modifycustomer",true);
					}
		@Test(priority=3,dependsOnMethods= {"create customer","modifycustomer"})
		public void deleteCustomer() {
			Reporter.log("deleteCustomer",true);
		}
			
				
	}
	

