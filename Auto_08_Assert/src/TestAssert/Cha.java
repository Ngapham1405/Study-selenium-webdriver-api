package TestAssert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Cha {
    public WebDriver driver=null;
    @BeforeClass
    public void beforeBaseClass() {
    	System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\AP\\Downloads\\Program\\Automation testing\\chromedriver_win32\\chromedriver.exe");
				  driver=new ChromeDriver();
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  driver.manage().window().maximize();    
}

    @AfterClass
    public void afterBaseClass() {
        driver.quit();
    }

}