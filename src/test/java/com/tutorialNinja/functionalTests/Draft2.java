package com.tutorialNinja.functionalTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tutorialNinja.pageObjectFactory.HomePageObjects;
import com.tutorialNinja.pageObjectFactory.SearchResultPage;

public class Draft2 extends com.tutorialNinja.base.InitialComponents {
	String productName = "mac";

	@Test
	public void velidateLogoText() {
		HomePageObjects homePage = launchApplicationHomePage();
		Assert.assertEquals("Qafox.com", homePage.getLogoText());
		homePage.setText(productName);
		SearchResultPage searchResultPage = homePage.clickSearchButton();
		// System.out.println(searchResultPage.getSearchedItemText());
		Assert.assertEquals("Search - " + productName, searchResultPage.getSearchedItemText());
	}
	
	@Test
	public void velidateLogoText01() {
		HomePageObjects homePage = launchApplicationHomePage();
		Assert.assertEquals("Qafox.com", homePage.getLogoText());
		homePage.setText(productName);
		SearchResultPage searchResultPage = homePage.clickSearchButton();
		// System.out.println(searchResultPage.getSearchedItemText());
		Assert.assertEquals("Search - " + productName, searchResultPage.getSearchedItemText());
	}
	
	@Test
	public void velidateLogoText02() {
		HomePageObjects homePage = launchApplicationHomePage();
		Assert.assertEquals("Qafox.com", homePage.getLogoText());
		homePage.setText(productName);
		SearchResultPage searchResultPage = homePage.clickSearchButton();
		// System.out.println(searchResultPage.getSearchedItemText());
		Assert.assertEquals("Search - " + productName, searchResultPage.getSearchedItemText());
	}
}
