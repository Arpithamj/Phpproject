package Automationtest.phptravelsproject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class toursearch extends Launch{
	static By cookies=By.xpath("//button[@id='cookyGotItBtn']");
	static By toursbutton=By.xpath("//div[@id='body-section']//li[3]//a[1]");
	static By tourfield=By.xpath("//span[contains(text(),'Search by Listing or City Name')]");
	static By tour=By.xpath("//div[@id='s2id_autogen3']//a[@class='select2-choice select2-default']");
	static By tournames=By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/ul/li[1]/div");
	static By deptdate=By.xpath("//div[@id='tchkin']//input[@placeholder='Check in']");
	static By guest=By.xpath("//select[@id='adults']");
	static By type=By.xpath("//select[@id='tourtype']");
	static By typetour=By.xpath("//option[contains(text(),'Couples')]");
	//static By typetour1=By.xpath("//option[contains(text(),'couples')]");
	static By search=By.xpath("//div[@class='col-md-2 form-group go-right col-xs-12 search-button']//button[@class='btn-primary btn btn-lg btn-block pfb0 loader'][contains(text(),'Search')]");
	public static void Tours() throws InterruptedException
	{
		driver.findElement(toursbutton).click();
		//driver.findElement(cookies).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		driver.findElement(tourfield).click();
		driver.findElement(tour).sendKeys(prop.getProperty("tourname"));
		driver.findElement(tour).sendKeys(Keys.DOWN);
		driver.findElement(tournames).click();
		//date
		driver.findElement(deptdate).click();
		while(true) {
			String str1=driver.findElement(By.xpath("//div[11]//div[1]//tr[1]//th[2]")).getText();
			if(str1.equals(prop.getProperty("tmon"))) 
			{
				break;
				}
			else
			{
				driver.findElement(By.xpath("//div[11]//div[1]//tr[1]//th[3]")).click();
				
			
			}
			
		}
		driver.findElement(By.xpath("//div[11]//tr//td[contains(text(),"+prop.getProperty("tday")+")]")).click();;
		
		driver.findElement(guest).click();
		driver.findElement(By.xpath("//select[@id='adults']//option[4]")).click();
		
		//select
		driver.findElement(type).click();
		driver.findElement(typetour).click();
		
		//search
		driver.findElement(search).click();
		
	}
	
	/*public static void main(String[] args) throws IOException,  {
		//TODO Auto-generated method stub
		Launchbrowser();
		Tours();
	}*/

}
