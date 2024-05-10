package com.trainermanagement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminlogout {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"navbarNav\"]/ul/li[4]/a")
	private WebElement Logout;
	public Adminlogout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clicklogout() {
	Logout.click();

	}
	
}
