package automation.testcase;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingInExcel {
	
	public static void main(String args[]) throws IOException{
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sh = wb.createSheet("ResultSheet");
		
		Row rw = sh.createRow(0);
		Cell cl = rw.createCell(0);
		
		cl.setCellValue("This is By writing data");
		
		FileOutputStream fout = new FileOutputStream("C:/Mukesh/rep.xlsx");
		wb.write(fout);
		wb.close();
		System.out.println("Done");
		
		
		
	}

}
