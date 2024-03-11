package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class task01 extends TestBase {
    @Test
    public void test() {
//    Go to URL: http://demo.guru99.com/test/web-table-element.php
        driver.get("http://demo.guru99.com/test/web-table-element.php");

//    To find third row of table
        WebElement thirdRow = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]"));
        System.out.println("thirdRow = " + thirdRow.getText());

//    To get 3rd row's 2nd column data
        WebElement thirdRowSecondData = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[2]"));
        //WebElement thirdRowSecondData = driver.findElement(By.xpath("//td[2]"));
        System.out.println("thirdRowSecondData = " + thirdRowSecondData.getText());
//
////    Get all the values of a Dynamic Table
//    // Find the table element
//        WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
//
//    // Get all the rows of the table
//        List<WebElement> rows = table.findElements(By.tagName("tr"));
//
//    // Iterate through each row
//        for (WebElement row : rows) {
//            // Get all the columns of the row
//            List<WebElement> columns = row.findElements(By.tagName("td"));
//
//            // Iterate through each column and retrieve the data
//            for (WebElement column : columns) {
//                String data = column.getText();
//                System.out.print(data + " ");
//            }
//            System.out.println();
//        }




        // ---------------------------------
        WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));

        List <WebElement> rows = table.findElements(By.tagName("tr"));
        int n = rows.size();
        for (int row = 0; row < n ; row++) {

            List<WebElement> columns = rows.get(row).findElements(By.tagName("td"));

            for (int col = 0; col < columns.size(); col++) {
                String data = columns.get(col).getText();
                System.out.print(data + " ");
            }
            System.out.println();
        }

    }



}
