import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hw7 {
    public static void main(String[] args) throws InterruptedException {
        // Set the path for geckodriver
        System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");

        // Create a new instance of FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Go to the YouTube website
        driver.get("https://www.youtube.com/");

        // Maximize the window
        driver.manage().window().maximize();

        // Verify the page title contains the word "video"
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("video")) {
            System.out.println("Page title contains the word 'video'");
        } else {
            System.out.println("Page title does not contain the word 'video'");
        }

        // Minimize the window
        driver.manage().window().setPosition(new Point(-2000, 0)); // Move the window off-screen

        // Verify the page title contains the word "video"
        pageTitle = driver.getTitle();
        if (pageTitle.contains("video")) {
            System.out.println("Page title contains the word 'video'");
        } else {
            System.out.println("Page title does not contain the word 'video'");
        }

        // Make the page fullscreen
        driver.manage().window().fullscreen();

        // Close the driver
        driver.quit();
    }
}
