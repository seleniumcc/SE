package automation.datadriverntesting;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriringExcel {

		public static void excelWrite(ArrayList<String> comp,ArrayList<String> price){
		DateFormat dateFormat = new SimpleDateFormat("ddMMyy_HH_mm");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43		
		XSSFWorkbook workbook = new XSSFWorkbook();        
        //Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Share Prices");       
        System.out.println(comp.size());
        System.out.println(price.size());
        for(int rownum = 0;rownum<comp.size();rownum++)
        {
        	Row row = sheet.createRow(rownum);
          
            Cell cellcompany = row.createCell(0);
            Cell cellprice = row.createCell(1);
            cellcompany.setCellValue(comp.get(rownum));
            cellprice.setCellValue(price.get(rownum));
                	
        }		
        try
        {
        	String respath="C:/Users/mukesh.kumar1/workspace/SeleniumAutomation/results/Res_"+dateFormat.format(date)+".xlsx";
            FileOutputStream out = new FileOutputStream(new File(respath));
            workbook.write(out);
            out.close();
            System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

	}

}
