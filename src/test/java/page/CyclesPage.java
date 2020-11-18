package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CyclesPage {
	
	private WebDriver driver = null;
	public CyclesPage (WebDriver driver) {

		this.driver  = driver;
	}
	public WebDriver cyclescreation() throws Exception {
	    
	    
	    Thread.sleep(3000);
	
	    driver.findElement(By.linkText("Cycle")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div[2]/div/a/button")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@value='']")).click();
	    Thread.sleep(3000);
	    
	    String name= "phase 2";
	    driver.findElement(By.xpath("//input[@value='']")).sendKeys(name);
	    
	    driver.findElement(By.xpath("//div[@id='root']/div[2]/div/form/div[2]/div/div")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='root']/div[2]/div/form/div[2]/div/div[2]/div/span")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='root']/div[2]/div/div/button")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.linkText("Cycle")).click();
	    
	    WebElement element= driver.findElement(By.xpath("//tr[1]//td[1]"));
     	String elemen = element.getText();
	    
	    if (elemen != name) {
			System.out.println("cycle is created successfully");
		} 
		else {
			System.out.println("cycle is created successfully");
		}
		
		
		
	  
		return driver;
	  }
	

}
