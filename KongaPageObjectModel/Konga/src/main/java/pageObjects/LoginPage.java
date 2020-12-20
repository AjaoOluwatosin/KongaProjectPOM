package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage {
    //Create a WebDriver
    private WebDriver driver;

    public LoginPage (WebDriver driver)
    {
        this.driver = driver;
    }
    //Locate element using By
    private By username = By.id("username");

    public void enterUsername(String uName)
    {
        //search for the username element and enter the username
        driver.findElement(username).sendKeys(uName);
    }
    public void enterUserPassword (String pwd)
    {
//search for the username element and enter the username
        WebElement passwordField = driver.findElement(By.id("password"));
    }
    public DashboardPage clickLoginBtn()
    {
//Click on the login button and get redirected to the Dashboard page
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/section/section/aside/div[2]/div/form/div[3]/button"));
        return new DashboardPage (driver);
    }

}


