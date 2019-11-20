package pack3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.utility.Config;

public class Pan {

	JFrame frame;
	private JTextField txtPath;
	public static int globalWiatTime=Integer.valueOf(Config.getPropertyValue("waitTime"));
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pan window = new Pan();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Bulk User Upload V1.0 ");
		txtPath = new JTextField();
		txtPath.setBounds(10, 10, 414, 21);
		frame.getContentPane().add(txtPath);
		txtPath.setColumns(10);

		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setBounds(10, 41, 87, 23);
		frame.getContentPane().add(btnBrowse);
		
		  JButton UploadButton= new JButton("Upload");
		   UploadButton.setBounds(140, 41, 87, 23);
		    frame.getContentPane().add(UploadButton);
		    
		  
			
		    UploadButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String FilePath =txtPath.getText();
						//upoloadData(FilePath);
					}});
		
		    
			  JButton closeButton= new JButton("Close this Window");
			  closeButton.setBounds(250, 41, 157, 23);
			    frame.getContentPane().add(closeButton);
			
			    closeButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						frame.setVisible(false);
					}});
				
			    
			    

		btnBrowse.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFileChooser fileChooser = new JFileChooser();

				// For Directory
				// fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

				// For File
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

				fileChooser.setAcceptAllFileFilterUsed(false);

				int rVal = fileChooser.showOpenDialog(null);
				if (rVal == JFileChooser.APPROVE_OPTION) 
				{
					txtPath.setText(fileChooser.getSelectedFile().toString());
				}
			}
		});
		
		 
	}
	
	public void upoloadData(String filePath) throws InterruptedException, IOException
	{
		

		String adGroup="S-U-SP-MercuryFinanceGSS";
		//String fileName ="Book2"+".xlsx";
		String fileName =filePath;
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
		
		 System.out.println(" Done");
	
		
	}
	
	
	
	

}
