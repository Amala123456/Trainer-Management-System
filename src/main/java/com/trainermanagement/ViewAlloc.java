package com.trainermanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAlloc {
	WebDriver driver;
	@FindBy(css="a[href='/admin/viewallocation']")
	private WebElement Viewallocs;
	@FindBy(xpath="/html/body/app-root/app-viewallocation/div[2]/div[1]/input")
	private WebElement Search;

	public ViewAlloc(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickviewalloc() {
		Viewallocs.click();
				
	}
	public void clicksearch() {
		Search.sendKeys("Ammu");
				
	}
}
