package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forgettenpassword {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String Attribute=driver.findElement(By.xpath("//a[@href='https://about.meta.com/']")).getAttribute("href");
		System.out.println(Attribute);
		driver.close();
	}
}
		



