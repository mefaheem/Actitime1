package Qsp;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mtrselectoption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/admin/Desktop/hotel.html");
		WebElement mtrDropdown = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrDropdown);
	List<WebElement> allOptions = s.getOptions();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the menu to be searched");
		String SearchMenu=sc.nextLine();
		int count=0;
		for(int i=0;i<allOptions.size();i++) {
			String s1=allOptions.get(i).getText();
			if(SearchMenu.equals(s1)) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("available");
		}
		else {
			System.out.println("not available");
		}
		}

}
