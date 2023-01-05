package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {

	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Quantox\\Desktop\\novaSeleniumputanja\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("test");
	}*/
	
	@Test()
	public void test1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Quantox\\Desktop\\novaSeleniumputanja\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("test");
	}

}
