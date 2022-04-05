package com.geekbrains.lesson_6.Homework_6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.hasText;

public class AutomationPractiseTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
    }

    @Test
    void addToCartTest() throws InterruptedException {
        driver.get("http://automationpractice.com");
        new MainPage(driver)
                .clickSingInButton()
                .login("dfw87367@mzico.com", "qwertyasdfG")
                .hoverWomenButton()
                .tShirtsButtonClick()
                .selectSizeInFilter("S")
                .hoverAndClickAddToCartProductByName("Faded Short")
                .checkSuccessWithSum("$16.51");
    }

    @Test
    void summaryInfoIsOk() throws InterruptedException {
        driver.get("http://automationpractice.com");
        new MainPage(driver)
                .clickSingInButton()
                .login("dfw87367@mzico.com", "qwertyasdfG")
                .hoverWomenButton()
                .tShirtsButtonClick()
                .selectSizeInFilter("S")
                .hoverAndClickAddToCartProductByName("Faded Short")
                .clickProceedCheckoutButton()
                .clickCheckoutButton_1()
                .clickCheckoutButton_3()
                .clickCheckbox()
                .clickCheckoutButton_4()
                .clickPayByBankWire()
                .clickConfirmOrderButton();

        Assertions.assertAll(
                () -> assertThat(driver.findElement(By.xpath("//h1[.='Order confirmation']")), hasText("ORDER CONFIRMATION")),
                () -> assertThat(driver.findElement(By.xpath("//span[@class='price']")), hasText("$19.25"))
        );
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
