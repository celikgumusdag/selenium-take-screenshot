import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.io.File;

import org.apache.commons.io.FileUtils;

import java.io.IOException;

/**
 * Created by celik.gumusdag
 */
public class TakeScreenshot {

    private WebDriver driver;

    @Test
    public void test() {

        driver.get("http://www.google.com/");
        driver.manage().window().maximize();
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(scrFile, new File("tmp\\screenshot.png"));
        } catch (IOException e) {
            System.out.print("Error while taking screenshot: " + e);
        }
    }

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
