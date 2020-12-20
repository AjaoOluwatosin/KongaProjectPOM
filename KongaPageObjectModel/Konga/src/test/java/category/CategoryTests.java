package category;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;


public class CategoryTests {
    //Create a WebDriver object
    private WebDriver driver;
    //Create a Login Object
    protected LoginPage loginPage;

    @BeforeClass
    public void setUpTests() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();

        //get page url
        driver.get("https://www.konga.com/");
        Thread.sleep(5000);

        //maximize browser window
        driver.manage().window().maximize();

        //Make page wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    //Assert page title.
    @Test
    void PageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals("title", "title");
    }

    @Test(priority = 0)
    void MyCartTest()
    {
        //Assert Mycart element
        WebElement MyCart = driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div/div[3]/a/span[1]"));
        Assert.assertEquals(MyCart.isDisplayed(),MyCart.isDisplayed());
    }

    @Test(priority = 1)
    void StoreLocator()
    {
        //Assert Store Locator  element
        WebElement StoreLocator = driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div/div[1]/a"));
        Assert.assertEquals(StoreLocator.isDisplayed(),StoreLocator.isDisplayed());
    }

    @Test(priority = 2)
    void Groceries ()
    {
        //Assert Groceries element.
        WebElement Groceries = driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/section/a[3]/picture/img"));
        Assert.assertEquals(Groceries.isDisplayed(),Groceries.isDisplayed());
    }

    @Test(priority = 3)
    void Health()
    {
        //Assert Health element.
        WebElement Health = driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/section/a[1]/picture/img"));
        Assert.assertEquals(Health.isDisplayed(),Health.isDisplayed());
    }

    @Test(priority = 4)
    void Drinks ()
    {
        //Assert Drinks element.
        WebElement Drinks = driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/section/a[2]/picture/img"));
        Assert.assertEquals(Drinks.isDisplayed(),Drinks.isDisplayed());
    }

    @AfterTest
    public void closeBrowser()
    {
        // quit/exit the session.
        driver.quit();
    }
}



