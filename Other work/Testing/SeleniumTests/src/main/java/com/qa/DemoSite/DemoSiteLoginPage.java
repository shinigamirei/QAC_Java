package com.qa.DemoSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoSiteLoginPage {
	
	@FindBy(name = "username")
	private WebElement usernameField;

	@FindBy(name = "password")
	private WebElement passwordField;
	
	@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
	private WebElement thisNavButton;
	
	public void login(String username, String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		passwordField.submit();
	}
	
	public void getTo() {
		this.thisNavButton.click();
	}
}
