package automation.testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebElementInteractions {
	
	ChromeDriver ch=null;
	@BeforeClass //BeforeCalss Annotation executes only one time before execution of class 
	public void inti()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/mukesh.kumar1/workspace/SeleniumAutomation/browserexe/chromedriver.exe");
	 ch = new ChromeDriver();
	}
	@AfterClass
	public void endCloseBrowser(){
		ch.close();
	}
	
	
	@Test //(enabled =false)
	public void testcaseTohandleWebTable()
	{	
		ch.get("https://bigprof.com/demo/index.php");
		ch.findElement(By.xpath("//*[@id='customers-tile']/div/div/a")).click();
		WebElement tbl =ch.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/form/div[3]/div/div[1]/table/tbody"));
			List<WebElement> allRows=tbl.findElements(By.tagName("tr"));
		
			for( int i=0;i<allRows.size();i++)
			{
				List<WebElement>allTd=allRows.get(i).findElements(By.tagName("td"));
				for(int j=0;j<allTd.size();j++)
				{
					String tdValue = allTd.get(j).getText();
					System.out.print(tdValue);
					System.out.print("  | ");
				}System.out.println("");
			}
		}
	@Test
	public void listBoxes()
	{
		ch.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		ch.switchTo().frame("iframeResult");
		WebElement listSelect = ch.findElement(By.name("cars"));		
		Select mycarList = new Select (listSelect);
		mycarList.selectByValue("saab");
		mycarList.selectByVisibleText("Opel");
		mycarList.selectByIndex(1);
		
		ch.switchTo().defaultContent();//Switch back to parent page
		
		//ch.close();
	}
	
	
	
	
}
