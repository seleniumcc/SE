package pack3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;


public class BulkUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String adGroup="S-U-SP-MercuryFinanceGSS";
		String fileName ="Book2"+".xlsx";
	ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "C:\\OLDData\\Download\\chromedriver_win32\\chromedriver.exe");
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://defrnvmpgrpweb2.ey.net/SecGrp/mygroups.aspx");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://defrnvmpgrpweb2.ey.net/SecGrp/mygroups.aspx");
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_HeaderPart1_QuickSearch1_txtDisplayName")).sendKeys(adGroup);
		driver.findElement(By.id("ctl00_HeaderPart1_QuickSearch1_Button1")).click();
		driver.findElement(By.xpath("//a[contains(text(),'S-U-SP-MercuryFinanceGSS')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Bulk Import')]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("BulkLoadControl_btnNextSelectFile")).click();
		driver.findElement(By.id("BulkLoadControl_myFile")).click();
		Thread.sleep(2000);
		
		String autoITExecutable = "C:\\Users\\mukesh.kumar1\\Desktop\\alok\\uploadParamete.exe " +fileName;
		 Runtime.getRuntime().exec(autoITExecutable);
		 
		 Runtime.getRuntime().exec("C:\\Users\\mukesh.kumar1\\Desktop\\alok\\uploadParameter.exe"+" "+fileName);
		 
		 //Runtime.getRuntime().exec("C:\\Users\\mukesh.kumar1\\Desktop\\alok\\upload.exe");
			Thread.sleep(4000);
		 driver.findElement(By.id("BulkLoadControl_btnUpload")).click();
		 driver.findElement(By.id("BulkLoadControl_buttonNextAccount")).click();
		 driver.findElement(By.id("BulkLoadControl_btnReadExcel")).click();
		 driver.findElement(By.id("BulkLoadControl_button2")).click();
		 WebElement Destination_Fields_dropdown = driver.findElement(By.id("BulkLoadControl_ddlAttributes"));
		 Select sel = new Select(Destination_Fields_dropdown);
		 sel.selectByValue("mail");
		 driver.findElement(By.id("BulkLoadControl_buttonNextSummary")).click();
		 driver.findElement(By.id("BulkLoadControl_btnOK")).click();
		 System.out.println(" Done");
	
	
	}

}
