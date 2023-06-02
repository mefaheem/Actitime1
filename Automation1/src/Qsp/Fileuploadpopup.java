package Qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[]args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/Naukari.com.html");
		File f=new File("./data/faheem resume.pdf");
		String absolutepath=f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(absolutepath);
	}
}