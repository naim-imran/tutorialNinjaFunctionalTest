package com.tutorialNinja.pageObjectFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends CommonElements {
	

	private WebDriver driver;
	
	public HomePageObjects(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath= "//div[@class='product-thumb transition']")
	private List<WebElement> featuredProducts;
	
	
	
	
	public ProductDetailsPage clickHomePageFeaturedProduct(String expectedProduct) {
	
		/*
		 * for (Iterator<WebElement> iterator = featuredProducts.iterator();
		 * iterator.hasNext();) { WebElement webElement = iterator.next(); if
		 * (webElement.findElement(By.xpath("div[@class='caption']/h4/a")).getText().
		 * contains(expectedProduct)) { webElement.click(); break; } }
		 */
		//return new ProductDetailsPage(driver);
		
		for (WebElement webElement : featuredProducts) {
			if (webElement.findElement(By.xpath("div[@class='caption']/h4/a")).getText().contains(expectedProduct)) {
				System.out.println(webElement.findElement(By.xpath("div[@class='caption']/h4/a")).getText());
				webElement.findElement(By.xpath("div[@class='caption']/h4/a")).click();
				break;
			}
		}
		return new ProductDetailsPage(driver);
	}
	


}
