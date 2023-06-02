package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xyaxislogin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int x=driver.findElement(By.name("login")).getLocation().getX();
		System.out.println(x);
		int y=driver.findElement(By.name("login")).getLocation().getY();
		System.out.println(y);
		if(x==y) {
			System.out.println("x and y axis is properly alligned for login button");
		}
		else {
			System.out.println("x and y axis is properly alligned for login button");
		}
		driver.close();
	}
}
