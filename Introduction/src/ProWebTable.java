import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProWebTable {
    //Automating Dynamic WebTable
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAVSLTPBCP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//navigating to url
		driver.get("http://demo.automationtesting.in/WebTable.html");
		//maximizing the window size
		driver.manage().window().maximize();
		// wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//double clicking the button
		WebElement edit= driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/user-click-select[1]/div[1]/button[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(edit).doubleClick().build().perform();
		
		//Finding no of columns
		List<WebElement> row=driver.findElements(By.tagName("input"));
		System.out.println("no of coloumns"+" "+ row.size());
		
		//iterating through first row 
		for(WebElement value:row) {
			String data=value.getAttribute("value");
			//editing the value
			if(data.equals("aaa")) {
				value.clear();
				value.sendKeys("ssssss");
				Thread.sleep(1000);
				break;
			}
			
		}
		
		//clicking on cancel button
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/user-click-select[1]/div[2]/cancel-click[1]/button[1]")).click();
		//delete button 
		WebElement delete=driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/user-click-select[1]/div[1]/del-click[1]/button[1]"));
		//for right clicking an element
		action.moveToElement(delete).contextClick().build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/user-click-select[1]/div[1]")).click();
		//handling alerts
		Thread.sleep(1000);
		System.out.println("Alert message is"+" "+ driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();//driver.switchTo().alert().accept();
		//close browser
		driver.close();
		
	}

}
