import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class JenkinsDemo
{
    private static String Base_Url = "https://www.facebook.com";
    private WebDriver driver;

    @Before
    public void setUp() 
    {
        driver = new ChromeDriver();
        driver.get(Base_Url);
    }

    @After
    public void after()
    {
        driver.quit();
    }
/*
    @Test
    public void testCasePassed()
    {
//         Assert.assertTrue(driver.findElement(By.xpath("//form[@id='u_0_g']")).isDisplayed());
         Assert.assertTrue( driver.findElement(By.xpath("//button[text()='Sign in']")).isDisplayed());
        
    }
*/
    @Test
    public void testCaseFailed()
    {
        //Assert.assertTrue(driver.findElement(By.xpath("//form[@id='failed case']")).isDisplayed());
        
        driver.get("https://www.linkedin.com/login");
        
        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
        
        username.sendKeys("example@gmail.com");
        password.sendKeys("password");
        login.click();
        
        String actualUrl="https://www.linkedin.com/feed/";
        String expectedUrl= driver.getCurrentUrl();
        
        Assert.assertEquals(expectedUrl,actualUrl);
        
    }
/*
    @Ignore
    @Test
    public void testCaseIgnored()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//form[@id='ignored case']")).isDisplayed());
    }
    */
}
