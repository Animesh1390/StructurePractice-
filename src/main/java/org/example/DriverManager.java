package org.example;

// importing a package of chromeDriver
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

// extends shows inheritance concept that DriverManger(child class) and Utils (Parent class)
public class DriverManager extends Utils
{
    public static final String USERNAME = LoadProp.getProperty("BROWSERSTACK_USERNAME");
    public static final String AUTOMATE_KEY = LoadProp.getProperty("BROWSERSTACK_ACCESS_KEY");
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    String browserName = LoadProp.getProperty("Browser");
    //    String browserName = System.getProperty("Browser");
    boolean runIncloud = Boolean.parseBoolean(LoadProp.getProperty("cloud"));
    MutableCapabilities capabilities = new MutableCapabilities();





  //  String browserName = LoadProp.getProperty("Browser");

    public void openBrowser(){

        //run in Cloud ==========================================================================================
        if (runIncloud)
        {
            System.out.println("Running in the Cloud");
            //connect to cloud

            if (browserName.equalsIgnoreCase("Edge")) {
                ///connect with browserstack
                capabilities.setCapability("browserName", "Edge");
                capabilities.setCapability("browserVersion", "106.0");
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("os", "Windows");
                browserstackOptions.put("osVersion", "10");
                browserstackOptions.put("local", "false");
                browserstackOptions.put("seleniumVersion", "4.1.0");


                capabilities.setCapability("bstack:options", browserstackOptions);

            } else if (browserName.equalsIgnoreCase("Firefox"))
            {
                ///connect with browserstack
                capabilities.setCapability("browserName", "firefox");
                capabilities.setCapability("browserVersion", "106.0");
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("os", "Windows");
                browserstackOptions.put("osVersion", "11");
                browserstackOptions.put("local", "false");
                browserstackOptions.put("seleniumVersion", "4.1.0");
                capabilities.setCapability("bstack:options", browserstackOptions);

            }  else if (browserName.equalsIgnoreCase("Chrome"))
            {
                ///connect with browserstack
                capabilities.setCapability("browserName", "Chrome");
                capabilities.setCapability("browserVersion", "107.0");
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("os", "Windows");
                browserstackOptions.put("osVersion", "11");
                browserstackOptions.put("local", "false");
                browserstackOptions.put("seleniumVersion", "4.1.0");
                capabilities.setCapability("bstack:options", browserstackOptions);
            }

            else {
                System.out.println("Your browser name is wrong or missing implementation:" + browserName);
            }
            try {
                driver = new RemoteWebDriver(new URL(URL), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }


        }
        else
        {
            System.out.println("Running Locally");
            //run in locally

            if (browserName.equalsIgnoreCase("Chrome")) {

                System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
                driver = new ChromeDriver();
            }
            else if (browserName.equalsIgnoreCase("Firefox")){
                System.setProperty("webdriver.gecko.driver", "src/test/java/Drivers/geckodriver.exe");
                driver = new FirefoxDriver();

            }else if (browserName.equalsIgnoreCase("Edge")){
                System.setProperty("webdriver.edge.driver", "src/test/java/Drivers/msedgedriver.exe");
                driver = new EdgeDriver();
            }
            else{
                System.out.println("Your browser");
            }



        }




        //set application URL to navigate
        driver.get(LoadProp.getProperty("url"));

        // To maximize a browser window

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        // Global Wait to load website
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        //Global Wait for all the Webelement
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }
    // creating method for close browser
    public void closeBrowser() {
        driver.quit();
    }
}
