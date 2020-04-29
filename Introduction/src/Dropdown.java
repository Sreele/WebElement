import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAVSLTPBCP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//navigating to url
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//locating elements using xpath
	    //String str=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0'])")).getAttribute("value");
	    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("che");//sending value 
	    //click enter
		driver.findElement(By.xpath("//a[@text='Chennai (MAA)']")).click();
		Thread.sleep(1000);
		//selecting from place
	    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']")).click();
	    //date selection
	    driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	    Thread.sleep(1000);
	    //passenger selection
	    driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	    driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")).click();
	    driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']//option[@value='4']")).click();
	    //submit
	    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
	    //radio button
	   
	    
		
	}

}
