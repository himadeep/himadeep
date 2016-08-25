import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class calanderoperation {

	public static void main(String[] args) 
	{
	String date="18/november/2017";
	String[] split=date.split("/");
	String month=split[1];
	String year=split[2];
	WebDriver driver=new FirefoxDriver();
	driver.get("http://cleartrip.com");
	Sleeper.sleepTightInSeconds(5);
	driver.findElement(By.id("DepartDate")).click();
	String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
	while (!year.equals(calyear))
	{
		driver.findElement(By.className("nextMonth")).click();
		
		calyear=driver.findElement(By.className("ui-datepicker-month")).getText();
	}
	String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
	while (! month.equals(calmonth)) 
	{
		driver.findElement(By.className("ui-datepicker-month")).click();
	}

	}

}
