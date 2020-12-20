package setUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class SetUpTests {
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

        //Locate SignIn Button
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div[3]/div[2]/a")).click();

        //Locate the email field and inspect
        driver.findElement(By.id("username")).sendKeys("ajaotj36@gmail.com");

        //locate and inspect the password field
        driver.findElement(By.id("password")).sendKeys("victoria2077@@@");

        //locate and inspect the Login button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();

        //allow page wait for 5 seconds
        Thread.sleep(10000);

    }

    @Test
    public void testLogout() throws InterruptedException {

        //click on the profile button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div/div[3]/div[2]/div/a/span")).click();

        //click on the logout button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div/div[3]/div[2]/div/ul/li[7]/a")).click();
        //printout response
        if (driver.getCurrentUrl().contains("https://www.konga.com/"))
            System.out.println("Account logged out. Page URL is https://www.konga.com/");
    }

    @AfterTest
    public void closeBrowser()
    {
        //".close" would close the window while ".quit" would exit the session.
        driver.quit();
    }
}



