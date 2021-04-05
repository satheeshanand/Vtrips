package com.MySchoolBot.testingpages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.MySchoolBot.BaseClass.BaseClass;
import com.MySchoolBot.pages.AdminLoginPage;
import com.MySchoolBot.utils.TestUtils;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class TestFirstPage extends BaseClass {
	static TestUtils util;
	AdminLoginPage adminloginpage;
	
	ATUTestRecorder record;
	@BeforeTest
	public void BrowserOpen() throws ATUTestRecorderException, InterruptedException {
		openbrowser();
		util.CreateAlert("Browser open");

	}
	
	
	@Test
	public void logpage() throws IOException, ATUTestRecorderException, InterruptedException {
		util= new TestUtils();
		adminloginpage=new AdminLoginPage(driver);
		 record = new ATUTestRecorder("G:\\pomframework\\OPMGoogle\\recordings\\","MySchoolBot",false);
		record.start();
		util.CreateAlert("Recording Started");
		
		
		adminloginpage.login();
		util.ClickElement(driver, "//*[@id=\"sibe-box\"]/ul[2]/li[1]/a");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		util.MoveToElement(driver, "//*[@id=\"sibe-box\"]/ul[2]/li[11]/a");
		util.ClickElement(driver, "//*[@id=\"sibe-box\"]/ul[2]/li[4]/a/span");
		util.ClickElement(driver, "//*[@id=\"sibe-box\"]/ul[2]/li[4]/ul/li[1]/a");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		util.ClickElement(driver,"/html/body/div[4]/div[1]/table/tbody/tr[5]/td[5]" );
		util.CreateAlert("Recording End");
		record.stop();
		
	}
	
	
	@AfterTest
	public void CloseBrowser() throws InterruptedException {
		util.CreateAlert("Browser Closing");
		//driver.close();
	}

}
