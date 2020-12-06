package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
private WebDriver driver; 
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver_New\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.carnival.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.carnival.com/");
		
	}
	
	@Test
	public void testCarnival() throws InterruptedException{
		
			
		WebElement durationButton = driver.findElement(By.xpath("//*[@id='cdc-durations']"));
		
		durationButton.click();
		
		WebElement durationDays = driver.findElement(By.xpath("//*[@id='ccl-cruise-search']/ccl-cruise-search/div[3]/ccl-cruise-search-bar/div/div[2]/div/div[2]/div/ul/li[2]/button"));
		
		durationDays.click();

		durationButton.click();
		
		WebElement destinationButton = driver.findElement(By.xpath("//*[@id='cdc-destinations']"));
		
		destinationButton.click();
		
		WebElement destination = driver.findElement(By.xpath("//*[@id='ccl-cruise-search']/ccl-cruise-search/div[3]/ccl-cruise-search-bar/div/div[2]/div/div[2]/div/ccl-search-bar-expandable-filter/div/ul/li[2]/button"));

		destination.click();
		
		destinationButton.click();
		
		WebElement searchButton = driver.findElement(By.xpath("//*[@id='ccl-cruise-search']/ccl-cruise-search/div[3]/ccl-cruise-search-bar/div/div[2]/div/ul/li[5]/a"));
		
		searchButton.click();
	 
	    Thread.sleep(500);
	    
WebElement learnMoreButton = driver.findElement(By.xpath("//*[@id='ccl-refresh-homepage']/div/div/div/div/div/ccl-cruise-search/div[3]/ccl-view-result-container/div/ccl-view-result-grid/article[1]/ccl-view-result-grid-item/div/div[1]/ccl-view-result-grid-footer/div/div[2]/a"));
	    
	    learnMoreButton.click();
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    js.executeScript("window.scrollBy(0,650)", "");
	    
	    Thread.sleep(500);
	    
	    WebElement dayOne = driver.findElement(By.xpath("//*[@id='details']/div[3]/div[3]/div[1]/div/div/button"));
	    
	    dayOne.click();
	    
	    Thread.sleep(1000);
	    
	    WebElement bookingButton = driver.findElement(By.xpath("//*[@id='sm-booking-btn']/booking-button/div"));
	    
	    if	(bookingButton.isDisplayed()) {
			
			System.out.println("BookingButton es visible");
			}else{
			System.out.println("BookingButton failed");
			}
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
