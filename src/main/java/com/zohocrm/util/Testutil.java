package com.zohocrm.util;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.zohocrm.baseclass.Testbase;

public class Testutil extends Testbase {
	 

	public Testutil() throws Exception {
		super();
	}

	public static long IMPLICIT_WAIT = 20;
	
	public static String TEST_DATA_SHEETPATH = "C:\\Users\\win10\\workspace\\pomzoho\\src\\main\\java\\com\\zohocrm\\testdata\\datadrivenleads.xlsx";
	static Workbook book;
	static Sheet sheet;
	
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try{
			file = new FileInputStream(TEST_DATA_SHEETPATH);
			}catch(FileNotFoundException e){
				e.printStackTrace();	
			}
		try{
			book = WorkbookFactory.create(file);
			}catch(InvalidFormatException e){
				e.printStackTrace();
			}catch(IOException e ){
				e.printStackTrace();
			}
		
		sheet= book.getSheet(sheetName);
		Object[][]data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i = 0;i<sheet.getLastRowNum();i++){
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++){
				data[i][k]= sheet.getRow(i=1).getCell(k).toString();
			}
			}
		
		return data;
		
	}
	
	
	 
	 
	 
}
