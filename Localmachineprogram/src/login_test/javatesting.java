
// Java Program to Login to a specific 
// Using Selenium WebDriver and ChromeDriver
// Importing package module to code fragment
package login_test;

// Importing required classes
import org.openqa.selenium.By;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

// Main class
public class javatesting {

	// Main driver method
	public static void main(String[] args) throws Throwable
	{

		// Path of chrome driver
		// that will be local directory path passed
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rakeshs\\AppData\\Local\\Programs\\Python\\Python311\\Scripts\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// URL of the login website that is tested
		driver.get("https://accounts.lambdatest.com/");
//		Thread.sleep(2000);
		

		// Maximize window size of browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Enter your login email id
		driver.findElement(By.id("email"))
			.sendKeys("shubhamr@lambdatest.com");

		// Enter your login password
		driver.findElement(By.id("password"))
			.sendKeys("Gmail@123");
		driver.findElement(By.id("login-button"))
	        .sendKeys(Keys.ENTER);
		
		Thread.sleep(20000);
		driver.quit();

//		driver.findElement(By.id("login-button"))
//			.click();
	}
}
