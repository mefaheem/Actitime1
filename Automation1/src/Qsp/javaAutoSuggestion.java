package Qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class javaAutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement>allsugg=driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=allsugg.size();
		System.out.println(count);
 for(int i=0;i<count;i++) {
	 String text=allsugg.get(i).getText();
	 System.out.println(text);
 }
	 allsugg.get(0).click();
 }
}



