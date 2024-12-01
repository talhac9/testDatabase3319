package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testModifyPatient {

    static WebDriver driver;

    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        driver.get("https://cs3319.gaul.csd.uwo.ca/vm260/tchaud/asg3/tchaud/changeweight.php");
        driver.manage().window().maximize();
    }

    @Test
    public void testUpdateWeight() {
        WebElement ohip = driver.findElement(By.name("ohip"));
        WebElement weight = driver.findElement(By.name("weight"));
        WebElement unit = driver.findElement(By.id("kg"));

        ohip.sendKeys("999999999");
        weight.sendKeys("56");
        unit.click();

        driver.findElement(By.xpath("/html/body/form/input[5]")).click();

        WebDriver list = new ChromeDriver();
        list.get("https://cs3319.gaul.csd.uwo.ca/vm260/tchaud/asg3/tchaud/listpatients.php");
        list.manage().window().maximize();

    }

}
