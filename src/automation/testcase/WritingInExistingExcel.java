package automation.testcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingInExistingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		//String FilePath ="C:/Mukesh/rep.xlsx";
		
		FileInputStream fin = new FileInputStream("C:/Mukesh/rep.xlsx");
		
		Workbook wb = WorkbookFactory.create(fin);
		
		Sheet sh = wb.getSheetAt(0);
		
		int lRow=sh.getLastRowNum();
					
		
		Row rw = sh.createRow(++lRow);
		
		Cell cl = rw.createCell(1);
		
		cl.setCellValue("THis is another line");
		fin.close();
		FileOutputStream fout = new FileOutputStream("C:/Mukesh/rep.xlsx");
		wb.write(fout);
		fout.close();
		
		System.out.println("Done");
		
	}

}
