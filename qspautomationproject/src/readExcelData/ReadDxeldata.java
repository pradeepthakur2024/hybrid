package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ReadDxeldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
		
	         FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");
	   Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet("Sheet1");
	   Row row =sh.getRow(1);  
	   org.apache.poi.ss.usermodel.Cell cell  =  row.getCell(1);
	       String data  = cell.getStringCellValue();
	       System.out.println(data);
	         
	         
	         
	}

}
