package automation.datadriverntesting;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTests {
	
	
	WebDriver ch= null;
	
	/*@Test
	public void FDCalculate()
	{
		
	}*/
	@DataProvider(name="login")
	public Object[][] logingTestData()
	{
		/*Object[][] td = new Object[3][2];
		td[0][0]="incorrectUserName";
		td[0][1]="Correctpassword";
		td[1][0]="CorrentuserName";
		td[1][1]="Incorrectpassword";
		td[2][0]="CorrentuserName";
		td[2][1]="Incorrectpassword";*/
		// Read the data from Excel
		Object[][] td =ReadingExcel.getExcelData();
		return td;
		
		
	}
	@Test(dataProvider="login")
	public void Login(String FirstParameterAsUserName,String secountparameterAspassword) throws InterruptedException
	{
		System.out.println( FirstParameterAsUserName);
		System.out.println( secountparameterAspassword);
		//Steps of Login
		ch.findElement(By.name("userName")).clear();
		ch.findElement(By.name("password")).clear();
		ch.findElement(By.name("userName")).sendKeys(FirstParameterAsUserName);
		ch.findElement(By.name("password")).sendKeys(secountparameterAspassword);
		Thread.sleep(3000);
		ch.findElement(By.name("login")).click();
	}
	@BeforeClass
	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/mukesh.kumar1/workspace/SeleniumAutomation/browserexe/chromedriver.exe");
	    ch = new ChromeDriver();
	    ch.get("http://newtours.demoaut.com/");
	}
	
	

}
