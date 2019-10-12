package Automationtest.phptravelsproject;

import java.io.IOException;

import org.openqa.selenium.By;

public class Login extends Homepage{
 static By email1=By.xpath("//input[@placeholder='Email']");
 static By password1=By.xpath("//input[@placeholder='Password']");
 static By login=By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
 public static void loginpage()
 {
	 driver.findElement(email1).sendKeys(prop.getProperty("email1"));
	 driver.findElement(password1).sendKeys(prop.getProperty("password1"));
	 driver.findElement(login).click();
 }
 public static void main(String[] args) throws IOException  {
	 Launchbrowser();
	 login();
	 loginpage();
	 
 }
}
