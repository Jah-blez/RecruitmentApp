package action;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import page.CyclesPage;
import page.TemplatePage;
import page.recruitmentapp_LoginPage;;

public class recruitmentApp {

	static WebDriver driver;
	
	@Test
	public void recruitmentAppActions() throws Exception {
		
		
		recruitmentapp_LoginPage login = new recruitmentapp_LoginPage(driver);
		driver = login.recruitmeentapp_launchbrowser();
		login.recruitmentapp_testLogin();

		
		TemplatePage template = new TemplatePage(driver);
		template.templatecreation();
		
		CyclesPage cycles= new CyclesPage(driver);
		cycles.cyclescreation();

	
	}	
	
	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();

	}
	
	
}
