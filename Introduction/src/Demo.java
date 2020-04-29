import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAVSLTPBCP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("lachukaka");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("");
		//driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("name"));
		String win=driver.getWindowHandle();
		System.out.println(win);
		

	}

}
