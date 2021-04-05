package com.MySchoolBot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MySchoolBot.utils.TestUtils;

public class Frontofficeaddvisitorbook {
	  
		WebDriver driver;
		public TestUtils util=new TestUtils();
		
		@FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[1]/select")
		WebElement visitpurpose;
		@FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[2]/input")
		WebElement visitname;
	    @FindBy (xpath = "//*[@id=\"form1\"]/div[1]/div[3]/input")
	    WebElement visitphone;
	    @FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[4]/input")
	    WebElement visitidcard;
	    @FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[5]/input")
	    WebElement visitpersons;
	    @FindBy(xpath = "//*[@id=\"date\"]")
	    WebElement visitdate;
	    @FindBy (xpath = "//*[@id=\"stime_\"]")
	    WebElement visitintime;
	    @FindBy(xpath = "//*[@id=\"stime_\"]")
	    WebElement visitouttime;
	    @FindBy(xpath = "//*[@id=\"description\"]")
        WebElement visitnote;	
        @FindBy (xpath = "//*[@id=\"form1\"]/div[1]/div[10]/div/div/input")
	    WebElement visitattachocuments;
	    @FindBy(xpath = "//*[@id=\"form1\"]/div[2]/button")
	    WebElement visitsave;
	    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_filter\"]/label/input")
	    WebElement visitsearch;
	    @FindBy(xpath = "\"//*[@id=\\\"DataTables_Table_0_wrapper\\\"]/div[1]/a[1]")
	    WebElement visitcopy;
	    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/a[2]")
	    WebElement visitexcel;
	    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/a[3]")
	    WebElement visitcsv;
	    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/a[4]")
	    WebElement visitpdf;
	    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/a[5]")
	    WebElement visitprint; 
	    @FindBy(xpath = "//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/a[6]")
	    WebElement visitcolumns;
	    
	    
	    

	    
	    public Frontofficeaddvisitorbook(WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	   
	    	}	
	    
	    
	    
	    
	    
	    
	    
	    
}
