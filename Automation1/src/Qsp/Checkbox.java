package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		boolean Checkbox=driver.findElement(By.xpath("//input[@Value='on']")).isSelected();
		if(Checkbox==true) {
			System.out.println("checkbox selected and pass");
		}
		else {
			System.out.println("checkbox is not selected and fail");
		}
		driver.close();
		}
		

}
