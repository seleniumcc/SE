package pack3;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoIndividualRun {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://defrnvmpgrpweb2.ey.net/SecGrp/mygroups.aspx");
		driver.findElement(By.id("ctl00_HeaderPart1_QuickSearch1_txtDisplayName")).sendKeys("S-U-SP-MercuryFinanceGSS");
		driver.findElement(By.id("ctl00_HeaderPart1_QuickSearch1_Button1")).click();
		driver.findElement(By.xpath("//a[contains(text(),'S-U-SP-MercuryFinanceGSS')]")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_Contentplaceholder1_Properties1_RadTabStripProperties']/div/ul/li[2]/a/span/span/span")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Modify Membership')]")).click();
		
		/* System.out.println("1 "+driver.findElements(By.tagName("iframe")).get(0).getAttribute("name"));
		 System.out.println("2 "+driver.findElements(By.tagName("iframe")).get(1).getAttribute("name"));
		 System.out.println("3 "+driver.findElements(By.tagName("iframe")).get(2).getAttribute("name"));*/
		
		driver.switchTo().frame(0);
		//System.out.println(driver.getPageSource());
		Thread.sleep(6000);
		driver.findElement(By.id("AdvancedSearch")).click();
		driver.findElement(By.id("FindDialogControl1_searchmail")).sendKeys("mukesh.kumar1@in.ey.com");
		driver.findElement(By.id("FindDialogControl1_lnkbtnSearch")).click();
		driver.findElement(By.id("FindDialogControl1_SearchResultsGrid_ctl00__0")).click();
		driver.findElement(By.id("FindDialogControl1_lnkbtnAddToSelection")).click();
		driver.findElement(By.id("FindDialogControl1_btnOK")).click();

	}

}
