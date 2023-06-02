package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Multiselectlistbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		Thread.sleep(1000);
		s.selectByIndex(0);
		s.deselectByValue("v");
		s.selectByVisibleText("dosa");
		s.deselectByIndex(2);
		s.deselectByValue("d");
		s.deselectByVisibleText("idly");
		boolean status=s.isMultiple();
		System.out.println(status);
	}		

}
