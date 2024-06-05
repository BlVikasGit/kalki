package datadriven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	//getLastRowNum() is used to get the index of last row containing data in a Sheet
//	int lastRow = wb.getSheet("multipleData").getLastRowNum();
//	for(int i=0;i<=lastRow;i++) {
//		String data = wb.getSheet("multipleData").getRow(i).getCell(0).getStringCellValue();
//		System.out.println(data);
//	}
	//getLastCellNum() is used to get the count of last cell containing data in a Row
//	int lastCell = wb.getSheet("multipleData").getRow(0).getLastCellNum();
//	for(int i=0;i<lastCell;i++) {
//		String data = wb.getSheet("multipleData").getRow(0).getCell(i).getStringCellValue();
//		System.out.println(data);
//	}
	int lastrow = wb.getSheet("multipledata").getLastRowNum();
	for(int i=0;i<=lastrow;i++) {
		int lastcell=wb.getSheet("multipledata").getRow(i).getLastCellNum();
		for(int j=0;j<lastcell;j++) {
			String data = wb.getSheet("multipleData").getRow(i).getCell(j).getStringCellValue();
			System.out.print(data+" ");
		}
		System.out.println();
	}
}
}
