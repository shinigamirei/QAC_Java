package com.qa.main;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CookieClicker {

	@FindBy(id = "bigCookie")
	WebElement theCookie;

	@FindBy(id = "storeBulk100")
	WebElement bulkbuy;

	@FindBy(xpath = "//*[@id=\"upgrade0\"]")
	WebElement cheapestUp;

	@FindBy(xpath = "//*[@id=\"product0\"]/div[3]")
	WebElement cursor;

	public void clickCookie(ChromeDriver driver) {
		for (int i = 0; i < 1000; i++)
			((JavascriptExecutor) driver).executeScript("Game.ClickCookie()");

	}

	public void goldenCheck(ChromeDriver driver) {
		WebElement goldenCookie = driver.findElement(By.id("goldenCookie"));
		if (goldenCookie.isDisplayed())
			goldenCookie.click();
	}

	public void buyUpgrades(ChromeDriver driver) {
		Actions action = new Actions(driver);
		try {
			action.moveToElement(cheapestUp).click().perform();

		} catch (Exception e) {

		} finally {
			action.moveToElement(bulkbuy).click().perform();
			action.moveToElement(cursor).moveByOffset(0, 200).click().perform();
			action.moveByOffset(0, -50).click().perform();
			action.moveByOffset(0, -50).click().perform();
			action.moveByOffset(0, -50).click().perform();
			action.moveByOffset(0, -50).click().perform();

		}
	}
}
