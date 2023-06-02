package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.id("inputWrapper")).sendKeys("selenium");
		List<WebElement>allsugg=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		int count=allsugg.size();
		System.out.println(count);
 for(int i=0;i<count;i++) {
	 String text=allsugg.get(i).getText();
	 System.out.println(text);
 }
	 allsugg.get(count-1).click();
 }
}
