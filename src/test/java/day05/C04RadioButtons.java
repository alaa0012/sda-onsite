package day05;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C04RadioButtons {
    /*
    Go to URL:  https://www.facebook.com/
    Click on Create an Account button.
    Then click on the radio buttons.
     */
    @Test
    public void radButtonTest(){
        WebDriver driver= new ChromeDriver();
        //Go to URL:  https://www.facebook.com/
        driver.get("https://www.facebook.com/");

        //Click on Create an Account button.
        driver.findElement(By.xpath("//*[starts-with(@id,'u_0_0_')]")).click();
        //Then click on the radio buttons.
        List<WebElement> radButtons=driver.findElements(By.xpath("//*[@class='_5k_2 _5dba']"));

    }
}