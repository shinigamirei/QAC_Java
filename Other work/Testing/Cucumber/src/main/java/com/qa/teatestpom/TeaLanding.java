package com.qa.teatestpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeaLanding {
	
	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[1]/a")
	private WebElement thisNavButton;
	
	public void getTo() {
		this.thisNavButton.click();
	}
}
