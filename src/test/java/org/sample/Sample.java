package org.sample;

import org.libglobal.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass{
	public static void main(String[] args) {
		LaunchBrowser();
		LaunchUrl("https://en-gb.facebook.com/");
		title();
		WebElement username=driver.findElement(By.id("email"));
		sendValue(username,"karupusamy5678@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		sendValue (pass,"1241673246");
		WebElement btn = driver.findElement(By.name("login"));
		text(btn);
		buttonclk(btn);
		
	}
}
