package pages;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	// When you don't define who will test first?
	// It follow the name alphabetically

	// If enabled is true, the test case will run
	// If enabled is false, the test case will not run

	@Test(enabled = false)
	public void logoTest() throws InterruptedException {
		homePage.logoDisplayed();
		Thread.sleep(3000);
	}

	@Test(enabled = false)
	public void allButtonTest() throws InterruptedException {
		homePage.allClicked();

	}

	@Test(enabled = false)
	public void addressTest() throws InterruptedException {
		homePage.addressField();
	}

	@Test(enabled = false)
	public void searchTest() throws InterruptedException {
		homePage.searchButton();
	}

	@Test(enabled = false)
	public void cartTest() throws InterruptedException {
		homePage.cartButton();
	}

	// LOGO TEST

	@Test(enabled = false)
	public void logoTestclic() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']")).click();
	}

	@Test(enabled = true)
	public void logoTestclic02() throws InterruptedException {
		driver.findElement(By.id("nav-logo-sprites")).click();
	}
	

	

		
	}
	
	
	
	
	
	
	
