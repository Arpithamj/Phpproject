package Automationtest.phptravelsproject;

import java.io.IOException;

import org.openqa.selenium.By;

public class Homepage extends Launch{
	static By MyAccount=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	static By SignUp=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
    static By Login=By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
public static void SignUp() {
	driver.findElement(MyAccount).click();
	driver.findElement(SignUp).click();
}
public static void login() {
	driver.findElement(MyAccount).click();
	driver.findElement(Login).click();
}
public static void main(String args[]) throws IOException
{
	//Launchbrowser();
	//SignUp();
	//login();
}

}
                                      