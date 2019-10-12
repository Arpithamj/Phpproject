package Automationtest.phptravelsproject;

import java.io.IOException;

import org.openqa.selenium.By;

public class Registration extends Homepage {

	static By firstname=By.xpath("//input[@placeholder='First Name']");
	static By lastname=By.xpath("//input[@placeholder='Last Name']");
	static By mobilenum=By.xpath("//input[@placeholder='Mobile Number']");
	static By email=By.xpath("//input[@placeholder='Email']");
	static By password=By.xpath("//input[@placeholder='Password']");
	static By confirmpassword=By.xpath("//input[@placeholder='Confirm Password']");
	static By cookies=By.xpath("//button[@id='cookyGotItBtn']");
	static By signupbutton=By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
	
	
	public static void registrationpage() {
		driver.findElement(firstname).sendKeys(prop.getProperty("firstname"));
		driver.findElement(lastname).sendKeys(prop.getProperty("lastname"));
		driver.findElement(mobilenum).sendKeys(prop.getProperty("mobilenum"));
		driver.findElement(email).sendKeys(prop.getProperty("email"));
		driver.findElement(password).sendKeys(prop.getProperty("password"));
		driver.findElement(confirmpassword).sendKeys(prop.getProperty("confirmpassword"));
		driver.findElement(cookies).click();
		driver.findElement(signupbutton).click();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        Launchbrowser();
        SignUp();
		registrationpage();
	}

}
