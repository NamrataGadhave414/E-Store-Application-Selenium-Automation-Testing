package e_store_application.StoreApplication;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		startBrowser(); //step 1:
		
		Loginpage loginpage = new Loginpage(); 
		loginpage.openWebsite();
		loginpage.logIn();  //step 2
		
		SortProducts products = new SortProducts();
		products.sortLowToHigh(); //step 3
		
		AddToCart addToCart = new AddToCart();
		addToCart.addProductToCart(); //step 4
		
		Checkout checkout= new Checkout();
		checkout.completeCheckout(); //step 5
		
		
		
	//	closeBrowser();
		

	}
	
		//Step 1:
	    public static void startBrowser() {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        System.out.println("Browser Started Successfully");
	    }

	    public static void closeBrowser() {
	        driver.quit();
	        System.out.println("Browser Closed Successfully");
	    }

}
