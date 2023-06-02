package HandlingTabs;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllTheHeadings {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]"));
		driver.findElement(By.linkText("About your actiTIME")).click();
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			if(driver.getTitle().contains("actiTime.online terms of services"))
			{
				 List<WebElement> headings = driver.findElements(By.tagName("h2"));
				 int count=headings.size();
				 for(int i=0;i<count;i++) {
					String printheadings = headings.get(i).getText();
					System.out.println(printheadings);
					
				 }
					 
				 }
			}
		}
		

}
