package automation.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test //(enabled =false)
public class C1 {
	WebDriver driver ;
	public void t1(){
		System.out.println("A");
		System.setProperty("webdriver.chrome.driver", "C:/Users/mukesh.kumar1/workspace/SeleniumAutomation/browserexe/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.close();
	}
	public void t2(){
		System.out.println("B");
		System.setProperty("webdriver.chrome.driver", "C:/Users/mukesh.kumar1/workspace/SeleniumAutomation/browserexe/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.close();
	}
	public void t3(){
		System.out.println("A");
		System.setProperty("webdriver.chrome.driver", "C:/Users/mukesh.kumar1/workspace/SeleniumAutomation/browserexe/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.yahoo.co.in");
		driver.close();
	}
	public void t4(){
		System.out.println("B");
		System.setProperty("webdriver.chrome.driver", "C:/Users/mukesh.kumar1/workspace/SeleniumAutomation/browserexe/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.hotmail.com/");
		driver.close();
	}
}
