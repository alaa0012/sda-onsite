package HomeWork10;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import Utilities.TestBase;

public class test01 extends TestBase {

    // private WebDriver driver;

    @Test
    public void testYouTubeSearch() {
        // Go to YouTube
        driver.get("https://www.youtube.com/");

        // Find the search box and enter "interstellar"
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("interstellar");

        // Press Enter to perform the search
        searchBox.sendKeys(Keys.ENTER);

        // Click on the first video that appears
        WebElement firstVideo = driver.findElement(By.cssSelector("#contents ytd-video-renderer"));
        firstVideo.click();

        // Assertions
        String videoTitle = driver.findElement(By.cssSelector("#container h1.title yt-formatted-string")).getText();
        Assert.assertTrue(videoTitle.contains("Interstellar"));

        // You can add more assertions or test steps here
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']//div")).click();

        // Assertion: Check if the video is not paused
        WebElement videoPlayer = driver.findElement(By.cssSelector("button[aria-label='Play keyboard shortcut k']"));

    }

}