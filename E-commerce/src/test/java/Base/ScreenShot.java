package Base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

public class ScreenShot extends Test11{

	public void AutoScreenShot(ITestResult result) {
		if(ITestResult.FAILURE ==result.getStatus()) {
			TakesScreenshot tsh= (TakesScreenshot)driver;
			File src= tsh.getScreenshotAs(OutputType.FILE);
			File dist= new File(""+result.getName()+"_"+".jpg");
			
			try {
				FileUtils.copyFile(src, dist);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
