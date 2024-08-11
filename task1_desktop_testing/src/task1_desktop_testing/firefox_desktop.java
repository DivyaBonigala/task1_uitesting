package task1_desktop_testing;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

//import task1_desktop_testing.screenshotsclass;

public class firefox_desktop extends firefoxbrowser {
	@Test

	public void opensite()
	{
		for(int i=1;i<=5;i++)
		{
	try
	{
		
		
			
			driver.get("https://www.getcalley.com/page-sitemap.xml");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	    
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sitemap']/tbody/tr[" + i + "]/td[1]/a")));
	    
		element.click();
	     
	    System.out.println("url is navigated");

	    
	    Thread.sleep(3000);
	    System.out.println("adjusting the resolution of firefox");
	    driver.manage().window().setSize(new Dimension(1920, 1080));
	    System.out.println("Window size set to: " + driver.manage().window().getSize());
	    Thread.sleep(2000);
	    
	    String folder1920 ="/Users/divyabonigala/eclipse-workspace/task1_desktop_testing/firefox_Desktop_images/1920X1080";
	    File folder = new File(folder1920);
	    if (!folder.exists()) {
	      	 Assert.fail("Folder path does not exist: " + folder1920);
	      }

	    String ssfile = folder1920 +"/screenshot_"+screenshotsclass.dateutils.getDateTimeStamp()+ ".png";
	    screenshotsclass.takescreenshot(driver, ssfile);
	    System.out.println("Screenshot taken and saved as: " + ssfile);
	    Thread.sleep(3000);
	   

	  //driver.manage().window().fullscreen();
	  //System.out.println("Window size after fullscreen: " + driver.manage().window().getSize())
	    
	}catch (Exception e) {
	   
	    e.printStackTrace();

	}
	}
		
		// screenresulotion 1366 X 768
		
		for(int i=1;i<=5;i++)
		{
	try
	{
		
		
			
			driver.get("https://www.getcalley.com/page-sitemap.xml");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	    
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sitemap']/tbody/tr[" + i + "]/td[1]/a")));
	    
		element.click();
	     
	    System.out.println("url is navigated");

	    
	    Thread.sleep(3000);
	    System.out.println("adjusting the resolution of firefox");
	    driver.manage().window().setSize(new Dimension(1366, 768));
	    System.out.println("Window size set to: " + driver.manage().window().getSize());
	    Thread.sleep(2000);
	    
	    String folder1366 ="/Users/divyabonigala/eclipse-workspace/task1_desktop_testing/firefox_Desktop_images/1366X768";
	    File folder = new File(folder1366);
	    if (!folder.exists()) {
	   	 Assert.fail("Folder path does not exist: " + folder1366);
	   }

	    String ssfile = folder1366 +"/screenshot_"+screenshotsclass.dateutils.getDateTimeStamp()+ ".png";
	    screenshotsclass.takescreenshot(driver, ssfile);
	    System.out.println("Screenshot taken and saved as: " + ssfile);
	    Thread.sleep(3000);
	   
	    
	}catch (Exception e) {
	   
	    e.printStackTrace();

	}
	}
		
		// screenresulotion 1536 X 864
		
			for(int i=1;i<=5;i++)
			{
		try
		{
			
			
				
				driver.get("https://www.getcalley.com/page-sitemap.xml");
			
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		    
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sitemap']/tbody/tr[" + i + "]/td[1]/a")));
		    
			element.click();
		     
		    System.out.println("url is navigated");

		    
		    Thread.sleep(3000);
		    System.out.println("adjusting the resolution of firefox");
		    driver.manage().window().setSize(new Dimension(1536, 864));
		    System.out.println("Window size set to: " + driver.manage().window().getSize());
		    Thread.sleep(2000);
		    
		    String folder1536 ="/Users/divyabonigala/eclipse-workspace/task1_desktop_testing/firefox_Desktop_images/1536X864";
		    File folder = new File(folder1536);
		    if (!folder.exists()) {
		    	 Assert.fail("Folder path does not exist: " + folder1536);
		    }

		    String ssfile = folder1536 +"/screenshot_"+screenshotsclass.dateutils.getDateTimeStamp()+ ".png";
		    screenshotsclass.takescreenshot(driver, ssfile);
		    System.out.println("Screenshot taken and saved as: " + ssfile);
		    Thread.sleep(3000);
		   
		    
		}catch (Exception e) {
		   
		    e.printStackTrace();

		}
		}
		 driver.quit();

}
	

}
