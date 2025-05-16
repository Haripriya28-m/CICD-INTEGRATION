package CICDPipelineProject.GitHubRepo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelBooking {
       

	static WebDriver driver;
    
	@BeforeMethod
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/"); 
	    System.out.println("Application launched successfully");
		driver.findElement(By.id("username")).sendKeys("HaripriyaMathes");
		System.out.println("username entered successfully");
		driver.findElement(By.id("password")).sendKeys("Haripriya@123");
		System.out.println("password entered succesfully");
		driver.findElement(By.id("login")).click();
		System.out.println("login button clicked successfully"); 
		  }
	@Test
	public static void SearchHotel() throws InterruptedException
	{
		 
		  Select dropdown = new Select(driver.findElement(By.name("location")));
		  dropdown.selectByValue("London");
		  System.out.println("Location selected successfully");
		  
		  Select dropdown1 = new Select(driver.findElement(By.id("hotels")));
		  dropdown1.selectByValue("Hotel Hervey");
		  System.out.println("Hotel selected successfully");
		  
		  Select dropdown2 = new Select(driver.findElement(By.id("room_type")));
		  dropdown2.selectByValue("Super Deluxe");
		  System.out.println("Rooms selected successfully");
		  
		  Select dropdown3 = new Select(driver.findElement(By.id("room_nos")));
		  dropdown3.selectByValue("1");
		  System.out.println("No.Of Rooms selected successfully");
		  
		  driver.findElement(By.id("datepick_in")).clear();
		  driver.findElement(By.id("datepick_in")).sendKeys("30/01/2025");
		  System.out.println("checkIn date entered successfully");
		  
		  driver.findElement(By.id("datepick_out")).clear();
		  driver.findElement(By.id("datepick_out")).sendKeys("04/02/2025");
		  System.out.println("checkOut date entered successfully");
		  
		  Select dropdown4 = new Select(driver.findElement(By.id("adult_room")));
		  dropdown4.selectByValue("2");
		  System.out.println("Adults rooms selected successfully");
		  
		  Select dropdown5 = new Select(driver.findElement(By.id("child_room")));
		  dropdown5.selectByValue("0");
		  System.out.println("Children room selected successfully");
		  Thread.sleep(2000);
		  driver.findElement(By.id("Submit")).click();
		  System.out.println("select hotel page viewed successfully");
	      driver.findElement(By.id("radiobutton_0")).click();
		  driver.findElement(By.id("continue")).click();
		  Thread.sleep(2000);
         System.out.println("Book a hotel page viewed successfully");
          driver.findElement(By.id("first_name")).sendKeys("Haripriya");
		  driver.findElement(By.id("last_name")).sendKeys("Mathes");
		  driver.findElement(By.id("address")).sendKeys("A21/003 cosmocity;pudhupakkam;chennai-603103");
		  driver.findElement(By.id("cc_num")).sendKeys("9894436163791106");
		  Select dropdown6 = new Select(driver.findElement(By.id("cc_type")));
		  dropdown6.selectByValue("VISA");
		  Select dropdown7 = new Select(driver.findElement(By.id("cc_exp_month")));
		  dropdown7.selectByValue("8");
		  Select dropdown8 = new Select(driver.findElement(By.id("cc_exp_year")));
		  dropdown8.selectByValue("2030");
		  driver.findElement(By.id("cc_cvv")).sendKeys("7502");
		  driver.findElement(By.id("book_now")).click();
		
	}
	
	@AfterMethod
	public static void closeWindow() {
		driver.quit();
	}
	
}



