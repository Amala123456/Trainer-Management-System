package com.script;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Trainerconstants.Trainermngmtconstants;
import com.trainermanagement.LoginPage;
import com.trainermngmt.utility.ExcelUtility;

public class InvalidTestClass extends TestBase {
LoginPage objLogin;




@Test(priority=1)
public void verifyInValidLogin8() throws IOException, InterruptedException {
//Create Login Page object
objLogin = new LoginPage(driver);

//login to application
objLogin.clicklogin();
String NoEmail = ExcelUtility.getCellData(9,0);
String NoPassword = ExcelUtility.getCellData(9,1);

objLogin.setEmail(NoEmail);
objLogin.setPassword(NoPassword);

boolean actualResult =objLogin.SigninAssertion();
Assert.assertEquals(actualResult, false);
//objLogin.clicksignin();

String expectedMessage=Trainermngmtconstants.Error3;
String actualMessage=objLogin.invalidem.getText();
Assert.assertEquals(expectedMessage,actualMessage);


}



@Test(priority=2)
public void verifyInValidLogin1() throws IOException, InterruptedException {
//Create Login Page object
objLogin = new LoginPage(driver);


//login to application

String ValidEmail = ExcelUtility.getCellData(2,0);
String InValidPassword = ExcelUtility.getCellData(2,1);

objLogin.clicklogin();
objLogin.setEmail(ValidEmail);
objLogin.setPassword(InValidPassword);

boolean actualResult =objLogin.SigninAssertion();
Assert.assertEquals(actualResult, true);



objLogin.clicksignin();

String expectedMessage=Trainermngmtconstants.Error;
String actualMessage=objLogin.invalids.getText();
Assert.assertEquals(expectedMessage,actualMessage);



}
	


	@Test(priority=3)
    public void verifyInValidLogin2() throws IOException, InterruptedException {
    //Create Login Page object
    objLogin = new LoginPage(driver);

    //login to application
	String InValidEmail = ExcelUtility.getCellData(3,0);
    String ValidPassword = ExcelUtility.getCellData(3,1);
    	
    objLogin.clicklogin();
    objLogin.setEmail(InValidEmail);
    objLogin.setPassword(ValidPassword);
    
    boolean actualResult =objLogin.SigninAssertion();
    Assert.assertEquals(actualResult, true);
    
    objLogin.clicksignin();
   
    
    String expectedMessage=Trainermngmtconstants.Error;
    String actualMessage=objLogin.invalids.getText();
    Assert.assertEquals(expectedMessage,actualMessage);
   
    }
	
	
	
	
	@Test(priority=4)
    public void verifyInValidLogin3() throws IOException, InterruptedException {
    //Create Login Page object
    objLogin = new LoginPage(driver);

    //login to application
	String InValidEmail = ExcelUtility.getCellData(4,0);
	String InValidPassword = ExcelUtility.getCellData(4,1);
    objLogin.clicklogin();
    objLogin.setEmail(InValidEmail);
    objLogin.setPassword(InValidPassword);
    
    boolean actualResult =objLogin.SigninAssertion();
    Assert.assertEquals(actualResult, true);
    
    objLogin.clicksignin();
    
    String expectedMessage=Trainermngmtconstants.Error;
    String actualMessage=objLogin.invalids.getText();
    Assert.assertEquals(expectedMessage,actualMessage);
   
    }
	
}


