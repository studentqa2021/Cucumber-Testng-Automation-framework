package com.smoke.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.BaseLogin;
import com.report.ExtentReport;

public class SmokeTestRun  extends ExtentReport {
	
static WebDriver driver;

//	public static void main(String[] args) throws Exception {
//		
//		new BaseLogin().getLogin();
//		
//	}

@Test
public void smokeTest_LoginFunction_Positive() throws Throwable {
	
	new BaseLogin().getLogin();
	
	
}


}
