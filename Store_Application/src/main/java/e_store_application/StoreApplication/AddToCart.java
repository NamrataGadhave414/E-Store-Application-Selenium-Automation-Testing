package e_store_application.StoreApplication;

import org.openqa.selenium.By;

public class AddToCart extends App{
	
	public void addProductToCart() {
		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).click();
		System.out.println("Product Added to Cart");
		
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		System.out.println("Cart Opened");
		
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\" and @data-test=\"shopping-cart-link\"]")).click();
		System.out.println("Proceeded to Checkout Page\"");
		
	}
}
