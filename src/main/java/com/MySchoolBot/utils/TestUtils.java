package com.MySchoolBot.utils;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.extractor.XSSFImportFromXML;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.MySchoolBot.BaseClass.BaseClass;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import bsh.util.Util;

public class TestUtils extends BaseClass{
	public static long PageTimeLoad=20;
	public static long implicitywait=20;
	public static File file;
	public static FileOutputStream fo;
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static Row r;
	public static Cell cell;
	
	
	
	
	//WebElements Calling

	public static void ClickIntractedXpath(String Xpath) {
		driver.findElement(By.xpath(Xpath)).click();;
	}
	public static void IntractWithid(String id) {
		driver.findElement(By.id(id));
	}
	public static void IntractWithclassname(String classname) {
		driver.findElement(By.className(classname));
	}
	public static void IntractWithname(String name) {
		driver.findElement(By.name(name));
	}
	public static void IntractWithtagname(String tagname) {
		driver.findElement(By.tagName(tagname));
	}
	public static void IntractWithlinktext(String linktext) {
		driver.findElement(By.linkText(linktext));
	}
	public static void IntractWithPartialLinkText(String PartialLinkText) {
		driver.findElement(By.partialLinkText(PartialLinkText));
	}
	public static void GetAllLinks()
	{
		driver.findElements(By.tagName("a"));
	}
	//Working with Links
	
	
   public static void findnooflinks() {
	  List<WebElement> a=driver.findElements(By.tagName("a"));
	  System.out.println(a.size());
   }

   public static void printalllinks() {
	  List<WebElement> b=driver.findElements(By.tagName("a"));
	  for(int i=0;i<=b.size();i++) {
		  String b1=b.get(i).getText();
	  System.out.println(b1);
   }
   }
   // Creating Excel
   public static void CreateFile(String Filename, String SheetName) throws IOException  {
	   file= new File("G:\\pomframework\\OPMGoogle\\src\\test\\resources\\"+Filename+".xlsx");
	   FileOutputStream fo1=new FileOutputStream(file); 
	   FileInputStream fic= new FileInputStream(file);
	   XSSFWorkbook wbc= new XSSFWorkbook();
	   XSSFSheet sc=wbc.createSheet(SheetName);
	   FileOutputStream ffc=new FileOutputStream(file);
	  wbc.write(ffc);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   }
   
   //Writing Excel
   public static void WrirExcel(By values ,String FileName, String SheetName) throws IOException {
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 FileInputStream fir=new FileInputStream("G:\\pomframework\\OPMGoogle\\src\\test\\resources\\"+FileName+".xlsx");  
		 XSSFWorkbook wbr= new XSSFWorkbook(fir);
		  XSSFSheet sr=wbr.getSheet(SheetName);
		  List<WebElement> linksname=driver.findElements(values);
		  for(int i=0; i<linksname.size(); i++) {
			  String namesoflink=linksname.get(i).getText();
			  Row r=sr.createRow(i);
			  Cell cell=r.createCell(0);
			  cell.setCellValue(namesoflink);
			   }
		  
		  FileOutputStream forw=new FileOutputStream("G:\\pomframework\\OPMGoogle\\src\\test\\resources\\"+FileName+".xlsx");
			  wbr.write(forw);
		  }

   
   public static String ReadExcel(String PathOfExcel,String SheetName,int rownum, int cellnum) throws IOException {
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   FileInputStream fi=new FileInputStream(PathOfExcel);
	   XSSFWorkbook wb=new XSSFWorkbook(fi);
	   XSSFSheet ws=wb.getSheet(SheetName);
	   Row r=ws.getRow(rownum);
	 String val=   r.getCell(cellnum).getStringCellValue();
	 System.out.println(val);
	    return val;
   }
   
   public static void TakeScreenShoot(String NameOfScreenShoot) throws IOException {
	   TestUtils util=new TestUtils();
	   File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(file, new File("G:\\pomframework\\OPMGoogle\\ScreenShoots\\"+System.nanoTime()+NameOfScreenShoot+".png"));
   }
   public static void DropDownValuesPrintInExcel(String givexpath,String FilePath,String SheetName) throws IOException {
	   List<WebElement> Values= driver.findElements(By.tagName(givexpath));
	   for(int i=0; i<Values.size(); i++) {
		   String val= Values.get(i).getAttribute("name");
		   fi=new FileInputStream("G:\\pomframework\\OPMGoogle\\src\\test\\resources\\"+FilePath+".xlsx");
		   wb=new XSSFWorkbook(fi);
		   ws=wb.getSheet(SheetName);
		   r=ws.createRow(0);
		   cell=r.createCell(i);
		   cell.setCellValue(val);
		   fo=new FileOutputStream("G:\\pomframework\\OPMGoogle\\src\\test\\resources\\"+FilePath+".xlsx");
		   wb.write(fo);
	   }
   }
   
   public static void CurrentDate() {
	    SimpleDateFormat dateformate=new SimpleDateFormat("dd/mm/yyyy:hh:mm:ss");
	    Date date=new Date();
	 String currentdate=dateformate.format(date);
	System.out.print(currentdate);
		
	   
   }
   public static void Mouseover(String string) {
	   Actions action=new Actions(driver);
	   WebElement elemt=driver.findElement(By.xpath(string));
	   action.moveToElement(elemt).perform();
   }
	
   
   public static void CreateAlert(String Message) throws InterruptedException {
	   JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.confirm('"+Message+"');");
	Thread.sleep(1500);
		driver.switchTo().alert().accept();
		
   }
   
   public static void changecolor(WebElement element,WebDriver driver, String colour) {
	   JavascriptExecutor js=((JavascriptExecutor)driver);
	   js.executeScript("arguments[0].style.backgroundColor = '"+colour+"'", element);
	   try {
		   Thread.sleep(20);
	   }catch (InterruptedException e) {
		// TODO: handle exception
	}
   }
   
   public static void flash(WebElement element,WebDriver driver) {
	  // JavascriptExecutor js=((JavascriptExecutor)driver);
	   String bgcolor=element.getCssValue("backgroundColor");
	   for(int i=0;i<3;i++) {
		   changecolor(element, driver, "#000000");
		   changecolor(element, driver, "#7FFF00");
		   changecolor(element, driver, "#DC143C");
		   changecolor(element, driver, "#006400");
		   changecolor(element, driver, "#FFD700");
		   changecolor(element, driver, "#FFC0CB");
		   changecolor(element, driver, bgcolor);
	   }
   }

   public static void DrawBorder(WebElement element,WebDriver driver) {
	   JavascriptExecutor js=((JavascriptExecutor)driver);
	   js.executeScript("arguments[0].style.border='6px solid red'", element);
   }
   
   
   public static void MoveToElement(WebDriver driver, String xpath) {
	   WebElement value= driver.findElement(By.xpath(xpath));
	   JavascriptExecutor js=((JavascriptExecutor)driver);
	   js.executeScript("arguments[0].scrollIntoView(true);", value);
	   
   }
   
   public static void RefreshPage(WebDriver driver) {
	   JavascriptExecutor js= ((JavascriptExecutor)driver);
	   js.executeAsyncScript("history.go(0)");
   }
   
   public static void ClickElement(WebDriver driver,String xpath) {
	   WebElement value= driver.findElement(By.xpath(xpath));
	   JavascriptExecutor js=((JavascriptExecutor)driver);
	   js.executeScript("arguments[0].click();", value);
   }
   
   public static void DatePickerInWebpage(WebDriver driver, String Xpath, String DateValue) {
	   WebElement Value=driver.findElement(By.xpath(Xpath));
	   JavascriptExecutor js=((JavascriptExecutor)driver);
	   js.executeScript("arguments[0].setAttribut('value','"+DateValue+"');", Value);
	   
   }
   
   public static void SelectDropDownValue(WebDriver driver, String Xpath, String SelectedValue) {
	   WebElement dropdown = driver.findElement(By.xpath(Xpath));
	   if(dropdown.isEnabled() && dropdown.isDisplayed()) 
	   { 
	     System.out.println("Dropdown is enabled and visible"); 
	   } 
	  else { 
	      System.out.println("Dropdown is not visible"); 
	  } 
	   Select select = new Select(dropdown);
	   if(select.isMultiple()) 
	   { 
	     System.out.println("Dropdown list accepts multiple choices"); 
	   } 
	  else { 
	     System.out.println("Dropdown list does not accept multiple choices"); 
	  }
	   int listSize = select.getOptions().size(); 
	   System.out.println("List size: " +listSize);
	   select.selectByVisibleText(SelectedValue); 
	   
   }

}