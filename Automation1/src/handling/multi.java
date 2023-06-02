package handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multi {

		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[]args) throws InterruptedException {	
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Backup%20Data%2026-04-2023/Desktop/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		Thread.sleep(1000);
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("dosa");
		s.deselectByIndex(2);
		s.deselectByValue("d");
		s.deselectByVisibleText("idly");
		boolean status=s.isMultiple();
		System.out.println(status);
				

	}

}
