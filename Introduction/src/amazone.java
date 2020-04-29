import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class amazone {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAVSLTPBCP\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				//maximize the window
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				//locate element using xpath
				driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//a[@class='nav-action-button']")).click();
				driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("7994515516");
				driver.findElement(By.xpath("//input[@id='continue']")).click();
				driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("sujaminu");
				driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Ayyappanum Koshiyum");
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).submit();
				//locate element using css Selector
				driver.findElement(By.cssSelector("a[class='a-size-base a-link-normal a-text-bold']")).click();
				//handling multiple window
//				Set<String> s= driver.getWindowHandles();
//				Iterator<String> it=s.iterator();
//				String base_id=it.next();
//				String sub_id=it.next();
//				driver.switchTo().window(sub_id);//switching to child window 
				//driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
				//driver.findElement(By.xpath("//button[@id='siAddCoverage-announce']")).click();
				

			}

		}

