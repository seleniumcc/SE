package automation.datadriverntesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
	public static Object[][] getExcelData(){
		Object[][] td =null;
		try {
			FileInputStream testDataExcel = new FileInputStream("C:/Users/mukesh.kumar1/workspace/SeleniumAutomation/testData/LoginTestData.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(testDataExcel);
			XSSFSheet sh = wb.getSheet("Sheet1");
			XSSFCell cl =null;
			int rowCount = sh.getPhysicalNumberOfRows(); 
			int colCount = sh.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Total number of active rows in XL is  "+rowCount);
			System.out.println("Total number of active col in XL is  "+colCount);
			td = new Object[rowCount-1][colCount];
			for( int i =1;i<rowCount;i++)
			{			
				for(int j=0;j<colCount;j++)
				{
					cl=sh.getRow(i).getCell(j);
					String callValue = cl.getStringCellValue();
					td[i-1][j]=callValue ;
					System.out.print(callValue);
					System.out.print("   |  ");
				}
				System.out.println("");
			}
				wb.close();
				 testDataExcel.close();
		
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return td;
	}

}
