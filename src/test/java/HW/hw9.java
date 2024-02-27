package HW;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw9 {
    static WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void findHome() {
        WebElement homeButton = driver.findElement(By.tagName("a"));
        homeButton.click();
        WebElement homeButton2 = driver.findElement(By.linkText("Home"));
        homeButton2.click();
        WebElement homeButton3 = driver.findElement(By.xpath("//*[@class='fa fa-home']"));
        homeButton3.click();
    }

    @Test
    public void findProducts() {
        WebElement productButton = driver.findElement(By.xpath("//i[@class='material-icons card_travel']"));
        productButton.click();
    }

    @Test
    public void findCart() {
        WebElement cartButton = driver.findElement(By.linkText("Cart"));
        cartButton.click();
        WebElement cartButton2 = driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[1]"));
        cartButton2.click();
    }

    @Test
    public void findSignLogin(){
        WebElement signLoginButton = driver.findElement(By.linkText("Signup / Login"));
        signLoginButton.click();
        WebElement signButton = driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
        signButton.click();
    }
}
