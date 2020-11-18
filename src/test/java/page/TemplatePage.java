package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TemplatePage {
	private WebDriver driver = null;
	public TemplatePage (WebDriver driver) {

		this.driver  = driver;
	}
	public WebDriver templatecreation() throws Exception {
	    
	    
	    Thread.sleep(3000);
	String name= "AutoGodbless";
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div[2]/div/a/button")).click();
	    driver.findElement(By.name("title")).click();
	    driver.findElement(By.name("title")).clear();
	    driver.findElement(By.name("title")).sendKeys(name);
	    driver.findElement(By.name("description")).click();
	    driver.findElement(By.name("description")).clear();
	    driver.findElement(By.name("description")).sendKeys("test");
	    driver.findElement(By.name("duration")).click();
	    driver.findElement(By.name("duration")).clear();
	    driver.findElement(By.name("duration")).sendKeys("03");
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div[2]/button")).click();
	    driver.findElement(By.name("title")).click();
	    driver.findElement(By.name("title")).clear();
	    driver.findElement(By.name("title")).sendKeys("user guide");
	    driver.findElement(By.name("description")).click();
	    driver.findElement(By.name("description")).clear();
	    driver.findElement(By.name("description")).sendKeys("test guide");
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div[3]/button[2]")).click();
	    driver.findElement(By.name("name")).click();
	    driver.findElement(By.name("name")).clear();
	    driver.findElement(By.name("name")).sendKeys("Briefing");
	    driver.findElement(By.name("categoryName")).click();
	    driver.findElement(By.name("categoryName")).clear();
	    driver.findElement(By.name("categoryName")).sendKeys("knowledge");
	    driver.findElement(By.name("scorePoint")).click();
	    driver.findElement(By.name("scorePoint")).clear();
	    driver.findElement(By.name("scorePoint")).sendKeys("50");
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/button")).click();
	    driver.findElement(By.xpath("(//input[@name='categoryName'])[2]")).click();
	    driver.findElement(By.xpath("(//input[@name='categoryName'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='categoryName'])[2]")).sendKeys("tenacity");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).click();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("59");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("58");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("57");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("56");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("55");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("54");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("53");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("52");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("51");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("50");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("49");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("48");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("47");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("46");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("45");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("44");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("43");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("42");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("41");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("40");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("39");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("38");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[2]")).sendKeys("37");
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/button")).click();
	    driver.findElement(By.xpath("(//input[@name='categoryName'])[3]")).click();
	    driver.findElement(By.xpath("(//input[@name='categoryName'])[3]")).clear();
	    driver.findElement(By.xpath("(//input[@name='categoryName'])[3]")).sendKeys("rain");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[3]")).click();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[3]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[3]")).sendKeys("20");
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div[2]/button")).click();
	    driver.findElement(By.xpath("(//input[@name='name'])[2]")).click();
	    driver.findElement(By.xpath("(//input[@name='name'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("skill");
	    driver.findElement(By.xpath("(//input[@name='categoryName'])[4]")).click();
	    driver.findElement(By.xpath("(//input[@name='categoryName'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='categoryName'])[4]")).sendKeys("hands on");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).click();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("19");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("18");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("17");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("16");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("15");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("14");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("13");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("12");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("11");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("10");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("9");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("8");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("7");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("6");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("5");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("4");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("3");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("2");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("1");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("0");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("-1");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("-2");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("-3");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("-4");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("-5");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("-6");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("-7");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("-8");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("-9");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("-10");
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@name='scorePoint'])[4]")).sendKeys("-11");
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div[4]/button[2]")).click();
	    driver.findElement(By.name("question")).click();
	    driver.findElement(By.name("question")).clear();
	    driver.findElement(By.name("question")).sendKeys("Are you smart");
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div[2]/button")).click();
	    driver.findElement(By.xpath("(//input[@name='question'])[2]")).click();
	    driver.findElement(By.xpath("(//input[@name='question'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@name='question'])[2]")).sendKeys("wise");
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div[4]/button[2]")).click();
	    //driver.findElement(By.xpath("//div[2]/div/div/div/div/div")).click();
	    
	    Thread.sleep(7000);
	    WebElement element= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]"));
     	String elemen = element.getText();
     	System.out.println("Template created is :" + elemen);
	    
	    if (elemen != name) {
			System.out.println("Template is created successfully");
		} 
		else {
			System.out.println("Template is not created successfully");
		}
	  
		return driver;
	  }
	
	
}
