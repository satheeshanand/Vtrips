package com.MySchoolBot.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MySchoolBot.utils.TestUtils;

public class Frontofficeadminenquiry {
	
	  
	WebDriver driver;
	public TestUtils util=new TestUtils();
	@FindBy(xpath ="//*[@id=\"enquiry_date\"]")
    WebElement eqdate;
	@FindBy(xpath = "//*[@id=\"source\"]")
	WebElement admeqsource;
	@FindBy(xpath="//*[@id=\"status\"]")
	WebElement admstatus;
    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/form/div/div[4]/div/button")
    WebElement admcritsearch;
    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[3]/div/div[1]/div/button")
    WebElement admadd;
	@FindBy(xpath = "//*[@id=\"name_add\"]")
	WebElement admname;
	@FindBy(xpath = "//*[@id=\"number\"]")
	WebElement admphone;
	@FindBy(xpath = "//*[@id=\"formadd\"]/div/div[3]/div/input")
	WebElement admemail;
	@FindBy(xpath = "//*[@id=\"formadd\"]/div/div[4]/div/textarea")
	WebElement admaddress;
	@FindBy(xpath = "//*[@id=\"formadd\"]/div/div[5]/div/textarea")
	WebElement admdescription;
	@FindBy(xpath = "//*[@id=\"formadd\"]/div/div[6]/div/textarea")
	WebElement admnote;
	@FindBy(xpath = "//*[@id=\"date\"]")
	WebElement admdate;
	@FindBy(xpath = "//*[@id=\"date_of_call\"]")
	WebElement admnextdate;
	@FindBy(xpath = "//*[@id=\"formadd\"]/div/div[9]/div/input")
	WebElement admassigned;
	@FindBy(xpath = "//*[@id=\"formadd\"]/div/div[10]/div/select")
	WebElement admreference;
	@FindBy (xpath = "//*[@id=\"formadd\"]/div/div[11]/div/select")
	WebElement admsource;
	@FindBy (xpath = "//*[@id=\"formadd\"]/div/div[12]/div/select")
	WebElement admclass;
	@FindBy(xpath = "//*[@id=\"formadd\"]/div/div[13]/div/input")
	WebElement admnofchild;
	@FindBy (xpath = "//*[@id=\"myModal\"]/div/div/div[2]/div[2]/div/a")
	WebElement admsave;
	@FindBy(xpath = "//*[@id=\"enquirytable_filter\"]/label/input")
	WebElement admeqsearch;
    @FindBy (xpath = "//*[@id=\"enquirytable_wrapper\"]/div[1]/a[1]/span")	
    WebElement admeqcopy;
	@FindBy (xpath = "//*[@id=\"enquirytable_wrapper\"]/div[1]/a[2]")
	WebElement admeqexcel;
	@FindBy (xpath = "//*[@id=\"enquirytable_wrapper\"]/div[1]/a[3]")
	WebElement admeqcsv;
	@FindBy (xpath = "//*[@id=\"enquirytable_wrapper\"]/div[1]/a[4]")
	WebElement admeqpdf;
    @FindBy (xpath = "//*[@id=\"enquirytable_wrapper\"]/div[1]/a[5]")
    WebElement admeqprint;
    @FindBy(xpath = "//*[@id=\"enquirytable_wrapper\"]/div[1]/a[6]")
    WebElement admeqcolumns;

    
    public Frontofficeadminenquiry(WebDriver driver) {
    this.driver=driver;
    PageFactory.initElements(driver, this);
   
    	}	
    
  
    }
    
    

























