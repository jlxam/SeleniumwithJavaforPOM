package Antony;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class basepage {

    public void sendkeys(WebElement s,String value)

    {

                   s.sendKeys(value);

    }
    
    
    
    public void Click(WebElement s)

    {

                   s.click();

    }
    
    
    
    

    String username()
    {
    	
		  File src=new File("D:\\antony.j\\eclipse-workspace\\Seleniumbasicpgm\\src\\test\\resources\\Excel.xlsx");
		 
		   FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 
		 
		   XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		 
		      XSSFSheet sh1= wb.getSheetAt(0);
		      String username=sh1.getRow(1).getCell(0).getStringCellValue();
		 return username;
	 
		  
	 }
    
    
    String url()
    {
    	
		  File src=new File("D:\\antony.j\\eclipse-workspace\\Seleniumbasicpgm\\src\\test\\resources\\Excel.xlsx");
		 
		   FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 
		 
		   XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		 
		      XSSFSheet sh1= wb.getSheetAt(0);
		      String url=sh1.getRow(1).getCell(2).getStringCellValue();
		 return url;
	 
		  
	 }
    
    
    String usernam()
    {
    	
		  File src=new File("D:\\antony.j\\eclipse-workspace\\Seleniumbasicpgm\\src\\test\\resources\\Excel.xlsx");
		 
		   FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 
		 
		   XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		 
		      XSSFSheet sh1= wb.getSheetAt(0);
		      String usernam=sh1.getRow(1).getCell(0).getStringCellValue();
		 return usernam;
	 
		  
	 }
    
    
    String password()
    {
    	
		  File src=new File("D:\\antony.j\\eclipse-workspace\\Seleniumbasicpgm\\src\\test\\resources\\Excel.xlsx");
		 
		   FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 
		 
		   XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		 
		      XSSFSheet sh1= wb.getSheetAt(0);
		      String password=sh1.getRow(1).getCell(1).getStringCellValue();
		 return password;
	 
		  
	 } 
    
    
    String dashurl()
    {
    	
		  File src=new File("D:\\antony.j\\eclipse-workspace\\Seleniumbasicpgm\\src\\test\\resources\\Excel.xlsx");
		 
		   FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 
		 
		   XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		 
		      XSSFSheet sh1= wb.getSheetAt(0);
		      String dashurl=sh1.getRow(1).getCell(3).getStringCellValue();
		 return dashurl;
	 
		  
	 } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    




}