package e_store_application.StoreApplication;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;

public class Checkout extends App {
	public void completeCheckout() {
		try {
			// Validation Check (Empty Data)
			driver.findElement(By.id("checkout")).click();

		//	String errorMsg = driver.findElement(By.xpath("//h3[@data-test=\"error\"]")).getText();
		//	System.out.println("Validation Message: " + errorMsg);

			// Enter Valid Data
			driver.findElement(By.id("first-name")).sendKeys("ABCDEF");
			driver.findElement(By.id("last-name")).sendKeys("GHIJK");
			driver.findElement(By.id("postal-code")).sendKeys("411001");

			driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
			System.out.println("Checkout Details Entered Successfully");

			// Verify Amount
			String total = driver.findElement(By.className("summary_total_label")).getText();
			System.out.println("Total Amount: " + total);

			// Finish Order
			driver.findElement(By.id("finish")).click();

			String successMsg = driver.findElement(By.className("complete-header")).getText();
			System.out.println("Success Message: " + successMsg);
			
		} catch (NoSuchElementException e) {
			System.out.println("unable to click chechout.." + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to fill checkout details... " + e.getMessage());
		}
	}

}