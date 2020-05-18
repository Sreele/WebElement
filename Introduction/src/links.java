import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAVSLTPBCP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//finding all links in a web page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//finding links in footer section and limiting the driver scope
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//finding no of links in a column within the frame
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int links=columndriver.findElements(By.tagName("a")).size();
		System.out.println("No.of links inside footer"+ links);
		//iterating through web elements
		for(int i=1;i<links;i++) {
			
			//open links in separate windows using control enter
			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000L);
			
		}
		//printing all windows title
		Set<String> window=driver.getWindowHandles();
		Iterator <String> it=window.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
 		

	}

}
