package Qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;

public class CustomerModule extends Baseclass{
	@Test
	public void createcustomer() {
		Reporter.log("create customer",true);
	}

}
