package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Careinsurance {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.name("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement monthDropdown = driver.findElement(By.className("ui-datepicker-month"));
		Select s1=new Select(monthDropdown);
		s1.selectByVisibleText("Nov");
		WebElement yearDropdown = driver.findElement(By.className("ui-datepicker-year"));
		Select s2=new Select(yearDropdown);
		s2.selectByVisibleText("2000");
		driver.findElement(By.name("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
	}

}
