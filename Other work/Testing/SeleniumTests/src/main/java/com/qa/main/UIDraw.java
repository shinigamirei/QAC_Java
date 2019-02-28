package com.qa.main;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class UIDraw {

	@FindBy(id = "brush")
	WebElement brushIcon;
	
	@FindBy(id = "catch")
	WebElement canvas;
	
	@FindBy(id = "edSize")
	WebElement size;
	
	public void writeName(ChromeDriver driver) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(canvas).moveByOffset(-300, -200).clickAndHold().moveByOffset(0, 200).moveByOffset(40, -50).moveByOffset(-40, -50).moveByOffset(40, -50).moveByOffset(-40, -50).release().perform();
		action.moveByOffset(100, 0).clickAndHold().moveByOffset(0, 10).release().moveByOffset(0, 20).clickAndHold().moveByOffset(0, 170).release().perform();
		action.moveByOffset(120, -170).clickAndHold().moveByOffset(-40, -30).moveByOffset(-40, 85).moveByOffset(40, 85).moveByOffset(30, -40).moveByOffset(-20, 0).release().perform();
		
		action.moveToElement(canvas).moveByOffset(-350, 50).clickAndHold().moveByOffset(0, 200).moveByOffset(50, -100).moveByOffset(-40, -100).release().perform();
		action.moveByOffset(80, 200).clickAndHold().moveByOffset(40, -170).moveByOffset(40, 170).release().perform();
		action.moveByOffset(80, -160).clickAndHold().moveByOffset(0, 170).moveByOffset(40, -80).moveByOffset(-40, -80).release().perform();
		action.moveByOffset(80, 0).clickAndHold().moveByOffset(0, 170).moveByOffset(40, -80).moveByOffset(-40, -80).release().perform();
		action.moveByOffset(80, 0).clickAndHold().moveByOffset(40, 70).moveByOffset(40, -70).moveByOffset(-80, 140).release().perform();
		
		size.sendKeys(Keys.BACK_SPACE);
		size.sendKeys("40");
//		action.moveToElement(size).click().keyDown(Keys.NUMPAD4).keyDown(Keys.NUMPAD0);
		
		action.moveToElement(canvas).moveByOffset(100, -200).clickAndHold().moveByOffset(300, 0).moveByOffset(-150, 0).moveByOffset(-30, 400).moveByOffset(-70, 40).perform();
		Thread.sleep(2000);
	}
	
	
	public void selectBrush() {
		System.out.println(brushIcon.getAttribute("id"));
		brushIcon.click();
	}
}
