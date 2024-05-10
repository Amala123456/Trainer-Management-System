package com.trainermanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[2]/a")
	private WebElement Login;
	@FindBy(id="floatingInput")
	private WebElement Emails;
	@FindBy(id="floatingPassword")
	private WebElement Passwords;
	@FindBy(css="button.w-100.btn.btn-lg.btn-primary")
	private WebElement Signin;
	@FindBy(css="div.alert.alert-danger")
	public WebElement invalids;
	@FindBy(xpath="html/body/app-root/app-login/main/form/div[1]/small")
	public WebElement invalidem;
	@FindBy(css="small.text-danger")
	public WebElement invalidp;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clicklogin() {
		Login.click();
	}
	public void setPassword(String Password) {
		Passwords.clear();
		Passwords.sendKeys(Password);
		
	}
	public void setEmail(String Email) {
		Emails.clear();
		Emails.sendKeys(Email);
		
	}
	public boolean SigninAssertion()throws InterruptedException{
		  return Signin.isEnabled();
		 
		 }
	public void clicksignin() throws InterruptedException {
		Thread.sleep(4000);
		Signin.click();
		
				
	}
	
	
	
	
	
	
}
