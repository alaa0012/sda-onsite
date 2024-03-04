package HomeWork07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Utilities.TestBase;

public class Challenge extends TestBase {
    @Test
    public void test() {
        driver.get("https://clarusway.getlearnworlds.com/sda-test-registration-form");

        // Switch to the iframe by identifying it using its unique attributes
        driver.switchTo().frame(0);

        // Fill the first name
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@elname='First']"));
        firstNameInput.sendKeys("Alaa");

        // Fill the last name
        WebElement lastNameInput = driver.findElement(By.xpath("//input[@elname='Last']"));
        lastNameInput.sendKeys("Ibrahim");

        // Check the radio button
        WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
        radio.click();

        // Drop down Selection
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='Dropdown-arialabel']"));
        Select select = new Select(dropdown);
        select.selectByIndex(1);

        // Check boxes
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='Checkbox_1']"));
        WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='Checkbox_3']"));
        checkbox1.click();
        checkbox3.click();

        // Rating
        WebElement star3 = driver.findElement(By.xpath("//div[@aria-label='3 Star']"));
        star3.click();

        // Submit button
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        // Assertions
        Assert.assertEquals("Danah", firstNameInput.getAttribute("value"));
        Assert.assertEquals("Almasaud", lastNameInput.getAttribute("value"));
        Assert.assertTrue("Second Choice".equals(select.getFirstSelectedOption().getText()));
        Assert.assertTrue(checkbox1.isSelected());
        Assert.assertFalse(checkbox3.isSelected());
        Assert.assertTrue(star3.getAttribute("class").contains("active"));
    }
}