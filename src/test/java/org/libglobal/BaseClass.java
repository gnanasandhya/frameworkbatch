package org.libglobal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void LaunchUrl(String Url) {
		driver.get(Url);
		driver.manage().window().maximize();
	}
	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void getUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void close() {
		driver.close();
	}
	public static void sendValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void buttonclk(WebElement element) {
		element.click();
		
	}
	public static void text(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

}
