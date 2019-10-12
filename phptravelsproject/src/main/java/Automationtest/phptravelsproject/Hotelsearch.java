package Automationtest.phptravelsproject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Hotelsearch extends Launch{
	//static By Homebutton=By.xpath("//li[@class='active text-center']//a[@class='text-center']");
	static By cookies=By.xpath("//*id=\"cookyGotItBtn\"]");
	static By hotelname=By.xpath("//span[.='Search by Hotel or City Name']");
	static By hotelname1=By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");
	static By checkin=By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']");
	static By hotelselect=By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li/div");
	
	
	public static void hotel() throws InterruptedException {
		//driver.findElement(Homebutton).click();
		//driver.findElement(cookies).click();
		driver.findElement(hotelname).click();
		
		driver.findElement(hotelname1).sendKeys(prop.getProperty("hotelname"));
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(hotelselect).click();
		driver.findElement(checkin).click();
		
		//checkin
		while(true) {
			String str=driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[2]")).getText();
			if(str.equals(prop.getProperty("Mon"))) {
				break;
			}else {
				driver.findElement(By.xpath("//div[14]//div[1]//tr[1]//th[3]")).click();
			}
		}
		driver.findElement(By.xpath("//div[14]//tr//td[contains(text(),"+prop.getProperty("day")+")]")).click();
		
		
		//checkout
		while(true) {
			String str=driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[2]")).getText();
			if(str.equals(prop.getProperty("Mon1"))) {
				break;
			}else {
				driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[3]")).click();
				//str=driver.findElement(By.xpath("//div[15]//div[1]//tr[1]//th[2]")).getText();
			}
		}
		driver.findElement(By.xpath("//div[15]//tr//td[contains(text(),"+prop.getProperty("day1")+")]")).click();
		
		//guests
		driver.findElement(By.xpath("//input[@id='htravellersInput']")).click();
		driver.findElement(By.xpath("//button[@id='hadultPlusBtn']")).click();
		driver.findElement(By.xpath("//button[@id='hchildPlusBtn']")).click();
		
		//search
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")).click();
		
	}
	/*public static void main(String[] args) throws IOException, InterruptedException {
		Launchbrowser();
		hotel();
	}*/
	
}
