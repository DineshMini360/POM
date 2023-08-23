package com.adactin.pages;

import com.adactin.locators.LoginPageLocators;
import com.baseclass.utils.BaseClass;

public class LoginPageExecution extends BaseClass{
	public static void loginWithValidUsernameAndPassword() {
		//LoginPageLocators lps = new LoginPageLocators();
		
		browserOpen("chrome");
		loadUrl("https://adactinhotelapp.com/index.php");
		windowMaximize();
		dataSend(new LoginPageLocators().getUser(), "Muthulakshmi1703");
		dataSend(new LoginPageLocators().getPass(), "Test@123");
		//driver.findElement(By.name("username")).sendKeys("Muthulakshmi1703");
		//driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Test@123");
		click(new LoginPageLocators().getLogin());
	}
}
