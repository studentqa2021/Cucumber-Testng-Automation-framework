package com.generic;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.report.ExtentReport;
import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.ScreenShot;

public class BaseLogin {

	Logger log = Logger.getLogger("BaseLogin");

	public void getLogin() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");// where the driver
		WebDriver driver = new ChromeDriver();// selenium start
		driver.get(BaseConfig.getValue("URL"));// any website
		driver.manage().window().maximize();
		
		PageFactoryLogin obj = new PageFactoryLogin(driver);
		
		Highlighter.getColor(obj.getUser(), driver,"red");
		obj.getUser().sendKeys(BaseConfig.getValue("user"));
		Highlighter.getColor(obj.getPassword(), driver);
		obj.getPassword().sendKeys(BaseConfig.getValue("password"));
		Highlighter.getColor(obj.getSubmitButton(), driver);
		obj.getSubmitButton().click();
		ScreenShot.getScreenShot(driver, "Login Test status");
		
		 driver.quit();

	}

	
}
