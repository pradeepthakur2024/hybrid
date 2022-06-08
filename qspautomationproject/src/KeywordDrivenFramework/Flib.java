package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class Flib {

	public String readExcelData(String excelPath, String sheetName, int rowcount, int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		
		Workbook wb = WorkbookFactory.create(fis);

	Sheet sh = wb.getSheet(sheetName);
	      Row row	= sh.getRow(rowcount);
		org.apache.poi.ss.usermodel.Cell Cell = row.getCell(cellcount);
		    String data = Cell.getStringCellValue();
		
		return data;
		
		
		
		
		
	}
	
	
	public int getrowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;
	
	}
}
	
