package Handlingmouseaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Scroll {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		RemoteWebDriver web=(RemoteWebDriver) driver;
		web.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		web.executeScript("window.scrollBy(document.body.scrollWidth,20000)");
	}
	}
