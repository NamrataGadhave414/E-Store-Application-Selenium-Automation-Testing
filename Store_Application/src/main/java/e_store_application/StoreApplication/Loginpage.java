package e_store_application.StoreApplication;

import org.openqa.selenium.By;

public class Loginpage extends App {

	public void openWebsite() {
		try {
			driver.get("https://www.saucedemo.com/");

			String title = driver.getTitle();
			System.out.println("Page Title: " + title);

			if (title.equals("Swag Labs")) {
				System.out.println("Title Verified Successfully");
			} else {
				System.out.println("Title Verification Failed");
			}

		} catch (Exception e) {
			System.out.println("Unable to launch the site....." + e.getMessage());
		}
	}

	public void logIn() {
		try {

			driver.findElement(By.xpath("//input[@id=\"user-name\"  and @placeholder=\"Username\"]")).sendKeys("standard_user");
			
			  driver.findElement(By.xpath("//input[@id=\"password\" and @placeholder=\"Password\"]")).sendKeys("secret_sauce");
			  driver.findElement(By.xpath("//input[@id=\"login-button\" and @value=\"Login\"]")).click();
			 

			System.out.println("Login Completed Successfully");

		} catch (Exception e) {
			System.out.println("Unable to login...." + e.getMessage());
		}
	}

}
