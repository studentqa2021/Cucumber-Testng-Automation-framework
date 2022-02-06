package com.smoke.test;


import org.testng.annotations.Test;

import com.generic.BaseLogin;
import com.report.ExtentReportAutomation;


public class SmokeTestRun  extends ExtentReportAutomation {


	@Test
	public void smoke_Test_Login_Function_Positive() throws Throwable {
		new BaseLogin().getLogin();
	}
	


}
