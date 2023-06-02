package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heightwidth{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement username=driver.findElement(By.name("username"));
		WebElement password=driver.findElement(By.name("pwd"));
		 int h1 = username.getSize().getHeight();
		 int h2= password.getSize().getHeight();
		 System.out.println("Height="+h1);
		 System.out.println("Height="+h2);
		 int w1=username.getSize().getWidth();
		 int w2=password.getSize().getWidth();
		 System.out.println("Width="+w1);
		 System.out.println("Width="+w2);
		 if(h1==h2 && w1==w2)
		 {
			 System.out.println("username and password height and width are same and pass");
		 }
		 else {
			 System.out.println("username and password height and width are not same and fail");
		 }
		 driver.close();
	}

}		
		
		


	


