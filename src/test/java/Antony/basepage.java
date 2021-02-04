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




}