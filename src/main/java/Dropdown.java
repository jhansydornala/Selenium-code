import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Jhansy//Downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in browser
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//		driver.findElement(By.xpath("//a[@text= 'Hyderabad (HYD)']")).click();
//		Thread.sleep(2000L);
//		driver.findElement(By.xpath("//a[@text= 'Bengaluru (BLR)'])[2]")).click();
	
		driver.findElement(By.xpath("//input[@class = 'select_CTXT']")).click();
		
		driver.findElement(By.xpath("//a[@value= 'HYD']")).click();	
//		Thread.sleep(4000L);
//		driver.findElement(By.xpath("//input[@name = 'ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
//		driver.findElement(By.xpath("(//a[@text= 'Bengaluru (BLR)'])[2]")).click();
		Thread.sleep(4000L);
		driver.findElement(By.xpath("//div[@id= 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text= 'Bengaluru (BLR)'] ")).click();
//		driver.quit();
		
//		Thread.sleep(2000L);
		
		

	}

}
