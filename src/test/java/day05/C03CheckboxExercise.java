package day05;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03CheckboxExercise {
    /*
    Go to URL: https://demoqa.com/
    Click on Elements.
    Click on Checkbox.
    Verify if Home checkbox is selected.
    Verify that "You have selected" is visible.

     */
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }


    @Test
    public void test(){
        // Go to URL: https://demoqa.com/
        driver.get("https://demoqa.com/");
        // Click on Elements.
        // Click on Checkbox.
        // Verify if Home checkbox is selected.
        // Verify that "You have selected" is visible.


    }
}