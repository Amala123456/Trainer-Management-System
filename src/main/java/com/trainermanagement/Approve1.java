package com.trainermanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Approve1 {
	WebDriver driver;
	@FindBy(css="a.btn.btn-success")
	private WebElement Approves;
	public Approve1(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickapprove() 
	{
		Approves.click();
				
	}
	
	public boolean ApproveAssertion()throws InterruptedException{
		  return Approves.isEnabled();
		 
		 }
	

}
