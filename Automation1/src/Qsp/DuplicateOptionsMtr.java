package Qsp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.hash.HashCode;

public class DuplicateOptionsMtr {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/admin/Desktop/hotel.html");
		WebElement mtrDropdown = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrDropdown);
		List<WebElement> allOptions = s.getOptions();
		ArrayList<String>duplicates=new ArrayList();
		HashSet <String>unique=new HashSet();
		for(WebElement option:allOptions) {
			if(!unique.add(option.getText())) {
				duplicates.add(option.getText());
			}
		}
		for(Object o:duplicates) {
			System.out.println(o);
		}
	}
}
			
			
			
			
			
			
			
		


