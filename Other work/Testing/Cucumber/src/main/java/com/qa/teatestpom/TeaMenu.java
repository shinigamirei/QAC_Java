package com.qa.teatestpom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


public class TeaMenu {
	private String thisURL = "http://www.practiceselenium.com/menu.html";
	

	public void getTo(WebDriver driver) {
		driver.get(thisURL);
	}
}
