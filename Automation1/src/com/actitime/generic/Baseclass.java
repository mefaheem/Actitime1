package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public WebDriver driver;
	@BeforeClass
	public void OpenBrowser() {
		Reporter.log("OpenBrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
@AfterClass
public void closeBrowser() {
	Reporter.log("closeBrowser",true);
	driver.close();
}
@BeforeMethod
public void login() {
	Reporter.log("login",true);
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
}
@AfterMethod
public void logout() {
	Reporter.log("logout",true);
	driver.findElement(By.linkText("Logout")).click();
}
}
