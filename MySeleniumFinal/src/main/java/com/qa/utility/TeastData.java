package com.qa.utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.qa.TestBase.Testbase;



public class TeastData extends Testbase{

	public String seniorCode(int r, int c) throws IOException
	{
		String path = "C:\\Users\\shriniwas shete\\Desktop\\boi\\MySeleniumFinal\\exexlesheet\\Teastdata.xlsx";
		
	
		
		//Create a object File 
		File file = new File(path);
		//Create a object File INput Stream 
		FileInputStream fis = new FileInputStream(file); 
		//create a obkject for XSSFworkBook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//Create a object Sheet 
		XSSFSheet sheet = wb.getSheetAt(0);
		//row
		XSSFRow row = sheet.getRow(r);
		//column
		String data0 = row.getCell(c).getStringCellValue();
		return data0;
	
		
	}
	public String juniorCode (int row, int col) throws EncryptedDocumentException, IOException {
		String path1 = "C:\\Users\\shriniwas shete\\Desktop\\boi\\MySeleniumFinal\\exexlesheet\\Teastdata.xlsx";
		FileInputStream f = new FileInputStream(path1);
		String name= WorkbookFactory.create(f).getSheet("Sheet1").getRow(row).getCell(col).getStringCellValue();
		System.out.println(name);
		return name;
	}
	
	
}


