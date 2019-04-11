package calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Calculator 
{
	WebDriver driver;

		@Test(priority = 1)
		public void OpenUrl() throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://web2.0calc.com/");
			Thread.sleep(4000);
			Assert.assertTrue(driver.getTitle().contains("scientific"));
			System.out.println("URl open successfully");
		}
		
		@Test(priority = 2)
		public void multiplication() throws InterruptedException
		{
			driver.findElement(By.id("Btn4")).click();
			driver.findElement(By.id("Btn2")).click();
			driver.findElement(By.id("Btn3")).click();
			driver.findElement(By.id("BtnMult")).click();
			driver.findElement(By.id("Btn5")).click();
			driver.findElement(By.id("Btn2")).click();
			driver.findElement(By.id("Btn5")).click();
			driver.findElement(By.id("BtnCalc")).click();
			Thread.sleep(4000);
		}
		
		@Test(priority = 3)
		public void Division() throws InterruptedException
		{
			driver.findElement(By.id("Btn4")).click();
			driver.findElement(By.id("Btn0")).click();
			driver.findElement(By.id("Btn0")).click();
			driver.findElement(By.id("Btn0")).click();
			driver.findElement(By.id("BtnDiv")).click();
			driver.findElement(By.id("Btn2")).click();
			driver.findElement(By.id("Btn0")).click();
			driver.findElement(By.id("Btn0")).click();
			driver.findElement(By.id("BtnCalc")).click();
			Thread.sleep(4000);
	
		}
		
		@Test(priority = 4)
		public void Addition() throws InterruptedException
		{
			driver.findElement(By.id("BtnMinus")).click();
			driver.findElement(By.id("Btn2")).click();
			driver.findElement(By.id("Btn3")).click();
			driver.findElement(By.id("Btn4")).click();
			driver.findElement(By.id("Btn2")).click();
			driver.findElement(By.id("Btn3")).click();
			driver.findElement(By.id("Btn4")).click();
			driver.findElement(By.id("BtnPlus")).click();
			driver.findElement(By.id("Btn3")).click();
			driver.findElement(By.id("Btn4")).click();
			driver.findElement(By.id("Btn5")).click();
			driver.findElement(By.id("Btn3")).click();
			driver.findElement(By.id("Btn4")).click();
			driver.findElement(By.id("Btn5")).click();
			driver.findElement(By.id("BtnCalc")).click();
			Thread.sleep(4000);
		}
		
		
		@Test(priority = 5)
		public void Substraction() throws InterruptedException
		{
			driver.findElement(By.id("Btn2")).click();
			driver.findElement(By.id("Btn3")).click();
			driver.findElement(By.id("Btn4")).click();
			driver.findElement(By.id("Btn8")).click();
			driver.findElement(By.id("Btn2")).click();
			driver.findElement(By.id("Btn3")).click();
			driver.findElement(By.id("BtnMinus")).click();
			driver.findElement(By.id("BtnParanL")).click();
			driver.findElement(By.id("BtnMinus")).click();
			driver.findElement(By.id("Btn2")).click();
			driver.findElement(By.id("Btn3")).click();
			driver.findElement(By.id("Btn0")).click();
			driver.findElement(By.id("Btn9")).click();
			driver.findElement(By.id("Btn4")).click();
			driver.findElement(By.id("Btn8")).click();
			driver.findElement(By.id("Btn2")).click();
			driver.findElement(By.id("Btn3")).click();
			driver.findElement(By.id("BtnParanR")).click();
			driver.findElement(By.id("BtnCalc")).click();
			Thread.sleep(4000);
		}
		@AfterMethod
		public void clearbtn() {
			driver.findElement(By.id("BtnClear")).click();
	}
		
		
		@AfterClass
		public void close()
		{
			driver.close();
		}

}
