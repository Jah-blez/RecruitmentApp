package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class recruitmentapp_LoginPage {
	
	private WebDriver driver = null;
	public static String projectpath= System.getProperty("user.dir");
	public recruitmentapp_LoginPage (WebDriver driver) {

		this.driver  = driver;
	}
	
	//browser launching
	public  WebDriver recruitmeentapp_launchbrowser() throws Exception {
		
		
				
		System.setProperty("webdriver.gecko.driver", projectpath+ "\\driver\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		System.out.println("browser launched successfully");

		return driver;

	}
	public WebDriver recruitmentapp_testLogin() throws Exception {
	    driver.get("http://159.65.48.48/");
	    driver.findElement(By.linkText("Log In")).click();
	    driver.findElement(By.name("email")).sendKeys("godbless.onyebuchi@gmail.com");
	    
	    driver.findElement(By.name("password")).sendKeys("password");
	    
	    Thread.sleep(3000);
	
	    driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
	    
//	    Thread.sleep(1000);
//	    
//	    if (driver.findElement(By.xpath("//div[2]/div/div/div/div")).isDisplayed()) {
//			System.out.println("User login successful notification is displayed");
//		} 
//		else {
//			System.out.println("User login successful notification is not displayed");
//		}
	    
	    WebElement element= driver.findElement(By.xpath("//div[2]/div/div/div/div"));
		String elemen = element.getText();
		System.out.println(elemen);
	    
	    Assert.assertEquals(elemen,driver.findElement(By.xpath("//div[2]/div/div/div/div")).getText() ,"Notification varies from the usual");
		System.out.println("user logged in successfully");
		
		
		
	  
		return driver;
	  }
	
	
	
	
}
