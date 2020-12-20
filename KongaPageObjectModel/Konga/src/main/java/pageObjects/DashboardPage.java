package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DashboardPage {
    //Create a WebDriver
    private WebDriver driver;

    //Create a constructor
    public DashboardPage(WebDriver driver) {   this.driver = driver;}
    //locate elements
    private By ComputersAndAccessories = By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[3]/div/a[2]");
    private By Macbook = By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/div[1]/div/div/div/div[1]/a[6]");
    private By MyAccount = By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/nav/div[2]/div/div[3]/div[2]/div/a/span");
    private By logout = By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/nav/div[2]/div/div[3]/div[2]/div/ul/li[7]/a");

    //Functions meant to interact with the element
    public void clickMyAccount()   throws InterruptedException{
        //wait for 10 sec before execution
        Thread.sleep(20000);
        driver.findElement(MyAccount).click();
    }
    public LoginPage clickLogout() throws  InterruptedException{
        //make a 3 sec wait.
        Thread.sleep(3000);
        driver.findElement(logout).click();
        return new LoginPage(driver);
    }
}

