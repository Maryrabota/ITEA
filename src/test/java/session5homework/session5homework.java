package session5homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.testng.Assert;
import static org.junit.Assert.*; //не подтягивался никак
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class session5homework {
    private WebDriver driver;


    @Before
    public void setUp() {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://itea.ua/uk/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void Test() {
        //System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        driver.findElement(By.linkText("Дитячі курси")).click();
        String Title = driver.getTitle();
        Assert.assertEquals(Title, "Комп'ютерні курси для дітей в Києві, курси програмування для дітей ITEAKiDS");
        System.out.println("Test passed");
    }
}