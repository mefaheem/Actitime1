package Handlingmouseaction;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.findElement(By.xpath("//div[@id='dropContent']/div[not(@style)]"));
		List<WebElement> drop = driver.findElements(By.className("dragableBoxRight"));
		List<WebElement> drag = driver.findElements(By.xpath(""));
		Actions a1=new Actions(driver);
		for(int i=0;i<drop.size();i++) {
			a1.dragAndDrop(drag.get(i), drop.get(i)).pause(2000).perform();
		}
	
	
	}
}
