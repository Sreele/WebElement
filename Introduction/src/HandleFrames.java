import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAVSLTPBCP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		     //handling frame using webelement
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		     //handling frame using frame index
	    //System.out.println(driver.findElement(By.tagName("iframe")).size());
	    //driver.switchTo().frame(0);
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement destini=driver.findElement(By.id("droppable"));
        Actions action=new Actions(driver);
        action.dragAndDrop(source, destini).build().perform();
        //switch back to normal window
        driver.switchTo().defaultContent();
	}

}
