package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a generic class for reading , writing data from property and excel file
 * @author QSP */
public class FileLib {	/**
	 * This is a generic method to read the data from property file
	 * @param key						 @return The value associated with the specified key name in the property file
	 * @throws IOException
	 */public String readDataFromProperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;}/**
	 * This is a generic method to read data from excel file
	 * @param sheetName  @param row @param cell
	 * @return It will return the String data present in the specified sheet, row, cell in the excel file
	 * @throws EncryptedDocumentException					@throws IOException
	 */	public String readDataFromExcel(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;}	/**
	 * This is a generic method to write data into excel file
	 * @param sheetName			 @param row			 @param cell		 @param value
	 * @throws EncryptedDocumentException			@throws IOException
	 */	public void writeDataIntoExcel(String sheetName,int row,int cell,String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
	}
}
