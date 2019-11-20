package automation.datadriverntesting;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;

import org.apache.commons.logging.LogFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SharePrice {
	
	
	WebDriver ch= null;
	String[][] extData= null;
	Object[][] td =null;
	int rowCount ;
	int colCount;

	ArrayList<String> cname=null;
	ArrayList<String> price=null;
	
	@DataProvider(name="td1")
	public  Object[][] getData(){
		
		try {
			String file ="C:/Users/mukesh.kumar1/Desktop/om/New folder/car/Funds and Companies .xlsx";
			FileInputStream testDataExcel = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(testDataExcel);
			XSSFSheet sh = wb.getSheet("Sheet10");
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
				//	System.out.print(callValue);
				//	System.out.print("   |  ");
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

	static int i=1;
	String compname =null;
	
	@BeforeClass
	public void inint() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:/Users/mukesh.kumar1/workspace/SeleniumAutomation/browserexe/chromedriver.exe");
	   // ch = new ChromeDriver();
		LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog"); //Line 80 -82 is to off the logger
		//java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF); 
		//java.util.logging.Logger.getLogger("org.apache.commons.httpclient").setLevel(Level.OFF);
		 ch = new HtmlUnitDriver(true);
	    ch.get("http://money.rediff.com/index.html");
	     cname = new ArrayList<String>();
	     price = new ArrayList<String>();
	  
	}
	
	@Test(dataProvider="td1")
	public void testcase(String companyName) throws InterruptedException
	{
		
		try{
		//ch.switchTo().frame("logwatch");
		//System.out.println(ch.getPageSource());
		compname =companyName;
		ch.findElement(By.id("srchword")).clear();
		ch.findElement(By.id("srchword")).sendKeys(companyName);
		compname =companyName;
		//ch.findElement(By.id("srchword")).sendKeys(Keys.TAB);
		//Thread.sleep(2000);
		ch.findElement(By.xpath("//*[@id='queryTop']/div/div[3]/div/input")).click();
		Thread.sleep(2000);
		String shareprice = ch.findElement(By.id("ltpid")).getText();
		System.out.println(companyName +" |  "+shareprice);
	//	cname.add(companyName);
		//price.add(shareprice);
		
		i++;
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println(" Errro for company "+compname  +"in row "+i);
			i++;
		}
		
	}
	
	@AfterTest
	public void writeExcel()
	{
		
	//	WriringExcel.excelWrite(cname, price);
	//	System.out.println("Done");
		
	}
	
}
