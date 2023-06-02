package encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage1 {
	private WebElement untbx;
	private  WebElement pwtbx;
	private WebElement lgbtn;
	public Loginpage1(WebDriver driver) {
		untbx=driver.findElement(By.id("username"));
		pwtbx=driver.findElement(By.name("pwd"));
		lgbtn=driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	public void setLogin(String un, String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}

}
