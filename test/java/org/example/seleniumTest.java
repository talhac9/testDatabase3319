package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {
    static WebDriver driver;

    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cs3319.gaul.csd.uwo.ca/vm260/tchaud/asg3/tchaud/nurseinfo.php");
    }

    @Test
    public void checkNurseInfo() {
        WebElement nurseName = driver.findElement(By.name("nurseid"));
        nurseName.sendKeys("BBBB2");
        driver.findElement(By.tagName("button")).click();
    }

}
