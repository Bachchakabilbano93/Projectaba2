package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonRun {
	
	static amazonPOM run;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		run = new amazonPOM(driver);
		
		run.LoginAbir();
		
		
		

	}

}
