package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testAddPatient {

    static WebDriver driver;

    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        driver.get("https://cs3319.gaul.csd.uwo.ca/vm260/tchaud/asg3/tchaud/insertpatient.php");
        driver.manage().window().maximize();
    }

    @Test
    public void testingAddPatient() {

        WebElement firstName = driver.findElement(By.name("firstname"));
        WebElement lastName = driver.findElement(By.name("lastname"));
        WebElement ohip = driver.findElement(By.name("ohip"));
        WebElement weight = driver.findElement(By.name("weight"));
        WebElement height = driver.findElement(By.name("height"));
        WebElement birthDate = driver.findElement(By.name("birthdate"));
        Select selectDoctor = new Select(driver.findElement(By.name("doctor_id")));

        firstName.sendKeys("John");
        lastName.sendKeys("Cena");
        ohip.sendKeys("421342");
        weight.sendKeys("104");
        height.sendKeys("1.82");
        birthDate.sendKeys("1980-01-01");
        selectDoctor.selectByValue("2323");

        driver.findElement(By.tagName("button")).click();

        WebDriver list = new ChromeDriver();
        list.get("https://cs3319.gaul.csd.uwo.ca/vm260/tchaud/asg3/tchaud/listpatients.php");
        list.manage().window().maximize();
    }
}
