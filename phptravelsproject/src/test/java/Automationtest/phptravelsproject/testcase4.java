package Automationtest.phptravelsproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class testcase4 extends Registration{
	Launch l1=new Launch();
	toursearch t1=new toursearch();
	
	
	@Test
	public void method() throws IOException, InterruptedException {
		l1.Launchbrowser();
		t1.Tours();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\arpitha\\tours"));
	}

}
