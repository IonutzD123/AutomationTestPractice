package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;



public class Driver {

    public static WebDriver initialize;

    public static WebDriver openBrowser() {
        // Chrome Driver file location
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        // Open the browser
        initialize = new ChromeDriver();

        return initialize;
    }

   public static void closeBrowser() {
        initialize.close();
   }

}
