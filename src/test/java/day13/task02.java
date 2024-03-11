package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilities.TestBase;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class task02 extends TestBase {

    private static final Logger logger = Logger.getLogger(task02.class.getName());

    @Test

    public void testCalculateBMI() {
        driver.get("https://healthunify.com/bmicalculator/");
        // Entering weight
        WebElement weightInput = driver.findElement(By.name("wg"));
        weightInput.sendKeys("70");
        logger.log(Level.INFO, "Entered weight: 70");

        // Selecting kilograms
        WebElement unitDropdown = driver.findElement(By.name("opt1"));
        unitDropdown.sendKeys("kilograms");
        logger.log(Level.INFO, "Selected unit: kilograms");

        // Selecting height in feet
        WebElement heightFeetInput = driver.findElement(By.name("opt2"));
        heightFeetInput.sendKeys("5");
        logger.log(Level.INFO, "Selected height in feet: 5");

        // Selecting height in inches
        WebElement heightInchesInput = driver.findElement(By.name("opt3"));
        heightInchesInput.sendKeys("9");
        logger.log(Level.INFO, "Selected height in inches: 9");

        // Clicking on calculate
        WebElement calculateButton = driver.findElement(By.name("cc"));
        calculateButton.click();
        logger.log(Level.INFO, "Clicked on calculate button");

        // Getting SIUnit value
        WebElement siUnit = driver.findElement(By.name("si"));
        String siValue = siUnit.getAttribute("value");
        logger.log(Level.INFO, "SIUnit value: " + siValue);
        // assertEquals("20.5", siValue);

        // Getting USUnit value
        WebElement usUnit = driver.findElement(By.name("us"));
        String usValue = usUnit.getAttribute("value");
        logger.log(Level.INFO, "USUnit value: " + usValue);
        // assertEquals("3.21", usValue);

        // Getting UKUnit value
        WebElement ukUnit = driver.findElement(By.name("uk"));
        String ukValue = ukUnit.getAttribute("value");
        logger.log(Level.INFO, "UKUnit value: " + ukValue);
        // assertEquals("1.95", ukValue);

        // Getting overall description
        WebElement description = driver.findElement(By.xpath("//input[@name='desc']"));
        String overallDescription = description.getText();
        logger.log(Level.INFO, "Overall description: " + overallDescription);
        // assertEquals("Your category is Normal", overallDescription);
    }

}
