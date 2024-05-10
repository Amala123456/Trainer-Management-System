package com.script;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Trainerconstants.Trainermngmtconstants;
import com.trainermanagement.Adminlogout;
import com.trainermanagement.Allocate1;
import com.trainermanagement.Approve1;

import com.trainermanagement.LoginPage;
import com.trainermanagement.MyAllocDetails;
import com.trainermanagement.Reject1;
import com.trainermanagement.Trainerlogout;
import com.trainermanagement.ViewAlloc;
import com.trainermngmt.utility.ExcelUtility;

public class ValidTestClass extends TestBase{
	
	LoginPage objLogin;
	
	MyAllocDetails objmyalloc;
	Trainerlogout objtrainlogout;
	ViewAlloc objview;
	Adminlogout objadlogout;
	Approve1 objapprove;
	Reject1 objrej;
	Allocate1 objalloc;	
			
			
			
			
			@Test(priority=1)
		    public void verifyAdminValidLogin() throws IOException, InterruptedException {
		    //Create Login Page object
		    objLogin = new LoginPage(driver);
		    
		    
		    //login to application
		    String ValidEmail = ExcelUtility.getCellData(1,0);
		    String ValidPassword = ExcelUtility.getCellData(1,1);
		    objLogin.clicklogin();
		    
		    String expectedurl4 =Trainermngmtconstants.url4;
		    String actualurl4 =driver.getCurrentUrl();
		    Assert.assertEquals(expectedurl4,actualurl4);
		    
		    objLogin.setEmail(ValidEmail);
		    objLogin.setPassword(ValidPassword);
		    
		    boolean actualResult =objLogin.SigninAssertion();
		    Assert.assertEquals(actualResult, true);
		    
		    objLogin.clicksignin();
		    Thread.sleep(4000);
		    
		   String expectedurl5 =Trainermngmtconstants.url5;
		   String actualurl5 =driver.getCurrentUrl();
		   Assert.assertEquals(expectedurl5,actualurl5);
		   Thread.sleep(4000);
		    
		    
		    objapprove=new Approve1(driver);
		    boolean actualResult1 =objapprove.ApproveAssertion();
		    Assert.assertEquals(actualResult1, true);
		    objapprove.clickapprove();
		    Thread.sleep(4000);
		    
		    objrej=new Reject1(driver);
		    boolean actualResult2 =objrej.RejectAssertion();
		    Assert.assertEquals(actualResult2, true);
		    objrej.clickreject();
		    Thread.sleep(4000);
		    
		    
		    
		    objalloc=new Allocate1(driver);
		    objalloc.clickallocate();
		    Thread.sleep(4000);
		    String expectedurl6 =Trainermngmtconstants.url6;
		    String actualurl6 =driver.getCurrentUrl();
		    Assert.assertEquals(expectedurl6,actualurl6);
		    
		    
		    objalloc=new Allocate1(driver);
		    boolean actualResult3 =objalloc.AllocAssertion();
		    Assert.assertEquals(actualResult3, true);
		    objalloc.clickAllocate();
		    Thread.sleep(4000);
		    
		    objview = new ViewAlloc(driver);
		    objview.clickviewalloc();
		    Thread.sleep(4000);
		    String expectedurl1 =Trainermngmtconstants.url1;
		    String actualurl1 =driver.getCurrentUrl();
		    Assert.assertEquals(expectedurl1,actualurl1);

		    objview.clicksearch();
		    Thread.sleep(4000);

		    objadlogout = new Adminlogout(driver);
		    objadlogout.clicklogout();
		    Thread.sleep(4000);
		    
		    
		    String expectedurl2 =Trainermngmtconstants.url;
		    String actualurl2 =driver.getCurrentUrl();
		    Assert.assertEquals(expectedurl2,actualurl2);
		 
		    }
			
			
			@Test(priority=2)
			public void verifyTrainerValidLogin() throws IOException, Exception {
			//Create Login Page object
			objLogin = new LoginPage(driver);



			//login to application
			String Email = ExcelUtility.getCellData(0,0);
			String Password = ExcelUtility.getCellData(0,1);
			objLogin.clicklogin();
			Thread.sleep(4000);


			String expectedurl4 =Trainermngmtconstants.url4;
			String actualurl4 =driver.getCurrentUrl();
			Assert.assertEquals(expectedurl4,actualurl4);

			objLogin.setEmail(Email);
			objLogin.setPassword(Password);



			boolean actualResult =objLogin.SigninAssertion();
			Assert.assertEquals(actualResult, true);
            objLogin.clicksignin();
            Thread.sleep(4000);

			String expectedurl2 =Trainermngmtconstants.url2;
			String actualurl2=driver.getCurrentUrl();
			Assert.assertEquals(expectedurl2,actualurl2);
			Thread.sleep(4000);



			objmyalloc= new MyAllocDetails(driver);
			objmyalloc.clickmyalloc();
			driver.navigate().refresh();
			Thread.sleep(4000);



			String expectedurl3 =Trainermngmtconstants.url3;
			String actualurl3 =driver.getCurrentUrl();
			Assert.assertEquals(expectedurl3,actualurl3);


			objtrainlogout=new Trainerlogout(driver);
			objtrainlogout.clicktrainerlogout();
			Thread.sleep(4000);

			 String expectedurl22 =Trainermngmtconstants.url;
			 String actualurl22 =driver.getCurrentUrl();
			 Assert.assertEquals(expectedurl22,actualurl22);

			}


			
			
			

		}

		    
			
			
			
			
		
			
			
			

	

