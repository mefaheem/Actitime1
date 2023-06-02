package Handlingmouseaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.vtiger.com/");
	WebElement target = driver.findElement(By.partialLinkText("Resources"));
	Actions a = new Actions(driver);
	a.moveToElement(target).perform();
	driver.findElement(By.xpath("//a[contains(text(),'Customers')]")).click();
	WebElement doubleclick = driver.findElement(By.id("loginspan"));
	a.doubleClick(doubleclick).perform();
	Thread.sleep(2000);
	if(driver.getTitle().equals("Login - Vtiger")) {
		System.out.println("loginpage is displayed and pass");
	}
	else {
		System.out.println("login page not is displayed and fail");
		//driver.quit();
	}
	driver.quit();
	}
}
