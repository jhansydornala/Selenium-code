import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //implicit wait - 5seconds time out


		System.setProperty("webdriver.chrome.driver", "C://Users//Jhansy//Downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://cdta-qe.gfcp.io/");	
//		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("superadmin@gfl.com");
//		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("Password1!");
//		driver.findElement(By.xpath("//button[@name = 'submit']")).click();


		driver.findElement(By.id("username")).sendKeys("superadmin@gfl.com");
		driver.findElement(By.id("password")).sendKeys("Password1!");
		driver.findElement(By.id("login")).click();
	    driver.findElement(By.xpath("//h4[text() = 'Customer Care']")).click();
	    driver.findElement(By.xpath("//h4[text() = 'Customer Management']")).click();
	    driver.findElement(By.xpath("//input[@name = 'criteria']")).sendKeys("jhansy");
	    driver.findElement(By.xpath("//input[@autocomplete = 'off']")).sendKeys("cdta");
	    Select OpsSelect = new Select(driver.findElement(By.xpath("//select[@id = 'filter-Status']")));
	    OpsSelect.selectByValue("1");
	    Select OpsSelect1 = new Select(driver.findElement(By.xpath("//select[@id = 'filter-Farecode']")));
	    OpsSelect1.selectByValue("1");
//	    Select OpsSelect2 = new Select(driver.findElement(By.xpath("//select[@id = 'filter-AccountType']")));
//	    OpsSelect2.selectByValue("Account-Based");
	    Select OpsSelect2 = new Select(driver.findElement(By.xpath("//select[@id = 'filter-AccountType']")));
	    OpsSelect2.selectByValue("Card-Based");
	    driver.findElement(By.xpath("//button[@id = 'search-button']")).click();
	    driver.findElement(By.xpath("//a[@href = 'https://cdta-qe.gfcp.io/csr/customer/details?id=7378']")).click();
	    driver.findElement(By.xpath("//a[@href = '/csr/card/details?id=FDC2DB8B380F0976']")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='0.00']")).sendKeys("10.00");
	    driver.findElement(By.xpath("//span[text()=\"$20.00\"]//following::button[1]")).click();
	    driver.findElement(By.xpath("//a[@id = 'shopping_checkout']")).click();
	    driver.findElement(By.xpath("//button[@value = 'noship']")).click();
	    driver.findElement(By.xpath("//input[@value = 'check']")).click();
	    driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
	    
	    
		
	}
		
		
	
	

}
 