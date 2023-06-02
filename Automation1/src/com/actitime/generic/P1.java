package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import encapsulation.Loginpage1;

public class P1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Loginpage1 l=new Loginpage1(driver);
	l.setLogin("admin1","manager1");
	Thread.sleep(4000);
	l.setLogin("admin","manager");
	}

}
