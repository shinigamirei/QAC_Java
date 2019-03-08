package com.qa.tests;

import static org.junit.Assert.*;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.DemoSite.DemoSiteLoginPage;
import com.qa.DemoSite.DemoSiteNewAccPage;
import com.qa.main.CookieClicker;
import com.qa.main.UIDraw;

public class SeleniumTest {

	ChromeDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "..\\SeleniumTests\\src\\test\\resources\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();

	}

	@After
	public void tearDown() {
		driver.quit();
	}

	
	@Test
	public void methodTest() {
		driver.get("http://www.youtube.com");
		WebElement search = driver.findElementById("search");
		search.sendKeys("omito vs machabo");
		driver.findElementById("search-icon-legacy").click();
	}

	
	@Test
	public void newUserAndLogin() {
		driver.get("http://thedemosite.co.uk/");
		String username = "yes7";
		String password = "7yes";

		DemoSiteNewAccPage accPage = PageFactory.initElements(driver, DemoSiteNewAccPage.class);
		DemoSiteLoginPage logPage = PageFactory.initElements(driver, DemoSiteLoginPage.class);

		accPage.getTo();
		accPage.addUser(username, password);

		logPage.getTo();
		logPage.login(username, password);

		assertEquals("**Successful Login**",
				driver.findElementByXPath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
						.getText());

	}

	
	@Test
	public void dressSearch() {
		driver.get("http://automationpractice.com/index.php");
		WebElement search = driver.findElementById("search_query_top");
		search.sendKeys("Dress");
		search.submit();

		assertEquals("Printed Dress",
				driver.findElementByXPath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a").getText());

	}

	
	@Test
	public void lovelyNewDress() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");
		WebElement search = driver.findElementById("search_query_top");
		search.sendKeys("Dress");
		search.submit();

		assertEquals("Printed Dress",
				driver.findElementByXPath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a").getText());

		driver.findElementByXPath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[3]/div/h5/a").click();

	}

	
	@Test
	public void drawTest() throws InterruptedException, FileNotFoundException {
		driver.get("https://www.youidraw.com/apps/painter/");
		UIDraw drawThing = PageFactory.initElements(driver, UIDraw.class);
		drawThing.selectBrush();
		drawThing.writeName(driver);
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println(scrFile.getAbsolutePath());

		InputStream inStream = null;
		OutputStream outStream = null;

		try {

			File bfile = new File("C:\\screenshots");

			inStream = new FileInputStream(scrFile);
			outStream = new FileOutputStream(bfile);

			byte[] buffer = new byte[1024];

			int length;
			
			while ((length = inStream.read(buffer)) > 0) {

				outStream.write(buffer, 0, length);

			}

			inStream.close();
			outStream.close();

			System.out.println("File is copied successful!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	@Test
	public void implicitHateTest() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://christophperrins.github.io/TestingSite/");
		WebElement dynamicElement = driver.findElementByXPath("//*[@id=\"quote\"]/h2");
		assertEquals("-The Shafeeq", dynamicElement.getText());
	}

	
	@Test
	public void explicitHateTest() {
		driver.get("https://christophperrins.github.io/TestingSite/");
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"quote\"]/h2")));

		assertEquals("-The Shafeeq", myDynamicElement.getText());
	}
	
	@Ignore
	@Test
	public void cookies() {
		driver.get("http://orteil.dashnet.org/cookieclicker/");

		CookieClicker cookies = PageFactory.initElements(driver, CookieClicker.class);
		while(true) {
		cookies.clickCookie(driver);
		cookies.buyUpgrades(driver);
		}
	}
}
