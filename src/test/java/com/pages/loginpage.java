package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	WebDriver driver;
	By uname=By.name("userName");
	By pwd=By.id("password");
	By nreg=By.linkText("New User?Register Here");
	By fpwd=By.linkText("Forgot Password?");
	By login=By.name("Login");
	By cancel=By.name("Cancel");
	By home=By.linkText("Home");
	public loginpage(WebDriver driver) {
		this.driver=driver;
	}
	public void um(String uid) {
		driver.findElement(uname).sendKeys(uid);
	}
	public void pm(String pd) {
		driver.findElement(pwd).sendKeys(pd);
	}
	public void nm() {
		driver.findElement(nreg).click();
	}
	public void fm() {
		driver.findElement(fpwd).click();
	}
	
	public void lm() {
		driver.findElement(login).click();
	}
	public void cm() {
		driver.findElement(cancel).click();
	}
	public void hm() {
		driver.findElement(home).click();
		
	}
}
