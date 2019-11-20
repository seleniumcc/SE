package automation.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MMT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver ;
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/mukesh.kumar1/workspace/SeleniumAutomation/browserexe/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("hp-widget__depart")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[3]/div/div[3]/div/div[1]/table/tbody/tr[4]/td[5]/a")).click();
		

	}

}
