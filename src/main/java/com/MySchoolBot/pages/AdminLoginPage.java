package com.MySchoolBot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MySchoolBot.BaseClass.BaseClass;
import com.MySchoolBot.utils.TestUtils;

public class AdminLoginPage extends BaseClass {
	WebDriver driver;
	public TestUtils util=new TestUtils();
	@FindBy(xpath="//*[@id=\"form-username\"]")
	WebElement Userid;
	@FindBy(xpath="//*[@id=\"form-password\"]")
	WebElement Password;
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div[2]/form/button")
	WebElement SginIn;
	@FindBy(xpath="/html/body/div/div/div/div/div/div/div/div[2]/a")
	WebElement ForgotPassword;


public AdminLoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void login() {
	util.DrawBorder(Userid, driver);
	util.flash(Userid, driver);
	Userid.sendKeys(prop.getProperty("username"));
	util.DrawBorder(Password, driver);
	util.flash(Password, driver);
	Password.sendKeys(prop.getProperty("password"));
	util.DrawBorder(SginIn, driver);
	util.flash(SginIn, driver);
	SginIn.click();
}
public  void  checkforgotbutton() {
	ForgotPassword.click();
	String ActURL=driver.getCurrentUrl();
	if(ActURL.equals(prop.getProperty("forgotpage"))) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
	
}
}