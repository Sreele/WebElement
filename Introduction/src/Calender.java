import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAVSLTPBCP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).getText().contains("June"))
		{
			driver.findElement(By.cssSelector("[class=\"datepicker-days\"] [class=\"next\"]")).click();
			Thread.sleep(1000);
		}
		List <WebElement> dat=driver.findElements(By.className("day"));
		int count=driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++) {
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.contentEquals("12")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		

	}

}
