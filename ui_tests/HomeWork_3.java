package com.geekbrains.lesson_3.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Random;
import java.time.Duration;

public class HomeWork_3 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notificatons");
        chromeOptions.addArguments("--start-maximized");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://automationpractice.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //Авторизация через Cookie не получалась, по-этому пришлось делать через ввод логина и пароля.
        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.id("email")).sendKeys("dfw87367@mzico.com");
        driver.findElement(By.id("passwd")).sendKeys("qwertyasdfG");
        driver.findElement(By.id("SubmitLogin")).click();

        driver.get("http://automationpractice.com/index.php");

        driver.findElement(By.xpath("(//img[@title='Printed Dress'])[1]")).click();
        driver.findElement(By.xpath("//span[.='Add to cart']")).click();
        driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
        driver.findElement(By.xpath("//span[.='Proceed to checkout']")).click();

        String randomText = "Random some text " + new Random().nextInt(1000);
        driver.findElement(By.xpath("//textarea[@NAME='message']")).sendKeys(randomText);
        driver.findElement(By.name("processAddress")).click();

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.name("processCarrier")).click();

        driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
        driver.findElement(By.xpath("//span[.='I confirm my order']")).click();

        Thread.sleep(5000);
        driver.quit();


    }
}
