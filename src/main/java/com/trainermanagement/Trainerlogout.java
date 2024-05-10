package com.trainermanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trainerlogout {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[3]/a")
	private WebElement Trainerlogout;
	public Trainerlogout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clicktrainerlogout() {
		Trainerlogout.click();
				
	}
	
}
