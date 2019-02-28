package com.qa.teatestpom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


public class TeaMenu {
	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	private WebElement thisNavButton;
	
	@FindBys({@FindBy(className = "button-content wsb-button-content")})
	private List<WebElement> productButtons;
	
	@FindBys({
		@FindBy(tagName = "a")
	})
	List<WebElement> webeles;
	
	public void getTo() {
		for (WebElement e : webeles) {
			System.out.println(e.getText());
		}
		System.out.println("SIZE:" + productButtons.size());
		thisNavButton.click();
	}
}
