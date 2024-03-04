package day09;
import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//*Go to URL: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
//Fill in capitals by country.*//
public class test extends TestBase {

    @Test
    public void test1() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");


        WebElement seolE = driver.findElement(By.id("box5"));
        WebElement romeE = driver.findElement(By.id("box6"));
        WebElement korea = driver.findElement(By.id("box105"));
        WebElement italy = driver.findElement(By.id("box106"));


        Actions actions = new Actions(driver);
        actions.dragAndDrop(seolE, korea)
                .dragAndDrop(romeE, italy).perform();


    }
}