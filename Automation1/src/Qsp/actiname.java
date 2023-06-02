package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiname {
	private static boolean actitime;
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		boolean actitime=driver.findElement(By.xpath("//div[@class='atProductName']")).isDisplayed();
		if(actitime==true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
	


