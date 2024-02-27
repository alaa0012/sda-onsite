package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hw1 {

    //Create main method
    public static void main(String[] args) throws InterruptedException  {
        //Invoke Chrome Driver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navigate to Facebook homepage URL: https://www.facebook.com/
        driver.navigate().to("https://www.facebook.com/");

        //Verify expected URL equals to the actual URL.
        String expectedURL = "https://www.facebook.com/";
        String actualURL = driver.getCurrentUrl();
        if(expectedURL.equals(actualURL)) {
            System.out.println("Expected URL is the same as actual URL.");
        } else {
            System.out.println("Expected URL is not the same as actual URL.");
        }

        // Verify pagesource of Facebook contains "Facebook"
        String pageSource = driver.getPageSource();
        if (pageSource.contains("Facebook")) {
            System.out.println("Page source of Facebook contains 'Facebook'.");
        } else {
            System.out.println("Page source of Facebook does not contain 'Facebook'.");
        }

        // Close the browser
        driver.quit();
    }
}