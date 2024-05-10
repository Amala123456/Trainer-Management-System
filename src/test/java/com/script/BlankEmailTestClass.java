package com.script;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Trainerconstants.Trainermngmtconstants;
import com.trainermanagement.LoginPage;
import com.trainermngmt.utility.ExcelUtility;

public class BlankEmailTestClass extends TestBase {
LoginPage objLogin;

	

@Test(priority=1)
public void verifyInValidLogin6() throws InterruptedException, IOException {
//Create Login Page object
objLogin = new LoginPage(driver);

//login to application
 
 String ValidPassword = ExcelUtility.getCellData(7,1);
 String NoEmail = ExcelUtility.getCellData(7,0);
  objLogin.clicklogin();
    
    objLogin.setPassword(ValidPassword);
    objLogin.setEmail(NoEmail);
    
    
   
 
   
   boolean actualResult =objLogin.SigninAssertion();
    Assert.assertEquals(actualResult, false);
    //objLogin.clicksignin();
    
    
    
    
    }



@Test(priority=2)
public void verifyInValidLogin7() throws IOException, InterruptedException {
//Create Login Page object
objLogin = new LoginPage(driver);
//login to application
 String NoEmail = ExcelUtility.getCellData(8,0);
 String InValidPassword = ExcelUtility.getCellData(8,1); 
    objLogin.clicklogin();
    objLogin.setEmail(NoEmail);
    objLogin.setPassword(InValidPassword);
    boolean actualResult =objLogin.SigninAssertion();
    Assert.assertEquals(actualResult, false);
 
    
    String expectedMessage=Trainermngmtconstants.Error3;
    String actualMessage=objLogin.invalidem.getText();
	Assert.assertEquals(expectedMessage,actualMessage);
	    
  
    }



}
