package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printallselectedoptions {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/hotel.html");
		WebElement slvlistbox = driver.findElement(By.id("slv"));
		Select s=new Select(slvlistbox);
		Thread.sleep(1000);
		List<WebElement> allsoptions = s.getAllSelectedOptions();
		int count=allsoptions.size();
		System.out.println(count);
		for(WebElement a:allsoptions) {
			 String text = a.getText();
			 System.out.println(text);
		}
//driver.close();
	}
}
