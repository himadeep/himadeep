import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class google {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http//:google.com");
		Sleeper.sleepTightInSeconds(5);
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scr, new File("google") );	
		} catch (Exception e) {
			
		}

	}

}
