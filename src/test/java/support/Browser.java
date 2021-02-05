package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browser {

    static WebDriver driver;

    public static WebDriver StartBrowser(String browsername , String url)
    {
        //Firefox
        if(browsername.equalsIgnoreCase("Firefox"))
        {
            // Set the path for geckodriver.exe
            System.setProperty("webdriver.gecko.driver", "C://webdriver//geckodriver.exe");
            driver = new FirefoxDriver();
        }

        // Chrome
        else if(browsername.equalsIgnoreCase("Chrome"))
        {

            System.setProperty("webdriver.chrome.driver", "C://webdriver//chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
}
