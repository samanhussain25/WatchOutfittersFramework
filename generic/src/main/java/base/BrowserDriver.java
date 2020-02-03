package base;

import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;



public class BrowserDriver {
    public static WebDriver driver = null;




    public static String os = System.getProperty("os", "windows");

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\IdeaProjects\\EbayTest\\generic\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // 20
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS); //35
        driver.manage().window().maximize();
        driver.get(url);

    }

    @AfterMethod
    public void closeOut() {
        //driver.manage().deleteAllCookies();
        driver.quit();
    }
}

