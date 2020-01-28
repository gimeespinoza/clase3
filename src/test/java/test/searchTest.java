package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class searchTest {
	@Test
	public void searchByDress() {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/");
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
		try {
			Thread.sleep(2000);}
		catch (InterruptedException e) {
			e.printStackTrace();}
		
		Select order = new Select(driver.findElement(By.id("selectProductSort")));
		order.selectByValue("price:asc");
		try {
			Thread.sleep(5000);}
		catch (InterruptedException e) {
			e.printStackTrace();}
	
		driver.findElement(By.id("list")).click();
		driver.findElement(By.xpath("//*[@id=\"color_20\"]")).click();
		System.out.print("El vestido es Azul");
		}
	}

	

