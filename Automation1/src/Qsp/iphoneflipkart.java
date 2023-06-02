package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iphoneflipkart {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 14 pro");
		List<WebElement>allsugg=driver.findElements(By.xpath("//input[@value='iphone 14 pro']"));
		int count=allsugg.size();

}
}
