package day02;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02BeforeClassAfterClassAnnotation {
    static WebDriver driver;

    @BeforeClass
    public static void beforeClass(){
        driver = new ChromeDriver();
        System.out.println("Before class method is executed...");
    }

    @AfterClass
    public static void afterClass(){
        driver.quit();
        System.out.println("After Class method is executed...");
    }
}