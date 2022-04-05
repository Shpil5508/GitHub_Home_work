package com.geekbrains.lesson_6.Homework_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class N3_AddressesPage extends BaseView{
    public N3_AddressesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='Proceed to checkout']")
    private WebElement checkoutButton_3;

    public N4_ShippingPage clickCheckoutButton_3() {
        checkoutButton_3.click();
        return new N4_ShippingPage(driver);
    }
}
