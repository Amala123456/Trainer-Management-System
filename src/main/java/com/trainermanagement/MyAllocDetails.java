package com.trainermanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAllocDetails {
	WebDriver driver;
	@FindBy(css="a[href='/profile/allocateDetail']")
	private WebElement Myalloc;
	public MyAllocDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickmyalloc() {
		Myalloc.click();
				
	}
}
