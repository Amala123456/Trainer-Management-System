package com.trainermanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Allocate1 {
	WebDriver driver;
	@FindBy(xpath="/html/body/app-root/app-admindash/app-adminnav/nav/div/div/ul/li[2]/a")
	private WebElement Allocate;
	@FindBy(xpath="/html/body/app-root/app-search-trainer/div/div[2]/table/tbody/tr[1]/td[10]/a")
	private WebElement allocate;
	public Allocate1(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickallocate() {
		Allocate.click();
				
	}
	public void clickAllocate() {
		allocate.click();
				
	}
	
	
	public boolean AllocAssertion()throws InterruptedException{
		  return allocate.isEnabled();
		 
		 }
	

}
