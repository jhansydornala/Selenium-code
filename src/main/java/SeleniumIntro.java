import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		
		
		// Invoking Browser
		//Chrome - ChromeDriver ->Methods close get
		//FIrefox - FirefoxDriver ->Methods close get
		//WebDriver close get
		//WebDriver methods + class methods
		
		//ChromeDriver.exe-> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C://Users//Jhansy//Downloads//chromedriver.exe");

		
		//WebDriver.chrome.driver->value of path
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.wyseshopper.in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		

	}

}