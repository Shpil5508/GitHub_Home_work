package com.geekbrains.lesson_6.Homework_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class N5_PaymantPage extends BaseView{
    public N5_PaymantPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='bankwire']")
    private WebElement payByBankWire;

    public N6_OrderSummery clickPayByBankWire() {
        payByBankWire.click();
        return new N6_OrderSummery(driver);
    }
}
