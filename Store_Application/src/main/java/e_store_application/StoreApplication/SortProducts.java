package e_store_application.StoreApplication;

import java.util.ArrayList;
import java.util.Collections; 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SortProducts extends App {
	
	public void sortLowToHigh(){
		try {
		  WebElement dropdown = driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		  
		  Select select = new Select(dropdown);
	        select.selectByVisibleText("Price (low to high)");

	        System.out.println("Selected Sort: Low to High");
	        
	     // Verify Sorting
	        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));

	        List<Double> actualPrices = new ArrayList();

	        for (WebElement price : prices) {
	            actualPrices.add(Double.parseDouble(price.getText().replace("$", "")));
	        }

	        List<Double> sortedPrices = new ArrayList<>(actualPrices);
	        Collections.sort(sortedPrices);

	        if (actualPrices.equals(sortedPrices)) {
	            System.out.println("Products Sorted Correctly");
	        } else {
	            System.out.println("Sorting Failed");
	        }
		}catch(Exception e) {
			System.out.println("Unable to sort..." + e.getMessage());
		}
	}
}
