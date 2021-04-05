package com.MySchoolBot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MySchoolBot.utils.TestUtils;

public class Frontofficephonecalllog {
		  
			WebDriver driver;
			public TestUtils util=new TestUtils();
	
			@FindBy(xpath = "//*[@id='form1']/div[1]/div[1]/input")
			WebElement phonecallname;
			@FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[2]/input")
			WebElement phonecallphone;
			@FindBy(xpath = "//*[@id=\"date\"]")
			WebElement phonedate;
			@FindBy(xpath = "//*[@id=\"description\"]")
	        WebElement phonedescription;
			@FindBy(xpath = "//*[@id=\"follow_up_date\"]")
			WebElement phonefollowup;
			@FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[6]/input")
			WebElement phoneduration;
			@FindBy(xpath = "//*[@id=\"description\"]")
			WebElement phonenote;
			@FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[8]/label[2]")
			WebElement phonecallincoming;
			@FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[8]/label[3]")
			WebElement phonecalloutgoing;
			@FindBy(xpath =" //*[@id=\"form1\"]/div[2]/button")
			WebElement phonesave;
			@FindBy(xpath = "//*[@id=\"DataTables_Table_0_filter\"]/label/input")
			WebElement phonesearch;
			@FindBy(xpath = "//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/a[1]")
			WebElement phonecopy;
			@FindBy(xpath = "//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/a[2]")
			WebElement phoneexcel;
			@FindBy(xpath = "//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/a[3]")
			WebElement phonecsv;
			@FindBy(xpath = "//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/a[4]")
			WebElement phonepdf;
			@FindBy(xpath = "//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/a[5]")
			WebElement phoneprint;
			@FindBy(xpath = "//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/a[6]")
			WebElement phonecolumns;
			@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/a[1]")
			WebElement phoneview;
			@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/a[2]")
			WebElement phoneedit;
			@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/a[3]")
			WebElement delete;
			
			
			
		    public Frontofficephonecalllog(WebDriver driver) {
		    this.driver=driver;
		    PageFactory.initElements(driver, this);
}

		    
}