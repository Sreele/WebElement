import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddToCart {
    //add to cart test automation
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAVSLTPBCP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//implicit wait
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//declaring string array 
		String[] vegetbles= {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");// loading WebSite
		driver.manage().window().maximize();//maximize window
		AddToTheCart(driver,vegetbles);
		
		
		
       }
	public static void AddToTheCart(WebDriver driver,String[] vegetbles) throws InterruptedException {
		
        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));//listing all webElement having CSS product-name
        
    	int j=0;
        //iterating through the list elements
        for( int i=0;i<products.size();i++) {
        	
        	//assigning text value to the variable 
        	String[] pro_name=products.get(i).getText().split("-");
        	
        	//removing the white spaces 
        	String new_pro_name=pro_name[0].trim();
        	
        	//converting array to array list
        	List vegiatblesList= Arrays.asList(vegetbles);
        	
            
        	//check the  value 
        	if(vegiatblesList.contains(new_pro_name)) {
        		
        		j++;
        		driver.findElements(By.xpath("//a[@class=\"increment\"]")).get(i).click();
        	    driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
        	    Thread.sleep(1000);
        	    if(j==3) {
        	    	break;
        	    }
        		
        	}
        }
        
        driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
        driver.findElement(By.xpath("//div[@class='action-block']//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        //explicit wait
        WebDriverWait w=new WebDriverWait(driver,5);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoinfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoinfo")).getText());
	}

}
