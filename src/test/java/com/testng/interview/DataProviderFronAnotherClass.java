package com.testng.interview;

import org.testng.annotations.Test;

public class DataProviderFronAnotherClass {
	
	
	  @Test (dataProvider = "loginCredential",dataProviderClass = DataProviderFromSameClass.class)
	    public void testCase3(String a,String b) {
	       
	    }

}
