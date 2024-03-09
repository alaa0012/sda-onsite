package HomeWork11;

import java.io.File;
import java.io.IOException;
import Utilities.TestBase;
import org.junit.Test;
import org.junit.Assert;

public class task02 extends TestBase  {

    @Test
    public void test(){

        // Get the path for the desktop directory
        // String separater = System.getProperty("file.separator");
        // String pathOfFile = System.getProperty("user.home")+ separater+"Downloads"+separater+"selenium-snapshot.png";
        // Create a new file
        // File file = new File(filePath);

        // Get the path for the desktop directory
        String desktopPath = System.getProperty("user.home") + "/Desktop/";
        String filePath = desktopPath + "test_file.txt";
        // Create a new file
        File file = new File(filePath);

        try {
            // Create the file on the desktop
            boolean isFileCreated = file.createNewFile();

            // Verify that the file is created successfully
            Assert.assertTrue(isFileCreated);

            // Check if the file exists
            boolean fileExists = file.exists();

            // Verify that the file exists
            Assert.assertTrue(fileExists);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}