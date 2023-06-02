package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fontsizetype {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String size=driver.findElement(By.linkText("Forgotten password?")).getCssValue("size");
		String type=driver.findElement(By.linkText("Forgotten password?")).getCssValue("type");
		System.out.println(size);
		System.out.println(type);
		driver.close();

	}
}
