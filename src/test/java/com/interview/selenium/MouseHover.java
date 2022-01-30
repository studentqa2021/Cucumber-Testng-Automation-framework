package com.interview.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.util.Highlighter;
import com.util.ScreenShot;

public class MouseHover {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.costco.com/");

		

		List<WebElement> element = driver.findElements(By.xpath("//*[@class='nav-item']//a"));
		Highlighter.getColor(element.get(2), driver);
		ScreenShot.getScreenShot(driver, "Amazon home page");
		Thread.sleep(2000);
		Actions action = new Actions(driver);

		action.moveToElement(element.get(2)).build().perform();
		
		

		//element.get(2).click();

	}

}
