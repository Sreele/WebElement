import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortingColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAVSLTPBCP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//taking elements form the 2nd coloumn using xpath 
		driver.findElement(By.xpath("//b[contains(text(),'Veg')]")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Veg')]")).click();
		List<WebElement> products=driver.findElements(By.xpath("//div[@class=\"products-wrapper\"]//tr//td[2]"));
		//declaring String type array
		ArrayList<String> pro_array=new ArrayList<String>();
		//iterating through product list
		for(int i=0;i<products.size();i++) {
			System.out.println(products.get(i).getText());
			//copying product value to array list pro_array
			pro_array.add(products.get(i).getText());
		}
		ArrayList<String> pro_array_copy=new ArrayList<String>();//creating copy list
		//iterating through the pro_array list and copy the value to the Pro_array_copy list
		for(int i=0;i<products.size();i++) {
			
			pro_array_copy.add(products.get(i).getText());
		}
		Collections.sort(pro_array_copy);
        for(String s:pro_array_copy) {
			
			System.out.println(s);
		}
		Assert.assertTrue(pro_array.equals(pro_array_copy));
		
		

	}

}
