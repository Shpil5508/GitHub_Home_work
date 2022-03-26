package com.geekbrains.lesson_3.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class HomeWork_3A {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notificatons");
        chromeOptions.addArguments("--start-maximized");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://automationpractice.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.id("email")).sendKeys("dfw87367@mzico.com");
        driver.findElement(By.id("passwd")).sendKeys("qwertyasdfG");
        driver.findElement(By.id("SubmitLogin")).click();

        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.xpath("(//li/a[@title='Dresses'])[2]")).click();

        driver.findElement(By.id("selectProductSort")).click();
        driver.findElement(By.xpath("//option[.='Price: Lowest first']")).click();

        driver.findElement(By.xpath("(//div[@class='product-container']//a[@title='Printed Chiffon Dress'])[2]")).click();

        driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
        driver.findElement(By.id("color_15")).click();
        driver.findElement(By.xpath("//button[@name='Submit']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[@title='Close window']")).click();

        driver.findElement(By.xpath("//div[@class='breadcrumb clearfix']//a[@title='Dresses']")).click();

        driver.findElement(By.id("selectProductSort")).click();
        driver.findElement(By.xpath("//option[.='Reference: Highest first']")).click();

        driver.findElement(By.xpath("(//div[@class='right-block']//a[@title='Printed Dress'])[1]")).click();
        driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
        driver.findElement(By.xpath("//button[@name='Submit']")).click();

        driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
        driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='processAddress']")).click();

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.name("processCarrier")).click();

        driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
        driver.findElement(By.xpath("//span[.='I confirm my order']")).click();

        Thread.sleep(5000);
        driver.quit();





    }
}
