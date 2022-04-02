package com.geekbrains.lesson_5.Homework_5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutomationpracticeTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    private final static String BASE_URL = "http://automationpractice.com";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notificatons");
        chromeOptions.addArguments("--start-maximized");

        driver = new ChromeDriver(chromeOptions);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get(BASE_URL);
    }

    @Test
    void authorization() {
        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.id("email")).sendKeys("dfw87367@mzico.com");
        driver.findElement(By.id("passwd")).sendKeys("qwertyasdfG");
        driver.findElement(By.id("SubmitLogin")).click();

        Assertions.assertEquals(driver.findElement(By.xpath("//a[@title='Log me out']")).isDisplayed(), true);
    }

    @Test
    void makeAnOrder() throws InterruptedException {
        driver.findElement(By.xpath("(//img[@title='Printed Dress'])[1]")).click();
        driver.findElement(By.xpath("//span[.='Add to cart']")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Proceed to checkout']")));
        driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
        Assertions.assertEquals(driver.findElement(By.id("cart_title")).isDisplayed(), true);

        driver.findElement(By.xpath("//span[.='Proceed to checkout']")).click();
        Assertions.assertEquals(driver.findElement(By.xpath("//h1[.='Authentication']")).isDisplayed(), true);

        driver.findElement(By.id("email")).sendKeys("dfw87367@mzico.com");
        driver.findElement(By.id("passwd")).sendKeys("qwertyasdfG");
        driver.findElement(By.id("SubmitLogin")).click();
        Assertions.assertEquals(driver.findElement(By.xpath("//h1[.='Addresses']")).isDisplayed(), true);

        driver.findElement(By.xpath("//span[.='Proceed to checkout']")).click();
        Assertions.assertEquals(driver.findElement(By.xpath("//h1[.='Shipping']")).isDisplayed(), true);

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.name("processCarrier")).click();
        Assertions.assertEquals(driver.findElement(By.xpath("//h1[.='Please choose your payment method']")).isDisplayed(), true);

        driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
        Assertions.assertEquals(driver.findElement(By.xpath("//span[.='I confirm my order']")).isDisplayed(), true);

        driver.findElement(By.xpath("//span[.='I confirm my order']")).click();
        Assertions.assertEquals(driver.findElement(By.xpath("//h1[.='Order confirmation']")).isDisplayed(), true);
    }

    @AfterEach
    void tearDown() {
       driver.quit();
    }
}
