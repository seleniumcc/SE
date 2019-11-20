package pack3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelRes {

	public static void main(String[] args) throws IOException {


		File exlFile = new File("../BulkUserUpload/result/res.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh =wb.createSheet("BulkUploadResult");
		
		for(int i=0;i<5;i++)
		{
			XSSFRow rw = sh.createRow(i);
			XSSFCell cl0 =rw.createCell(0);
			XSSFCell cl1 =rw.createCell(1);
			XSSFCell cl2 =rw.createCell(2);
			
			cl0.setCellValue("A"+i);
			cl1.setCellValue("B"+i);
			cl2.setCellValue("Pass");
			
			
		}
		FileOutputStream fout = new FileOutputStream(exlFile);
		wb.write(fout);
		wb.close();
		System.out.println("Done");
		
		
		

	}

}
